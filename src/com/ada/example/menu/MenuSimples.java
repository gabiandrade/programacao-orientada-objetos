package com.ada.example.menu;

public class MenuSimples {
    public static void main(String[] args) {
        exibirMenu();
    }

    private static void exibirMenu() {
        OpcoesMenuSimples[] opcaoMenu = OpcoesMenuSimples.values();
        System.out.println("--------- ADAFLIX ------------");
        for (OpcoesMenuSimples opcao : opcaoMenu) {
            System.out.println(opcao);
        }
    }
}
