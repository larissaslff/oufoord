package br.com.ourfood.ourfood.controllers;

import br.com.ourfood.ourfood.entities.Cliente;
import br.com.ourfood.ourfood.entities.Produtos;
import br.com.ourfood.ourfood.repositories.ProdutosRepository;
import br.com.ourfood.ourfood.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    @Autowired
    ProdutosService service;

    @GetMapping
    public List<Produtos> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping
    public void novoProduto(@RequestBody Produtos produto) {
        service.cadastrarProduto(produto);
    }

    @GetMapping("/{id}")
    public Optional<Produtos> buscarPorId(@PathVariable Long id){
        return service.buscarProdutoPorId(id);
    }
}
