/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.Archivio.Prodotti.service.impl;

import it.sirfin.Archivio.Prodotti.dto.ListaProdottiDto;
import it.sirfin.Archivio.Prodotti.dto.ScontoDto;
import it.sirfin.Archivio.Prodotti.model.Prodotto;
import it.sirfin.Archivio.Prodotti.service.ArchivioProdottiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 39392
 */
@Service
public class GestioneProdottoServiceImpl implements ArchivioProdottiService {

    @Autowired
    ArchivioProdottiService archivioProdottiService;

    @Override
    public ListaProdottiDto aggiorna() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaProdottiDto inserisciProdotto(Prodotto prod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaProdottiDto cancellaProdotto(Prodotto prod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ScontoDto calcolaSconto(Prodotto prod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaProdottiDto ricercaProdotto(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
