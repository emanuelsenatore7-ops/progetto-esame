package model;
 import java.time.LocalDate;

public class Ingrediente {

//ATTRIBUTI
    private String nome;
    private double quantita; // double perchè potremmo avere 1.5 kg o 05 Litri)
    private String genere ; //ES: "Carne", "Pesce " , "Verdura"
    private LocalDate dataScadenza ; //orario/data scadenza dei prodotti


    //COSTRUTTORE
    public Ingrediente (String nome, double quantita, String genere, LocalDate dataScadenza){
        this.nome= nome;
        this.quantita=quantita;
        this.genere=genere;
        this.dataScadenza=dataScadenza;


    }

    //METODI GET E SET

    //get/set nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //get/set quantita
    public double getQuantita() {
        return quantita;
    }
    public void setQuantita(double quantita) {
        this.quantita = quantita;
    }

    //get/set genere
    public String getGenere() {
        return genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }

    //get/set datascadenza
    public LocalDate getDataScadenza() {
        return dataScadenza;
    }
    public void setDataScadenza(LocalDate dataScadenza) {
        this.dataScadenza = dataScadenza;
    }


//METODI
 //aggiungere
    public void aggiungiQuantita(double quantitaDaAggiungere) {
        if (quantitaDaAggiungere > 0) {
            this.quantita += quantitaDaAggiungere;
        }
    }

    //ridurre
    public void riduciQuantita(double quantitaDaTogliere) {
        if(quantitaDaTogliere > 0 && this.quantita >=quantitaDaTogliere){
            this.quantita -= quantitaDaTogliere;
        }else{

            //messaggio di errore sulla riduzione della quantita
            System.out.println("Errore: impossibile ridurre la quantità. Scorte insufficienti ");
        }
    }
}
