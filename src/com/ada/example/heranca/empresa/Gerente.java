package com.ada.example.heranca.empresa;

public class Gerente extends Funcionario {

    protected String departamento;

    public Gerente(String nome,
                   String cpf,
                   String matriculaFuncionario, String departamento) {
        super(nome, cpf, matriculaFuncionario);
        this.departamento = departamento;

    }

    public void contratarFuncionario(){
        System.out.println("Funcionario contratado!");
    }


    @Override
    public void trabalhar() {
        System.out.print("O gerente " + nome + " está ocupado!");
    }
}
