package com.ada.example.heranca.empresa;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, String cpf, String matriculaFuncionario) {
        super(nome, cpf, matriculaFuncionario);
    }

    @Override
    public String toString() {
        return "Estagiario:" + nome;
    }
}
