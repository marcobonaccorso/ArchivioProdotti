/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.Archivio.Prodotti.controller;

import it.sirfin.Archivio.Prodotti.dto.ListaProdottiDto;
import it.sirfin.Archivio.Prodotti.model.Prodotto;
import it.sirfin.Archivio.Prodotti.service.ArchivioProdottiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marco
 */
@CrossOrigin("*")
@RestController
public class ArchivioProdottiController {

    @Autowired
    ArchivioProdottiService archivioProdottiService;

    @RequestMapping("/inserisci-prodotto")
    @ResponseBody
    public ListaProdottiDto inserisciProdotto(@RequestBody Prodotto prod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
