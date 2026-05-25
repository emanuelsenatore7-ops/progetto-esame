package model;

import java.util.ArrayList;

public class Piatto {
    //ATTRIBUTI
    private String nome;
    private double prezzo;
    private ArrayList<Ingrediente> ricetta; // Gli ingredienti necessari con le relative dosi

    // COSTRUTTORE
    public Piatto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        // Inizializziamo l'ArrayList vuoto per la ricetta
        this.ricetta = new ArrayList<>();
    }

    //  GETTER E SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }


    // Restituisce la lista degli ingredienti della ricetta
    public ArrayList<Ingrediente> getRicetta() {
        return ricetta;
    }

    //  METODI DI BUSINESS
    // Permette di aggiungere un ingrediente alla ricetta del piatto
    public void aggiungiIngredienteAllaRicetta(Ingrediente ingrediente) {
        this.ricetta.add(ingrediente);
    }

}
