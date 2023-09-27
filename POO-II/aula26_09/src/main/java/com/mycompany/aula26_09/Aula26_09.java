
package com.mycompany.aula26_09;

public class Aula26_09 {

    public static void main(String[] args) {
       Banco bancoCristiano = new BancoCristiano();
       Conta contaC = new Conta();

       contaC.setNomeProprietario("João da Silva");
       contaC.setNumero(111);
       contaC.setSaldo(1000);

       bancoCristiano.deposito(contaC, 100.00);
       bancoCristiano.saque(contaC, 50.00);
       bancoCristiano.extrato(contaC);

       Banco bancoSakurai = new BancoSakurai();
       Conta contaS = new Conta();

       contaS.setNomeProprietario("Rafael");
       contaS.setNumero(222);
       contaS.setSaldo(500);

       bancoSakurai.deposito(contaS, 100.00);
       bancoSakurai.saque(contaS, 50.00);
       bancoSakurai.extrato(contaS);
    }
}
