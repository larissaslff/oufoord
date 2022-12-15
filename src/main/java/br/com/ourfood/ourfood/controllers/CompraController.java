package br.com.ourfood.ourfood.controllers;

import br.com.ourfood.ourfood.entities.Compra;
import br.com.ourfood.ourfood.repositories.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    CompraRepository repository;
    @PostMapping
    public void comprar(@RequestBody Compra compra){
        repository.save(compra);
    }

    @GetMapping
    public List<Compra> buscarCompras(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Compra> buscarPorId(@PathVariable Long id){
        return repository.findById(id);
    }
}
