package br.com.ourfood.ourfood.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@Entity
@Table(name = "tb_compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date data;
    @ManyToOne
    private Cliente cliente;
    @OneToMany
    private List<Itens> itens = new ArrayList<>();

    public Compra(){}
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
