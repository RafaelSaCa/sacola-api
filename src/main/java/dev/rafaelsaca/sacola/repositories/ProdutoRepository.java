package dev.rafaelsaca.sacola.repositories;

import dev.rafaelsaca.sacola.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
