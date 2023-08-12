package entities;

public class Conta {
    private String numeroConta;
    private double saldo;

    public Conta(){
    }

    public Conta(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo=saldo;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

}
