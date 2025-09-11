package com.senac.aulaFull.controller;

import com.senac.aulaFull.repository.TransacaoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transicao")
@Tag( name = "Controlador de transições", description = "Controlar  os registros de transições")
public class TransicaoController {

    private TransacaoRepository transicaoRepository;




    @GetMapping
    @Operation(summary = "transicao",description = "Consultar todas as transições")
    public ResponseEntity<?> consultarTransicoes(){
        return ResponseEntity.ok(transicaoRepository.findAll());
    }

    @PostMapping
    @Operation(summary = "cadastro de transição",description = "Criar uma nova transição")
    public ResponseEntity<?> criarTransicao (){

        //Implementar a logica
        return null;
    }
    @PutMapping
    @Operation(summary = "atualizar a transição",description = "Atualizar uma transição")
    public ResponseEntity<?> atualizarTransicao(){

        //Implementar a logica
        return null;
    }

    @DeleteMapping
    @Operation(summary = "deletar a transição",description = "Deletar uma transição")
    public ResponseEntity<?> deletarTransicao(){

        //Implementar a logica
        return null ;
    }
}
