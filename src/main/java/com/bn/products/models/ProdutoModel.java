package com.bn.products.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_produto")
    private String nome;

    @Column(name = "preco_produto")
    private BigDecimal preco;

    @Column(name = "quantidade_estoque")
    private Integer estoque;

    public ProdutoModel() {}

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}
