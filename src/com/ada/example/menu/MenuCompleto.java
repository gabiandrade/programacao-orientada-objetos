package com.ada.example.menu;

import java.util.Scanner;

public class MenuCompleto {

    private static final Scanner scanner = new Scanner(System.in);

    private static void exibirMenu() {
        OpcoesMenuCompleto[] opcoesMenu = OpcoesMenuCompleto.values();
        System.out.println("--------- ADAFLIX ------------");

        for (OpcoesMenuCompleto opcao : opcoesMenu) {
            System.out.println(opcao.getOpcao() + "-" + opcao.getDescricao() + " -> " + opcao);
        }

        System.out.println("Digite o ENUM correspondente a opção deseja " +
                "ou digite 0 para input numerico");

        String input = scanner.nextLine();

        if (input.equals("0")) {
            escolherOpcaoMenuPeloNumero();
        } else {
            escolherOpcaoMenuPorConstant(input);
        }

    }

    private static void escolherOpcaoMenuPeloNumero() {
        System.out.print("Digite o número da opcao desejada:");
        Scanner scanner = new Scanner(System.in);
        int entradaUsuario = scanner.nextInt();

        switch (entradaUsuario) {
            case 1 -> System.out.println(" -> Filme Cadastrado");
            case 2 -> System.out.println(" -> Filme Listado");
            default -> System.out.println("SAIR");
        }

    }

    private static void escolherOpcaoMenuPorConstant(String input) {
        OpcoesMenuCompleto opcoesMenuCompleto = OpcoesMenuCompleto.valueOf(input);

        switch (opcoesMenuCompleto) {
            case CADASTRAR_FILME -> System.out.println(" -> Filme Cadastrado");
            case LISTAR_FILMES -> System.out.println(" -> Filme Listado");
            default -> System.out.println("SAIR");
        }
    }

    public static void main(String[] args) {
        exibirMenu();
    }
}
