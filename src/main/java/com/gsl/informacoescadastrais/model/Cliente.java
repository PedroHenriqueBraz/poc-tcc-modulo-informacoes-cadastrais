package com.gsl.informacoescadastrais.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "nome_cliente",
        "cnpj",
        "id"
})
public class Cliente {
    @JsonProperty("nome_cliente")
    private String nomeCliente;
    @JsonProperty("cnpj")
    private String cnpj;
    @JsonProperty("id")
    private int id;
    @JsonProperty("id")
    public int getId() {
        return id;
    }
    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("nome_cliente")
    public String getNomeCliente() {
        return nomeCliente;
    }

    @JsonProperty("nome_cliente")
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @JsonProperty("cnpj")
    public String getCnpj() {
        return cnpj;
    }

    @JsonProperty("cnpj")
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
