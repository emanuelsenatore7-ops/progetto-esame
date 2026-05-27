package controller;

import model.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {
    //registri del ristorante (attributi che ci servon6o per la gestio6ne)
    private ArrayList<Tavolo> listaTavoli;
    private ArrayList<Ordine> ordiniAttivi;
    private Inventario magazzino;
    private Menu menuDelRistorante;
    //Costruttore della struttura

    public Controller() {
        this.listaTavoli = new ArrayList<Tavolo>();
        this.ordiniAttivi = new ArrayList<Ordine>();
        this.magazzino = new Inventario();
        this.menuDelRistorante = new Menu();

        inizializza();
    }

    //Funzione inizializzazione generale (finti valori)
    public void inizializza(){
    for(int i=1; i<=20; i++){//per semplicità i tavolo hanno tutti 4 posti
    Tavolo nuovoTavolo = new Tavolo(i,4,true);
    this.listaTavoli.add(nuovoTavolo);

    }//creazione degli ingredienti
    Ingrediente farina = new Ingrediente("Farina",20,"Farinacei",LocalDate.of(2027,8,3));
    Ingrediente pomodoro = new Ingrediente("pomodoro",15,"Verdura",LocalDate.of(2026,5,20));
    Piatto margherita= new Piatto("Margherita",6.50);
    margherita.aggiungiIngredienteAllaRicetta(farina);
    margherita.aggiungiIngredienteAllaRicetta(pomodoro);
    menuDelRistorante.aggiungiPiatto(margherita);
    }

    public ArrayList<Piatto> ottieniMenu(){
        return menuDelRistorante.getListaPiatti();
    }

    public void PrenotaTavolo(Tavolo tavoloseleionato){
        tavoloseleionato.setDisponibile(false);
        //creiamo inzialmente l'rodine del tavolo vuoto;
        ArrayList<Piatto> listavuota = new ArrayList<Piatto>();
        Ordine nuovoOrdine = new Ordine(tavoloseleionato,listavuota,"Aperto");
        this.ordiniAttivi.add(nuovoOrdine);
    }

    public void aggiungiPiattoAOrdine(Tavolo tavolo,Piatto piattoScelto){
       for(Ordine ordine : this.ordiniAttivi){
          if(ordine.getTavoloAssociato() == tavolo) {
              //aggiunge il piatto all'odine
              ordine.getListaPiatti().add(piattoScelto);
          }
       }
    }
//da la lista di tavoli alla gui
    public ArrayList<Tavolo> getListaTavoli(){
        return listaTavoli;
    }

    //restituisce la lista dgli ordini attivi
    public ArrayList<Ordine> getOrdiniAttivi(){
        return ordiniAttivi;
    }

}
