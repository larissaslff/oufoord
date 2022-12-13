package br.com.ourfood.ourfood.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_produtos")
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    @ManyToOne
    private Itens itens;

    public Produtos(){
    };
    public Produtos(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Produtos:" + nome + '\'' +
                ", descrição='" + descricao + '\'';
    }
}
