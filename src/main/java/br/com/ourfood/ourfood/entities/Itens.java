package br.com.ourfood.ourfood.entities;

public class Itens {
    private Long id;
    private Produtos produto;
    private int quantidadeDeProdutos;

    public Itens(Produtos produto, int quantidadeDeProdutos) {
        this.produto = produto;
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }

    @Override
    public String toString() {
        return produto +
                ", qtd =" + quantidadeDeProdutos;
    }
}
