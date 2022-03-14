package com.gsl.informacoescadastrais.model;

import lombok.Data;

import java.io.Serial;

@Data
public class MercadoriaDTO {
    @Serial
    private final static long serialVersionUID = 431732515311472795L;
    private String nomeMercadoria;
    private String codigo;
}
