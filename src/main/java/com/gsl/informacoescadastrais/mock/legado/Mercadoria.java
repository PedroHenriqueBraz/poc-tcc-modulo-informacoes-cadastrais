package com.gsl.informacoescadastrais.mock.legado;

import javax.persistence.*;

@Entity
@Table(name="mercadoria")
public class Mercadoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mercadoria_id", nullable = false)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "codigo")
    private String codigo;

    public Mercadoria() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
