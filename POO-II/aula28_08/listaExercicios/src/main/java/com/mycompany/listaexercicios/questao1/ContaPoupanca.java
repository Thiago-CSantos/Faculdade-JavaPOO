package com.mycompany.listaexercicios.questao1;

public class ContaPoupanca extends Conta{
    
    @Override
    public void atualizar(int porcento){
        int x = porcento / 100;
        
        double atualizar = getSaldo() * x;
        
        setSaldo(atualizar*3);
    }
    
    @Override
    public void depositar(double valor){
        double saldoAtulizado = getSaldo()+valor;
        
        setSaldo(saldoAtulizado-0.10);
    }
    
}
