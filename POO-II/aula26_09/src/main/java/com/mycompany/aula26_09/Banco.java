
package com.mycompany.aula26_09;

public interface Banco {
    boolean saque(Conta conta, double valor);
    boolean deposito(Conta conta, double valor);
    void extrato(Conta conta);
}
