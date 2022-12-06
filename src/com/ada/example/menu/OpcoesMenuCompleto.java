package com.ada.example.menu;

public enum OpcoesMenuCompleto {

    CADASTRAR_FILME(1, "Cadastrar Filme"),
    LISTAR_FILMES(2, "Listar Filmes"),
    SAIR(3, "Sair");

    private final int opcao;
    private final String descricao;

    OpcoesMenuCompleto(int opcao, String descricao) {
        this.opcao = opcao;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getOpcao() {
        return opcao;
    }
}
