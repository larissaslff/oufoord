package br.com.ourfood.ourfood.controllers;

import br.com.ourfood.ourfood.entities.Cliente;
import br.com.ourfood.ourfood.repositories.ClienteRepositiry;
import br.com.ourfood.ourfood.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteRepositiry repository;

    @Autowired
    ClienteService service;


    @PostMapping
    public void cadastrar(@RequestBody Cliente cliente){
        repository.save(cliente);
    }

    @GetMapping
    public List<Cliente> buscarTodos(){
        return repository.findAll();
    }

    @GetMapping("buscaPorCPF/{cpf}")
    public Optional<Cliente> buscarPorCpf(@PathVariable String cpf){
        return repository.findByCpf(cpf);
    }
    @GetMapping("buscaPorNome/{nome}")
    public List<Optional<Cliente>> buscarPorNome(@PathVariable String nome){
        return repository.findByNomeIgnoreCase(nome);
    }

}
