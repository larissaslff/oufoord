package br.com.ourfood.ourfood.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String email;
    private List<Compra> listaDeCompras = new ArrayList<>();

    public Cliente(String nome, String cpf, String telefone, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void cadastraLista(Compra listaDeCompras) {
        this.listaDeCompras.add(listaDeCompras);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                nome + '\'' +
                ", " + cpf + '\'' +
                ": " + listaDeCompras;
    }
}
