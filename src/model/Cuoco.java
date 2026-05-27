package model;

public class Cuoco extends Dipendente{

    private String specialità;
    // Costruttore che setta i valori anche della classe padre
    public Cuoco(String nome, String cognome, double oreDiLavoro, double salario, String specialità) {
        super(nome, cognome, oreDiLavoro, salario);
        this.specialità = specialità;
    }

    public String getSpecialità() {
        return specialità;
    }

    public void setSpecialità(String specialità) {
        this.specialità = specialità;
    }
}
