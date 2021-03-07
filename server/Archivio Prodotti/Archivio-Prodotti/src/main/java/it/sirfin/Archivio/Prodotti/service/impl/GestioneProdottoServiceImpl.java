/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.Archivio.Prodotti.service.impl;

import it.sirfin.Archivio.Prodotti.dto.ListaProdottiDto;
import it.sirfin.Archivio.Prodotti.dto.ScontoDto;
import it.sirfin.Archivio.Prodotti.model.Prodotto;
import it.sirfin.Archivio.Prodotti.repository.ProdottoRepository;
import it.sirfin.Archivio.Prodotti.service.ArchivioProdottiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 39392
 */
@Service
public class GestioneProdottoServiceImpl implements ArchivioProdottiService {

    @Autowired
    ProdottoRepository prodottoRepository;

    @Override
    public ListaProdottiDto aggiorna() {
        List<Prodotto> lista = prodottoRepository.findAll();
        return new ListaProdottiDto(lista);
    }

    @Override
    public ListaProdottiDto inserisciProdotto(Prodotto prod) {
        prodottoRepository.save(prod);
        double prezzoIva = prod.getPrezzo() * 1.22;
        return aggiorna();
    }

    @Override
    public ListaProdottiDto cancellaProdotto(Prodotto prod) {
        prodottoRepository.delete(prod);
        return aggiorna();
    }

    @Override
    public ScontoDto calcolaSconto(Prodotto prod) {
        double sconto = prod.getPrezzo() * 0.7;
        return new ScontoDto(sconto);
    }

    @Override
    public ListaProdottiDto ricercaProdotto(String criterio) {
        List<Prodotto> lista = prodottoRepository.findByCodiceContainsOrDescrizioneContains(criterio, criterio
        );
        return new ListaProdottiDto(lista);
    }

}
