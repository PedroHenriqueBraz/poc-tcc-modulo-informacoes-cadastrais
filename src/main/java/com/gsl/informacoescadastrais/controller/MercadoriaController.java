package com.gsl.informacoescadastrais.controller;

import com.gsl.informacoescadastrais.model.MercadoriaDTO;
import com.gsl.informacoescadastrais.service.MercadoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mercadoria")
public class MercadoriaController {

    private MercadoriaService mercadoriaService;

    public MercadoriaController(MercadoriaService mercadoriaService) {
        this.mercadoriaService = mercadoriaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<MercadoriaDTO> obterMercadoriaPorCodigo(@PathVariable("codigo") int codigo) throws Exception {
        return ResponseEntity.ok(mercadoriaService.obterMercadoria(codigo));
    }

    @GetMapping
    public ResponseEntity<List<MercadoriaDTO>> obterMercadorias(){
        return ResponseEntity.ok(mercadoriaService.obterMercadorias());
    }
}
