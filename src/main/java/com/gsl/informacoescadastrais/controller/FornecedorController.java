package com.gsl.informacoescadastrais.controller;

import com.gsl.informacoescadastrais.model.FornecedorDTO;
import com.gsl.informacoescadastrais.service.FornecedorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
    private final FornecedorService fornecedorService;

    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<FornecedorDTO> obterFornecedorPorId(@PathVariable("id") int id) throws Exception {
        return ResponseEntity.ok(fornecedorService.obterFornecedor(id));
    }

    @GetMapping
    public ResponseEntity<List<FornecedorDTO>> obterFornecedores(){
        return ResponseEntity.ok(fornecedorService.obterTodosFornecedores());
    }
}
