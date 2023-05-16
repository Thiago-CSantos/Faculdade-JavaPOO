package entitie;

public class ContaBancaria {

	private String numeroConta;
	private String nome;
	private double saldo;
	
	public ContaBancaria(String numeroConta, String nome, Double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar() {
		
	}
	
	public void depositar() {
		
	}
	
	@Override
	public String toString() {
		return "ContaBancaria=" + numeroConta + "\nnome=" + getNome() + "\nsaldo=" + saldo + "";
	}
	
	

}
