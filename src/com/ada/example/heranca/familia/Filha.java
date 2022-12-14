package com.ada.example.heranca.familia;

//Subclasse
public class Filha extends Pai {

    protected String senhaFilha;

    public Filha() {
        super("123456", 1000.00, "SILVA");
        System.out.println(senhaCofre + " " + valorHerança + "" + sobrenomeFamilia);

    }


    public Filha(String senhaFilha) {
        super("123456", 1000.00, "SILVA");
        //System.out.println(senhaCofre + " " + valorHerança + " " +
                //sobrenomeFamilia + " " + senhaFilha);
    }

    //senhaFilha = é a propria senha da mãe
    public Filha(String senhaCofre,
                 double valorHerança,
                 String sobrenomeFamilia,
                 String senhaFilha) {
        super(senhaCofre, valorHerança, sobrenomeFamilia);
        this.senhaFilha = senhaFilha;
    }

    public void acessoAoCofreSilva(){
        super.cofreSilva();
    }
}
