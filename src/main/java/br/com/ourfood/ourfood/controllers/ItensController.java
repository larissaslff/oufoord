package br.com.ourfood.ourfood.controllers;

import br.com.ourfood.ourfood.entities.Itens;
import br.com.ourfood.ourfood.repositories.ItensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItensController {
    @Autowired
    ItensRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody Itens itens){
        repository.save(itens);
    }

    @GetMapping
    public List<Itens> buscarTodos(){
        return repository.findAll();
    }
}
