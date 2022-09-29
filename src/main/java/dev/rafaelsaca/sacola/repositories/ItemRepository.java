package dev.rafaelsaca.sacola.repositories;

import dev.rafaelsaca.sacola.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
