package entities;

public class ContaEspecial extends Conta{

    private double limite;

    public ContaEspecial() {}

   public ContaEspecial(String numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    public double getLimite(){
        return this.limite;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }
    
}