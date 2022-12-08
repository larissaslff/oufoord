package br.com.ourfood.ourfood.sistema;

import br.com.ourfood.ourfood.entities.Cliente;
import br.com.ourfood.ourfood.entities.Compra;
import br.com.ourfood.ourfood.entities.Itens;
import br.com.ourfood.ourfood.entities.Produtos;

import java.util.Arrays;

public class Sistema {
    public static void main(String[] args) {

        Produtos produto1 = new Produtos("Caneta", "Caneta bic azul");
        Produtos produto2 = new Produtos("Lapis", "Lapis preto");
        Produtos produto3 = new Produtos("Pincel", "`Pincel azul");

        Itens itens1 = new Itens(produto1, 3);
        Itens itens2 = new Itens(produto2, 2);
        Itens itens3 = new Itens(produto3, 1);

        Compra compra = new Compra(Arrays.asList(itens1, itens2, itens3));

        Produtos produto5 = new Produtos("Banana", "nanica");
        Produtos produto6 = new Produtos("Maça", "verde");
        Produtos produto7 = new Produtos("Melancia", "da roça");

        Itens itens4 = new Itens(produto5, 10);
        Itens itens5 = new Itens(produto6, 5);
        Itens itens6 = new Itens(produto7, 12);


        Compra compra2 = new Compra(Arrays.asList(itens4, itens5, itens6));

        Cliente umCliente = new Cliente("Lala", "020226", "9999", "Rua", "lala@gmail.com");
        umCliente.cadastraLista(compra);
        umCliente.cadastraLista(compra2);

        System.out.println(umCliente.getListaDeCompras());

        System.out.println();
        System.out.println();
        System.out.println(umCliente);
    }

}
