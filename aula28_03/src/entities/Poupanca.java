package entities;

public class Poupanca extends Conta{

    private int diaAniversario;

    public Poupanca(String numeroConta, double saldo, int diaAniversario) {
        super(numeroConta, saldo);
        this.diaAniversario = diaAniversario;
    }

    public Poupanca() {
    }

    public int getDiaAniversario(){
        return this.diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario){
        this.diaAniversario = diaAniversario;
    }

}