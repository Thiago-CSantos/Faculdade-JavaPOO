package com.mycompany.trabalhomvcswing.model;

import java.util.List;

public class JurosComposto extends Juros{

    private static List<JurosComposto> listaJuros;

    private int id;
    private double capital;
    private double taxaJurosAnual;
    private int periodoAnos;

    public JurosComposto(double capital, double taxaJurosAnual, int periodoAnos) {
        this.capital = capital;
        this.taxaJurosAnual = taxaJurosAnual;
        this.periodoAnos = periodoAnos;
    }

    public JurosComposto(int id, double capital, double taxaJurosAnual, int periodoAnos) {
        this.id = id;
        this.capital = capital;
        this.taxaJurosAnual = taxaJurosAnual;
        this.periodoAnos = periodoAnos;
    }

    //getters e setters

    public int getId() {
        return id;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public int getPeriodoAnos() {
        return periodoAnos;
    }

    public void setPeriodoAnos(int periodoAnos) {
        this.periodoAnos = periodoAnos;
    }

    // Metodo ToString para imprimir os dados do objeto
    @Override
    public String toString() {
        return "Juros{" + "capital=" + capital + ", taxaJurosAnual=" + taxaJurosAnual + ", periodoAnos=" + periodoAnos + '}';
    }

    // Metodo para calcular juros compostos
    @Override
    public double calcularJurosCompostos(){
        double taxaMensal = (this.getTaxaJurosAnual() / 12) / 100;

        double valorFuturo = this.getCapital();
        int emMeses = this.getPeriodoAnos() * 12;
        for (int i = 0; i < emMeses; i++) {
            valorFuturo = valorFuturo + (valorFuturo * taxaMensal);
        }

        return valorFuturo - this.getCapital();
    }
}
