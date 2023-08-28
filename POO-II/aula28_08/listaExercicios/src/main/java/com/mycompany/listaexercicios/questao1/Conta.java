package com.mycompany.listaexercicios.questao1;

public class Conta {
    private double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void atualizar(int porcento){
        int x = porcento / 100;
        
        double atualizar = getSaldo() * x;
        
        setSaldo(atualizar);
    }
    
    public void depositar(double valor){
        setSaldo(saldo+valor);
    }
}
