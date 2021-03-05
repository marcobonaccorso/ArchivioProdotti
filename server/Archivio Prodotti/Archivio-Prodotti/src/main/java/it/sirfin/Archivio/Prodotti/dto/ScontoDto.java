/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.Archivio.Prodotti.dto;

/**
 *
 * @author 39392
 */
public class ScontoDto {
    private double importoScontato;

    public ScontoDto() {
    }

    public ScontoDto(double importoScontato) {
        this.importoScontato = importoScontato;
    }

    public double getImportoScontato() {
        return importoScontato;
    }

    public void setImportoScontato(double importoScontato) {
        this.importoScontato = importoScontato;
    }

    @Override
    public String toString() {
        return "ScontoDto{" + "importoScontato=" + importoScontato + '}';
    }
    
    
}
