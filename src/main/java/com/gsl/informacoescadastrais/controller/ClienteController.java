package com.gsl.informacoescadastrais.controller;

import com.gsl.informacoescadastrais.model.Cliente;
import com.gsl.informacoescadastrais.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{id}")
    public ResponseEntity<String> obterClientePorId(@PathVariable("id") int id){
        return ResponseEntity.ok("ok");
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> obterClientes(){
        var clientes = clienteService.obterTodosClientes();
        return ResponseEntity.ok(clientes);
    }

 }
