package com.mycompany.conta_bancaria_abstrata.model;

public class ContaCorrente extends Conta{

    private double limiteDoChequeEspecial;

    public double getLimiteDoChequeEspecial() {
        return limiteDoChequeEspecial;
    }

    public void setLimiteDoChequeEspecial(double limiteDoChequeEspecial) {
        this.limiteDoChequeEspecial = limiteDoChequeEspecial;
    }

    @Override
    public void imprimeExtratoDetalhado() {
        System.out.println("Taxa de juros: "+ this.limiteDoChequeEspecial);
        System.out.println(getSaldo());
    }

    
}
