package model;

import java.util.ArrayList;
public class Inventario {

    // ATTRIBUTI
    //elenco dinamico di tutti gli ingredienti presenti fisicamente in magazzino
    private ArrayList<Ingrediente> ingredientiMagazzino;

    //COSTRUTTORE

    public Inventario(){
        //con la creazione del magazzino, la lista è vuota
        this.ingredientiMagazzino = new ArrayList<>();
    }


    //GETTER

    //Serve se vogliamo vedere la lista (es. per stamparla sullo schermo in futuro )
    public ArrayList<Ingrediente> getIngredientiMagazzino (){
        return ingredientiMagazzino;
    }

    //METODO PER AGGIUNGERE SCORTE (la logica del fornitore)
    public void aggiungiScorte(ArrayList<Ingrediente> merceInArrivo ){

        //si cicla su ogni nuovo ingrediente che sta arrivando
        for(Ingrediente nuovoIng : merceInArrivo){

            boolean trovato = false;

            for( Ingrediente ingMagazzino : ingredientiMagazzino ){
                // Usiamo equalsIgnoreCase per evitare problemi di maiuscole/minuscole (es. "Pomodoro" e "pomodoro")
                if (ingMagazzino.getNome().equalsIgnoreCase(nuovoIng.getNome())) {
                    // Trovato! Usiamo il metodo della classe Ingrediente per sommare le quantità
                    ingMagazzino.aggiungiQuantita(nuovoIng.getQuantita());
                    trovato = true;
                    break; // Fermiamo la ricerca per questo ingrediente
                }
            }
            // Se alla fine della ricerca non lo abbiamo trovato, lo aggiungiamo come nuovo
            if (!trovato) {
                ingredientiMagazzino.add(nuovoIng);
            }

        }

    }

    // METODO PER RIDURRE SCORTE (La logica del cuoco)
    public void riduciScorte(String nomeIngrediente, double quantitaDaPrendere) {

        for (Ingrediente ing : ingredientiMagazzino) {
            if (ing.getNome().equalsIgnoreCase(nomeIngrediente)) {
                // Trovato l'ingrediente, proviamo a ridurre la quantità
                ing.riduciQuantita(quantitaDaPrendere);
                return; // Esce dal metodo, abbiamo finito
            }
        }

        // Se arriviamo qui, il ciclo è finito senza trovare l'ingrediente
        System.out.println("Attenzione: " + nomeIngrediente + " non trovato in inventario!");
    }




}
