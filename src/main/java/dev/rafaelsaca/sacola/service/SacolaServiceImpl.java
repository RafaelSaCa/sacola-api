package dev.rafaelsaca.sacola.service;

import dev.rafaelsaca.sacola.enumeration.FormaPagamento;
import dev.rafaelsaca.sacola.models.Item;
import dev.rafaelsaca.sacola.models.Sacola;
import dev.rafaelsaca.sacola.repositories.SacolaRepository;
import dev.rafaelsaca.sacola.resource.dto.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SacolaServiceImpl implements SacolaService{

    private final SacolaRepository sacolaRepository;
    @Override
    public Item incluirItemNaSacola(ItemDto itemDto) {
      Sacola sacola = verSacola(itemDto.getIdSacola());

      if(sacola.isFechada()){
          throw new RuntimeException("Esta sacola está fechada!");
      }

      Item.builder()

              .build();

      return null;





    }

    @Override
    public Sacola verSacola(Long id) {
        return sacolaRepository.findById(id).orElseThrow(
                () ->{
                        throw new RuntimeException("Essa sacola não existe!");
                }
        );
    }

    @Override
    public Sacola fecharSacola(Long id, int numeroformaPagamento) {
       Sacola sacola = verSacola(id);
       if(sacola.getItens().isEmpty()){
           throw new RuntimeException("Inclua itens na sacola!");
       }
        FormaPagamento formaPagamento = numeroformaPagamento = 0 ?FormaPagamento.DINHEIRO : FormaPagamento.MAQUINETA;
        sacola.setFormaPagamento(formaPagamento);
        sacola.setFechada(true);
        return sacolaRepository.save(sacola);

    }
}
