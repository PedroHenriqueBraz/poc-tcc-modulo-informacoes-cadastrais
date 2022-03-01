package com.gsl.informacoescadastrais.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class FornecedorDTO implements Serializable {
    @Serial
    private final static long serialVersionUID = 431732515311472795L;
    private String nomeFornecedor;
    private String cnpj;
}
