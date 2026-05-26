package model;

public class Tavolo {
    private int numeroTavolo;
    private int numeroDiposti;
    private boolean disponibile;

    //Costruttore


    public Tavolo(int numeroTavolo, int numeroDiposti, boolean disponibile) {
        this.numeroTavolo = numeroTavolo;
        this.numeroDiposti = numeroDiposti;
        this.disponibile = disponibile;
    }
    //metodi get e sette

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public int getNumeroDiposti() {
        return numeroDiposti;
    }

    public void setNumeroDiposti(int numeroDiposti) {
        this.numeroDiposti = numeroDiposti;
    }
    //Funzione pervedere se il tavolo è disponibile
    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }



}
