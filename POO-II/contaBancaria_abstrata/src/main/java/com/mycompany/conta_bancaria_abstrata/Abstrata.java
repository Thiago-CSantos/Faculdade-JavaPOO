package com.mycompany.conta_bancaria_abstrata;

import com.mycompany.conta_bancaria_abstrata.model.ContaCorrente;
import com.mycompany.conta_bancaria_abstrata.model.ContaPoupanca;

public class Abstrata {

    public static void main(String[] args) {
        
        ContaPoupanca c1 = new ContaPoupanca();
        c1.setSaldo(1000);
        c1.getSaldo();
        c1.imprimeExtratoDetalhado();

        System.out.println("\n");

        ContaCorrente c2 = new ContaCorrente();
        c2.setSaldo(500);
        c2.setLimiteDoChequeEspecial(900);
        c2.imprimeExtratoDetalhado();

    }
}
