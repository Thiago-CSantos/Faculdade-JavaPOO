package com.mycompany.trabalhomvcswing.controller;

//Formula: "M = C (1 + i)^t" 

import com.mycompany.trabalhomvcswing.model.Juros;

//site para lembra da formula
//https://brasilescola.uol.com.br/matematica/juros-compostos.htm
public class SimularJurosController {

    public SimularJurosController() {
    }

    public double calcularJurosCompostos(Juros j) {
        double taxaMensal = (j.getTaxaJurosAnual() / 12) / 100;

        double valorFuturo = j.getCapital();
        int emMeses = j.getPeriodoAnos() * 12;
        for (int i = 0; i < emMeses; i++) {
            valorFuturo = valorFuturo + (valorFuturo * taxaMensal);
        }

        return valorFuturo - j.getCapital();
    }
}
