import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Prodotto } from './prodotto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto = new Prodotto();
  prodotti: Prodotto[] = [];
  search = "";
  prezzoIva = 0;
  sconto = 0;
  constructor(private http: HttpClient) {
    this.aggiorna();
  }
  aggiorna() {

  }
  inserisci() { }
  cancellazione() { }
  calcolaSconto() { }
  ricerca() { }

}
