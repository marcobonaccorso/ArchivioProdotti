import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ListaProdottiDto } from './lista-prodotti-dto';
import { Prodotto } from './prodotto';
import { ProdottoDto } from './prodotto-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto = new Prodotto();
  articoli: Prodotto[] = [];
  search = "";
  prezzoIva = 0;
  sconto = 0;
  constructor(private http: HttpClient) {
    this.aggiorna();
  }

  aggiorna() {
    this.http.get<ListaProdottiDto>("http://localhost:8080/aggiorna-lista")
      .subscribe(v => this.articoli = v.listaProdotti);
  }


  inserisci() {
    let dto = new ProdottoDto();
    dto.prodotto = this.prodotto;
    let l = this.http.post<ListaProdottiDto>(
      "http://localhost:8080/inserisci-prodotto",
      dto
    );
    l.subscribe(r => {
      console.log(r);
      this.articoli = r.listaProdotti;
    }
    );


    this.prodotto = new Prodotto();
  }
  cancellazione() {

  }
  calcolaSconto() {

  }
  ricerca() {

  }

}
