package br.com.ourfood.ourfood.entities;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<Itens> itens = new ArrayList<>();

    public Compra(List<Itens> itens) {
        this.itens = itens;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(Itens itens) {
        this.itens.add(itens);
    }

    @Override
    public String toString() {
        return "Compra:" +
                "itens =" + itens +
                '}';
    }
}
