package com.ada.example.heranca.familia;

public class Familia {

    public static void main(String[] args) {

        Filha bruna = new Neta();
        bruna.acessoAoCofreSilva();
        ((Neta) bruna).idadeNeta();

        Neta may = new Neta();
        may.acessoAoCofreSilva();
        may.idadeNeta();

    }
}
