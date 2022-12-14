package com.ada.example.heranca.empresa;

import java.util.Date;

public class Funcionario {

    protected String matriculaFuncionario;
    protected String nome;
    protected String cpf;
    protected Date dataNascimento;
    protected double salario;
    protected String projeto;

    public Funcionario(String nome, String cpf, String matriculaFuncionario) {
        this.nome = nome;
        this.cpf = cpf;
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public void trabalhar() {
        System.out.println("Funcionário trabalhando porque Brasil foi eliminado da Copa.");
    }
}
