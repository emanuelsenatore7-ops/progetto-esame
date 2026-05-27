package model;

import java.util.ArrayList;

public class Ordine {

    private Tavolo tavoloAssociato;
    private ArrayList<Piatto> listaPiatti;
    private String statoOrdine;

    //Costruttore


    public Ordine(Tavolo tavoloAssociato, ArrayList<Piatto> listaPiatti, String statoOrdine) {
        this.tavoloAssociato = tavoloAssociato;
        this.listaPiatti = listaPiatti;
        this.statoOrdine = statoOrdine;
    }

    //Aggiungere e rimiovere un piatto dalla lista;
        public void aggiungiPiatto(Piatto piattoAggiungere){
        this.listaPiatti.add(piattoAggiungere);
        }
    //Funzioneper rimuovere un piatto dall'odine (rimozione dalla lista del'ordine)
        public void rimuoviPiatto(Piatto piattoTolto){
        this.listaPiatti.remove(piattoTolto);
        }

        //metodi get e set

    public Tavolo getTavoloAssociato() {
        return tavoloAssociato;
    }

    public void setTavoloAssociato(Tavolo tavoloAssociato) {
        this.tavoloAssociato = tavoloAssociato;
    }

    public ArrayList<Piatto> getListaPiatti() {
        return listaPiatti;
    }

    public void setListaPiatti(ArrayList<Piatto> listaPiatti) {
        this.listaPiatti = listaPiatti;
    }

    public String getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(String statoOrdine) {
        this.statoOrdine = statoOrdine;
    }
}
