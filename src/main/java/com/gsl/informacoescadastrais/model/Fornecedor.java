package com.gsl.informacoescadastrais.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "nome_fornecedor",
        "cnpj",
        "id"

})
public class Fornecedor {
    @JsonProperty("nome_fornecedor")
    private String nomeFornecedor;
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

    @JsonProperty("nome_fornecedor")
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    @JsonProperty("nome_fornecedor")
    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
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
