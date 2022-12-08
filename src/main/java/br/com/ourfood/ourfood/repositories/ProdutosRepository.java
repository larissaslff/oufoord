package br.com.ourfood.ourfood.repositories;

import br.com.ourfood.ourfood.entities.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
}
