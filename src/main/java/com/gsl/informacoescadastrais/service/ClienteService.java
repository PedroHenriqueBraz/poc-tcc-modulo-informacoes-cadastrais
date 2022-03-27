package com.gsl.informacoescadastrais.service;

import com.gsl.informacoescadastrais.model.ClienteDTO;

import java.util.List;

public interface ClienteService {
    ClienteDTO obterCliente(int id) throws Exception;
    List<ClienteDTO> obterTodosClientes();
}
