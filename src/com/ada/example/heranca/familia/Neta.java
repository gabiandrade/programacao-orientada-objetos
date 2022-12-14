package com.ada.example.heranca.familia;

import com.ada.example.heranca.familia.Filha;

//Subclasse
public class Neta extends Filha {

    private String senhaNeta;
    // senhaFilha

    //senhaFilha = senha da mãe , senhaNeta = senha da pessoa
    public Neta(String senhaFilha, String senhaNeta) {
        super(senhaFilha);
        this.senhaNeta = senhaNeta;
    }

    public Neta() {
        super("07122022");
       // System.out.println("Neta visualizando senha: " + senha);
    }

    public void acessoAoCofreSilva(){
        System.out.println("May está acessando o cofre");
        super.cofreSilva();

    }

    public void idadeNeta(){
        System.out.println("15");
    }

}
