package com.mycompany.listaexercicios.questao1;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo) {
        super(saldo);
    }
    
    @Override
    public void atualizar(int porcento){
        int x = porcento / 100;
        
        double atualizar = getSaldo() * x;
        
        setSaldo(atualizar*2);
    }
    
}
