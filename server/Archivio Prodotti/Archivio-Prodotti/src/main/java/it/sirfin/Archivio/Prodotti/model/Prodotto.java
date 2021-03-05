/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.Archivio.Prodotti.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
/**
 *
 * @author marco
 */
public class Prodotto implements Serializable {

    
    private String codice;
    private String descrizione;
    private double prezzo;
    private double prezzoIva;
    @Id
    private Long id;

    
}
