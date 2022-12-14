package com.ada.example.heranca.empresa;

public class Empresa {

    public static void main(String[] args) {

        Funcionario novoFuncionario = new Funcionario("Helcius", "74589654", "100121");
        System.out.println(novoFuncionario.nome);
        novoFuncionario.trabalhar();

        Gerente gerente = new Gerente("Eduardo", "12547896521", "100120", "JAVA-945");
        System.out.println(gerente.nome);
        gerente.contratarFuncionario();
        gerente.trabalhar();

        Estagiario estagiario = new Estagiario("Rafael G", "4545454", "100154");

        System.out.println(estagiario);

    }
}
