package model;

public class Cameriere extends Dipendente{
    //Atributo del cameriere
    private String reparto;
    //Costruttore
    public Cameriere(String nome, String cognome, double oreDiLavoro, double salario, String reparto) {
        super(nome, cognome, oreDiLavoro, salario);
        this.reparto = reparto;
    }

    //Metodi getter e setter
    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

}
