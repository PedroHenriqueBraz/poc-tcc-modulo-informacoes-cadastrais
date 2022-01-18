package com.gsl.informacoescadastrais.service;

import com.gsl.informacoescadastrais.model.Cliente;
import com.gsl.informacoescadastrais.model.Fornecedor;

import java.util.List;

public interface FornecedorService {
    Fornecedor obterFornecedor(int id);
    List<Fornecedor> obterTodosFornecedores();
}
