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
     private List<Prodotto> listaProdotti;

    public ListaProdottiDto(List<Prodotto> listaProdotto) {
        this.listaProdotti = listaProdotto;
    }

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    @Override
    public String toString() {
        return "ListaProdottiDto{" + "listaProdotto=" + listaProdotti + '}';
    }
     
     
}
