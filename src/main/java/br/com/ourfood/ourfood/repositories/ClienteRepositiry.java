package br.com.ourfood.ourfood.repositories;

import br.com.ourfood.ourfood.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepositiry extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByCpf(String cpf);
    List<Optional<Cliente>> findByNomeIgnoreCase(String nome);
}
