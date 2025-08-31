package com.igor.cartaoIgor.model;

import java.math.BigDecimal;

import com.igor.cartaoIgor.enums.CartaoTipo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "cartoes", schema = "public")
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do cartão é obrigatório")
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CartaoTipo tipo;

    @Column(nullable = false)
    private BigDecimal anuidade;

    @Column(nullable = false)
    @NotBlank(message = "A bandeira do cartão é obrigatória")
    private String bandeira;

    public Cartao() {
    }

    public Cartao(String nome, CartaoTipo tipo, BigDecimal anuidade, String bandeira) {
        this.nome = nome;
        this.tipo = tipo;
        this.anuidade = anuidade;
        this.bandeira = bandeira;
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

    public CartaoTipo getTipo() {
        return tipo;
    }

    public void setTipo(CartaoTipo tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getAnuidade() {
        return anuidade;
    }

    public void setAnuidade(BigDecimal anuidade) {
        this.anuidade = anuidade;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    @Override
    public String toString() {
        return "Cartao [id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", anuidade=" + anuidade + ", bandeira="
                + bandeira + "]";
    }

}
