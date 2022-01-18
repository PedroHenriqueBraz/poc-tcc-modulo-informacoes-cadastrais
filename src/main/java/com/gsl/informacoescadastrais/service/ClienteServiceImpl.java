package com.gsl.informacoescadastrais.service;

import com.gsl.informacoescadastrais.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{

    private List<Cliente> clientes = new ArrayList<>();

    public Cliente obterCliente(int id){
        var lista = obterTodosClientes();

        return lista.stream().filter(cliente -> cliente.getId()== id).findFirst().get();
    }

    public List<Cliente> obterTodosClientes(){
       var cliente1  = new Cliente();
       cliente1.setNomeCliente("Atacadão");
       cliente1.setCnpj("12254444/001");
       cliente1.setId(1);
        var cliente2  = new Cliente();
        cliente2.setNomeCliente("Carrefur");
        cliente2.setCnpj("12254444/001");
        cliente2.setId(2);
        var cliente3  = new Cliente();
        cliente3.setNomeCliente("Extra");
        cliente3.setCnpj("12254444/001");
        cliente3.setId(3);
        var cliente4  = new Cliente();
        cliente4.setNomeCliente("Mercadão");
        cliente4.setCnpj("12254444/001");
        cliente4.setId(4);
        var cliente5  = new Cliente();
        cliente5.setNomeCliente("Loja qualquer");
        cliente5.setCnpj("12254444/001");
        cliente5.setId(5);

        this.clientes.add(cliente1);
        this.clientes.add(cliente2);
        this.clientes.add(cliente3);
        this.clientes.add(cliente4);
        this.clientes.add(cliente5);

        return this.clientes;
    }
}
