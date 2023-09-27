
package com.mycompany.aula26_09;

public class BancoSakurai implements Banco {
    private Conta contaBancoSakurai;

    public BancoSakurai() {
        this.contaBancoSakurai.setNomeProprietario("Banco Sakurai");
        this.contaBancoSakurai.setNumero(0);
        this.contaBancoSakurai.setSaldo(0.00);
    }

    @Override
    public boolean saque(Conta conta, double valor) {
        if (conta.getSaldo() >= valor) {
            double novoValor = conta.getSaldo() - valor;
            conta.setSaldo(novoValor);
            System.out.println("Saque efetuado");
            return true;
        } else {
            System.out.println("Não consegui fazer o saque");
            extrato(conta);
            return false;
        }
    }

    @Override
    public boolean deposito(Conta conta, double valor) {
        double novoValor = conta.getSaldo() + valor;

        conta.setSaldo(novoValor);
        System.out.println("Deposito efetuado");
        return true;
    }

    @Override
    public void extrato(Conta conta) {
        System.out.println("\n -- BANCO SAKURAI -- \n");
        System.out.println("\n -> EXTRATO CONTA\n");
        System.out.println("Nome: " + conta.getNomeProprietario());
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("\n-------------------------------\n");
    }

    public boolean transferencia(Conta contaOrigem, Conta contaDestaque, double valor) {
        boolean fezSaque = saque(contaDestaque, valor);

        if (fezSaque) {
            deposito(contaDestaque, valor);
            System.out.println("Transferencia efetuada.");
            return true;
        } else {
            System.out.println("Não consegui fazer a transferencia");
            return false;
        }
    }

    public Conta getContaBancoSakurai() {
        return contaBancoSakurai;
    }

    public void setContaBancoSakurai(Conta contaBancoSakurai) {
        this.contaBancoSakurai = contaBancoSakurai;
    }

}
