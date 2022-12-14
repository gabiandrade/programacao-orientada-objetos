package com.ada.example;

import com.ada.example.locadora.Filme;
import com.ada.example.locadora.GeneroFilme;
import com.ada.example.locadora.Locadora;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Filme panteraNegra = new Filme("Pantera Negra", 7.0);
        Filme mulherMaravilha = new Filme("Mulher Maravilha", "herois",
                GeneroFilme.SUPER_HEROI, "10", 7.0);
        Filme harryPotter = new Filme("Harry Potter e a pedra filosofal", 5.0);
        Filme cidadePerdida = new Filme("Cidade Perdida", 9.0);
        Filme morbius = new Filme("Morbius", 15.508);

        //Exemplo de lista de filmes criada para ser passada no construtor;
        List<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(panteraNegra);
        listaFilmes.add(mulherMaravilha);
        Locadora locadora = new Locadora("AdaFlix", "123456789", listaFilmes);
        System.out.println("filmes do construtor: " + locadora.getFilmes());

        //
        List<Filme> filmesCartaz = new ArrayList<>();
        filmesCartaz.add(cidadePerdida);
        filmesCartaz.add(morbius);
        locadora.setFilmes(filmesCartaz);
        System.err.println("nome dos filmes usando o método set: " + locadora.listarNomeFilme());

        //Exemplo de cadastro de filme pelo método cadastrarFilme
        locadora.cadastrarFilme(harryPotter);
        locadora.listarFilmes();
        System.err.println("Quantidade de elementos na lista de filmes: " + locadora.getFilmes().size());
    }
}
