package com.gsl.informacoescadastrais.service;

import com.gsl.informacoescadastrais.model.Cliente;
import com.gsl.informacoescadastrais.model.Fornecedor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FornecedorServiceImpl implements FornecedorService {

    private List<Fornecedor> fornecedores = new ArrayList<>();

    @Override
    public Fornecedor obterFornecedor(int id) {
        var lista = obterTodosFornecedores();

        return lista.stream().filter(cliente -> cliente.getId()== id).findFirst().get();
    }

    @Override
    public List<Fornecedor> obterTodosFornecedores() {
        var f1  = new Fornecedor();
        f1.setNomeFornecedor("Material Limpeza");
        f1.setCnpj("12254444/001");
        f1.setId(1);
        var f2  = new Fornecedor();
        f2.setNomeFornecedor("Caixas ltda");
        f2.setCnpj("12254444/001");
        f2.setId(2);

        this.fornecedores.add(f1);
        this.fornecedores.add(f2);

        return this.fornecedores;
    }
}
