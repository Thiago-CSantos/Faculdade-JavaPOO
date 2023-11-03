package com.mycompany.trabalhomvcswing.controller;

//Formula: "M = C (1 + i)^t" 
//site para lembra da formula
//https://brasilescola.uol.com.br/matematica/juros-compostos.htm
public class SimularJuros {

    public SimularJuros() {
    }

    public double calcularJurosCompostos(double capital, double taxaJurosAnual, int periodoAnos) {
        double taxaMensal = (taxaJurosAnual / 12) / 100;

        double valorFuturo = capital;
        int emMeses = periodoAnos * 12;
        for (int i = 0; i < emMeses; i++) {
            valorFuturo = valorFuturo + (valorFuturo * taxaMensal);
        }

        return valorFuturo - capital;
    }
}
