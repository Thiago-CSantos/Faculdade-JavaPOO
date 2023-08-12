package entitie;

public class Conta {

	private String numeroConta;
	private double saldo;
	
	public Conta(String numeroDaConta) {
		this.numeroConta = numeroDaConta;
		this.saldo = 0;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
