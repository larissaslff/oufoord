package br.com.ourfood.ourfood.controllers;

import br.com.ourfood.ourfood.entities.Produtos;
import br.com.ourfood.ourfood.repositories.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    @Autowired
    ProdutosRepository repository;

    @GetMapping
    public List<Produtos> buscarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public void novoProduto(@RequestBody Produtos produto) {
        repository.save(produto);
    }
}
