package br.com.ourfood.ourfood.controllers;

import br.com.ourfood.ourfood.entities.Compra;
import br.com.ourfood.ourfood.repositories.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
