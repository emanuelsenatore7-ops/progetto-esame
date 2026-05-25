package model;

import java.util.ArrayList;

public class Menu {

    //ATTRIBUTI

    //lista piatti
    private ArrayList<Piatto> listaPiatti;

    //  COSTRUTTORE
    public Menu() {
        // Inizializziamo la lista come vuota
        this.listaPiatti = new ArrayList<>();
    }

    //  GETTER
    public ArrayList<Piatto> getListaPiatti() {
        return listaPiatti;
    }


    // 4. METODI DI GESTIONE
    public void aggiungiPiatto(Piatto piatto) {
        if (piatto != null) {
            this.listaPiatti.add(piatto);
        }
    }

    public void rimuoviPiatto(Piatto piatto) {
        this.listaPiatti.remove(piatto);
    }
}



















}
