package com.gsl.informacoescadastrais.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class ClienteDTO implements Serializable {
    @Serial
    private final static long serialVersionUID = 2225034914220119126L;
    private String nomeCliente;
    private String cnpj;
}
