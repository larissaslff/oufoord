package br.com.ourfood.ourfood.service;


import br.com.ourfood.ourfood.entities.Produtos;
import br.com.ourfood.ourfood.repositories.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {
    @Autowired
    ProdutosRepository respository;

    public Optional<Produtos> buscarProdutoPorId(Long id){
       return respository.findById(id);
    }
    public List<Produtos> buscarTodos(){
       return respository.findAll();
    }
    public void cadastrarProduto(Produtos produto) {
        respository.save(produto);
    }
}
