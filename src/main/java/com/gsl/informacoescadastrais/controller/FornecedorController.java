package com.gsl.informacoescadastrais.controller;

import com.gsl.informacoescadastrais.model.Fornecedor;
import com.gsl.informacoescadastrais.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping("/{id}")
    public ResponseEntity<String> obterFornecedorPorId(@PathVariable("id") int id){
        return ResponseEntity.ok("ok");
    }

    @GetMapping
    public ResponseEntity<List<Fornecedor>> obterFornecedores(){
        return ResponseEntity.ok(fornecedorService.obterTodosFornecedores());
    }
}
