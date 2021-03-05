/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.Archivio.Prodotti.dto;

import it.sirfin.Archivio.Prodotti.model.Prodotto;

/**
 *
 * @author marco
 */
public class ProdottoDto {
    private Prodotto prodotto;

    public ProdottoDto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public ProdottoDto() {
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    @Override
    public String toString() {
        return "ProdottoDto{" + "prodotto=" + prodotto + '}';
    }
    
    
}
