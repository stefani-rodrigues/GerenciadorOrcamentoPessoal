package com.senac.aulaFull.services;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;


@Service
public class TokenService {

    @Value("${spring.secretkey}")
    private String secret;

    @Value("${spring.tempo_expiracao}")
    private Long tempo;

    private  String emissor = "GerenciarOrcamento";

    public String gerarToken (String usario,String senha){

        Algorithm algorithm = Algorithm.HMAC256(secret);

        String token = JWT.create().withIssuer(emissor)
                .withSubject(usario)
                .withExpiresAt(gerarDataExpiracao())
                .sign(algorithm);
       return token;
    }

    private Instant gerarDataExpiracao() {
        var dataAtual = LocalDateTime.now();
        dataAtual = dataAtual.plusMinutes(tempo);

        return dataAtual.toInstant(ZoneOffset.of("-03:00"));
    }
}
