/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.Archivio.Prodotti.controller;

import it.sirfin.Archivio.Prodotti.dto.CriterioRicercaDto;
import it.sirfin.Archivio.Prodotti.dto.ListaProdottiDto;
import it.sirfin.Archivio.Prodotti.dto.ProdottoDto;
import it.sirfin.Archivio.Prodotti.dto.ScontoDto;
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

    @RequestMapping("/inserisciProdotto")
    @ResponseBody
    public ListaProdottiDto inserisciProdotto(@RequestBody ProdottoDto dto) {
        System.out.println("sono in inserisci cliente" + dto);
        return archivioProdottiService.inserisciProdotto(dto.getProdotto());
    }

    @RequestMapping("/ricercaProdotto")
    @ResponseBody
    public ListaProdottiDto ricercaProdotto(@RequestBody CriterioRicercaDto dto) {
        return archivioProdottiService.ricercaProdotto(dto.getStringa());
    }

    @RequestMapping("/cancellaProdotto")
    @ResponseBody
    public ListaProdottiDto cancellaProdotto(@RequestBody ProdottoDto dto) {
        return archivioProdottiService.cancellaProdotto(dto.getProdotto());
    }

    @RequestMapping("/calcolaSconto")
    @ResponseBody
    public ScontoDto calcolaSconto(@RequestBody Prodotto prod) {
        return archivioProdottiService.calcolaSconto(prod);
    }

    @RequestMapping("/aggiorna")
    @ResponseBody
    ListaProdottiDto aggiorna() {
        return archivioProdottiService.aggiorna();
    }

}
