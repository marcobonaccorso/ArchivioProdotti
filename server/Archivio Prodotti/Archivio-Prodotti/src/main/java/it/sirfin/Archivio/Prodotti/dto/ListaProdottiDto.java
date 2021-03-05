/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.Archivio.Prodotti.dto;

import it.sirfin.Archivio.Prodotti.model.Prodotto;
import java.util.List;

/**
 *
 * @author marco
 */
public class ListaProdottiDto {
     private List<Prodotto> listaProdotto;

    public ListaProdottiDto(List<Prodotto> listaProdotto) {
        this.listaProdotto = listaProdotto;
    }

    public List<Prodotto> getListaProdotto() {
        return listaProdotto;
    }

    public void setListaProdotto(List<Prodotto> listaProdotto) {
        this.listaProdotto = listaProdotto;
    }

    @Override
    public String toString() {
        return "ListaProdottiDto{" + "listaProdotto=" + listaProdotto + '}';
    }
     
     
}
