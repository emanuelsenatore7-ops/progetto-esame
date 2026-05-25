package model;

import java.util.ArrayList;
public class Fornitore {

//ATTRIBUTI PRIVATI
    private String nomeAzienda;
    private String tipoProdotto; //(esemio: "Fornitore di Carne", "Fornitore di Uova")


    //COSTRUTTORE

    public Fornitore(String nomeAzienda, String tipoProdotto){

        this.nomeAzienda= nomeAzienda;
        this.tipoProdotto= tipoProdotto;
    }


    //METODI GET/SET

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public String getTipoProdotto() {
        return tipoProdotto;
    }

    public void setTipoProdotto(String tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }


    //FUNZIONE DI BUSINESS
    // Questo metodo riceverà una lista di nuovi ingredienti portati dal fornitore.
    public void rifornisciRistorante(ArrayList<Ingrediente> listaNuoviIngredienti){
        System.out.println("Il fornitore " + nomeAzienda + " sta consegnando le merci...");
    }




}
