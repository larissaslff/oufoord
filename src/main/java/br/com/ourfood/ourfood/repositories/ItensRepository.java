package br.com.ourfood.ourfood.repositories;

import br.com.ourfood.ourfood.entities.Itens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensRepository extends JpaRepository<Itens, Long> {
}
