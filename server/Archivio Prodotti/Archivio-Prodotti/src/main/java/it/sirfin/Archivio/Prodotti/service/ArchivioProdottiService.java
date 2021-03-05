/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.Archivio.Prodotti.service;

import it.sirfin.Archivio.Prodotti.dto.ListaProdottiDto;
import it.sirfin.Archivio.Prodotti.dto.ScontoDto;
import it.sirfin.Archivio.Prodotti.model.Prodotto;

/**
 *
 * @author marco
 */
public interface ArchivioProdottiService {
    
    ListaProdottiDto aggiorna();
    
    ListaProdottiDto inserisciProdotto(Prodotto prod);
       
    ListaProdottiDto cancellaProdotto(Prodotto prod);  
    
    ScontoDto calcolaSconto(Prodotto prod);
    
    ListaProdottiDto ricercaProdotto(String criterio);
}
