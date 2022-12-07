package com.ada.example.heranca;
//Superclasse
public class Pai {

    protected String senhaCofre;
    protected double valorHerança;

    protected String sobrenomeFamilia;


    public Pai(String senhaCofre, double valorHerança, String sobrenomeFamilia) {
        this.senhaCofre = senhaCofre;
        this.valorHerança = valorHerança;
        this.sobrenomeFamilia = sobrenomeFamilia;
    }

    public Pai() {
        //this.senha = "12345";
    }


}
