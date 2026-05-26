package model;

public class Dipendente {
    protected String nome;
    protected String cognome;
    protected double oreDiLavoro;
    protected double salario;

    //Costruttore della classe dipendente
    public Dipendente(String nome, String cognome, double oreDiLavoro, double salario) {
        this.nome = nome;
        this.cognome = cognome;
        this.oreDiLavoro = oreDiLavoro;
        this.salario = salario;
    }

    //Metodi getter e setter


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getOreDiLavoro() {
        return oreDiLavoro;
    }

    public void setOreDiLavoro(double oreDiLavoro) {
        this.oreDiLavoro = oreDiLavoro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



}
