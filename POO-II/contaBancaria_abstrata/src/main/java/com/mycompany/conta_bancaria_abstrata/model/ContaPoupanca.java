package com.mycompany.conta_bancaria_abstrata.model;

public class ContaPoupanca extends Conta {

private double taxaDeJuros;

    @Override
    public void imprimeExtratoDetalhado() {
        System.out.println("Taxa de juros: "+ this.taxaDeJuros);
        System.out.println(getSaldo());
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }



    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    
}
