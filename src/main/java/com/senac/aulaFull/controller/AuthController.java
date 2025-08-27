package com.senac.aulaFull.controller;


import com.senac.aulaFull.controller.dto.LoginResquestDto;
import com.senac.aulaFull.services.TokenService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Tag(name= "Autenticação de controller", description = "Camada responsável por autenticar o usuario ")
public class AuthController {

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    @Operation(summary = "Login",description = "Metodo resposavel por efetuar o login do usuario ")
    public ResponseEntity <?> login (@RequestBody LoginResquestDto request){

        var token = tokenService.gerarToken(request.usuario(),request.senha());

        return ResponseEntity.ok(token);
    }

}
