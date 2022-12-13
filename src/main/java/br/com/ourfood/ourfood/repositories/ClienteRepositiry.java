package br.com.ourfood.ourfood.repositories;

import br.com.ourfood.ourfood.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositiry extends JpaRepository<Cliente, Long> {
}
