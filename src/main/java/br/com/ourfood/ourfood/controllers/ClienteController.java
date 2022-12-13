package br.com.ourfood.ourfood.controllers;

import br.com.ourfood.ourfood.entities.Cliente;
import br.com.ourfood.ourfood.repositories.ClienteRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteRepositiry repository;

    @PostMapping
    public void cadastrar(@RequestBody Cliente cliente){
        repository.save(cliente);
    }

    @GetMapping
    public List<Cliente> buscarTodos(){
        return repository.findAll();
    }
}
