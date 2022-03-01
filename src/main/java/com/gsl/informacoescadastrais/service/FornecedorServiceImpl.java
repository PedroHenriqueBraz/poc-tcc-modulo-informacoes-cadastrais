package com.gsl.informacoescadastrais.service;

import com.gsl.informacoescadastrais.mock.legado.repository.FornecedorRepository;
import com.gsl.informacoescadastrais.model.FornecedorDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorServiceImpl implements FornecedorService{
    private final FornecedorRepository fornecedorRepository;

    public FornecedorServiceImpl(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    @Override
    public FornecedorDTO obterFornecedor(int id) throws Exception {
        var forn = fornecedorRepository.findById(Long.valueOf(id)).orElseThrow(Exception::new);
        var fornecedor = new FornecedorDTO();
        fornecedor.setNomeFornecedor(forn.getNome());
        fornecedor.setCnpj(forn.getCnpj());
        return fornecedor;
    }

    @Override
    public List<FornecedorDTO> obterTodosFornecedores() {
        return fornecedorRepository.findAll().stream().map(c -> {
            var fornecedor = new FornecedorDTO();
            fornecedor.setNomeFornecedor(c.getNome());
            fornecedor.setCnpj(c.getCnpj());
            return fornecedor;
        }).toList();
    }
}
