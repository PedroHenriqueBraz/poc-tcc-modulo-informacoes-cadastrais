package com.gsl.informacoescadastrais.service;

import com.gsl.informacoescadastrais.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClienteService {
    Cliente obterCliente(int id);
    List<Cliente> obterTodosClientes();
}
