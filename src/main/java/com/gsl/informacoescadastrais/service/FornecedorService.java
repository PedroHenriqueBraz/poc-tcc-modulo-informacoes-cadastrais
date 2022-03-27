package com.gsl.informacoescadastrais.service;

import com.gsl.informacoescadastrais.model.FornecedorDTO;

import java.util.List;

public interface FornecedorService {
    FornecedorDTO obterFornecedor(int id) throws Exception;
    List<FornecedorDTO> obterTodosFornecedores();
}
