package br.com.ourfood.ourfood.service;

import br.com.ourfood.ourfood.entities.Cliente;
import br.com.ourfood.ourfood.repositories.ClienteRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteService {
    @Autowired
    ClienteRepositiry repository;

    public Optional<Cliente> buscarClientePorCpf(String cpf){
        return repository.findByCpf(cpf);
    }

    public List<Optional<Cliente>> buscarClientePorNome(String nome){
        return repository.findByNomeIgnoreCase(nome);
    }
    public List<Cliente> buscarTodosClientes(){
        return repository.findAll();
    }
    public void cadastrarCliente(Cliente cliente) {
        repository.save(cliente);
    }


}
