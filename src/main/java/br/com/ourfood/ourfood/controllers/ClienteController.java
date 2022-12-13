package br.com.ourfood.ourfood.controllers;

import br.com.ourfood.ourfood.entities.Cliente;
import br.com.ourfood.ourfood.repositories.ClienteRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteRepositiry repositiry;

    @PostMapping
    public void cadastrar(@RequestBody Cliente cliente){
        repositiry.save(cliente);
    }
}
