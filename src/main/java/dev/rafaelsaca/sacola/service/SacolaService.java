package dev.rafaelsaca.sacola.service;

import dev.rafaelsaca.sacola.models.Item;
import dev.rafaelsaca.sacola.models.Sacola;
import dev.rafaelsaca.sacola.resource.dto.ItemDto;

public interface SacolaService {

    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);

}
