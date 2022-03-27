package com.gsl.informacoescadastrais.controller;

import com.gsl.informacoescadastrais.model.ClienteDTO;
import com.gsl.informacoescadastrais.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> obterClientePorId(@PathVariable("id") int id) throws Exception {
        return ResponseEntity.ok(clienteService.obterCliente(id));
    }

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> obterClientes(){
        var clientes = clienteService.obterTodosClientes();
        return ResponseEntity.ok(clientes);
    }

}
