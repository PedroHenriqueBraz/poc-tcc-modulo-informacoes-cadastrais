package com.gsl.informacoescadastrais.service;

import com.gsl.informacoescadastrais.model.ClienteDTO;
import com.gsl.informacoescadastrais.model.MercadoriaDTO;

import java.util.List;

public interface MercadoriaService {
    MercadoriaDTO obterMercadoria(int id) throws Exception;
    List<MercadoriaDTO> obterMercadorias();
}
