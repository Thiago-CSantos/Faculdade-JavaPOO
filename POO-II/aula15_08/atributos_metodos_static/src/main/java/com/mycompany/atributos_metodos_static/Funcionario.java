package com.mycompany.atributos_metodos_static;

public class Funcionario {

    String nome;
    double salario;
    static double valeRefeicaoDiario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    static void reajustarValeRefeicaoDiario(double taxa){
        valeRefeicaoDiario += valeRefeicaoDiario * taxa;
    }

}
