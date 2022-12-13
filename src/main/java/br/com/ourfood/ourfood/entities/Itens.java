package br.com.ourfood.ourfood.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_itens")
public class Itens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantidadeDeProdutos;

    @ManyToOne
    private Compra compra;
    @OneToMany
    private List<Produtos> produto;

    public Itens(int quantidadeDeProdutos, List<Produtos> produto) {
        this.quantidadeDeProdutos = quantidadeDeProdutos;
        this.produto = produto;
    }
    @Override
    public String toString() {
        return produto +
                ", qtd =" + quantidadeDeProdutos;
    }
}
