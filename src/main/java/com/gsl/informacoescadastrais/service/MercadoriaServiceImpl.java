package com.gsl.informacoescadastrais.service;

import com.gsl.informacoescadastrais.mock.legado.repository.MercadoriaRepository;
import com.gsl.informacoescadastrais.model.FornecedorDTO;
import com.gsl.informacoescadastrais.model.MercadoriaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MercadoriaServiceImpl implements MercadoriaService {

    private final MercadoriaRepository mercadoriaRepository;

    public MercadoriaServiceImpl(MercadoriaRepository mercadoriaRepository) {
        this.mercadoriaRepository = mercadoriaRepository;
    }

    @Override
    public MercadoriaDTO obterMercadoria(int codigo) throws Exception {
        var merc = mercadoriaRepository.findByCodigo(codigo);
        var mercDTO = new MercadoriaDTO();
        mercDTO.setNomeMercadoria(merc.getNome());
        mercDTO.setCodigo(merc.getCodigo());
        return mercDTO;
    }

    @Override
    public List<MercadoriaDTO> obterMercadorias() {
       return mercadoriaRepository.findAll().stream().map(m -> {
            var mercDTO = new MercadoriaDTO();
            mercDTO.setNomeMercadoria(m.getNome());
            mercDTO.setCodigo(m.getCodigo());
            return mercDTO;
        }).toList();
    }
}
