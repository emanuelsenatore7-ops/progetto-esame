package controller;

import model.Ordine;
import model.Tavolo;
import model.Inventario;

import java.util.ArrayList;

public class Controller {
    //registri del ristorante (attributi che ci servon6o per la gestio6ne)
    private ArrayList<Tavolo> listaTavoli;
    private ArrayList<Ordine> ordiniAttivi;
    private Inventario magazzino;

    //Costruttore della struttura

    public Controller(ArrayList<Tavolo> listaTavoli, ArrayList<Ordine> ordiniAttivi, Inventario magazzino) {
        this.listaTavoli = listaTavoli;
        this.ordiniAttivi = ordiniAttivi;
        this.magazzino = magazzino;

        inizializzaSala();
    }

    //Per semplicità li iniziallizamo tutti con 4 posti disponibili
    private void inizializzaSala(){
    for(int i=1; i<=20; i++){
    Tavolo nuovoTavolo = new Tavolo(i,4,true);
    this.listaTavoli.add(nuovoTavolo);
    }

    }

}
