package dev.rafaelsaca.sacola.repositories;

import dev.rafaelsaca.sacola.models.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SacolaRepository extends JpaRepository<Sacola, Long>{
}
