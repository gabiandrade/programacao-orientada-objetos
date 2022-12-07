package com.ada.example.heranca;

//Subclasse
public class Filha extends Pai {

    protected String senhaFilha;

    public Filha() {
        super("123456", 1000.00, "SILVA");
        System.out.println(senhaCofre + " " + valorHerança + "" + sobrenomeFamilia);

    }


    public Filha(String senhaFilha) {
        super("123456", 1000.00, "SILVA");
        System.out.println(senhaCofre + " " + valorHerança + " " +
                sobrenomeFamilia + " " + senhaFilha);
    }


}
