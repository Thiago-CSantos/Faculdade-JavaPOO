package entitie;

public class Conta {

	private Integer numero;
	private Double saldo;
	private Pessoas p;
	
	public Conta(Integer numero, Double saldo, Pessoas p) {
		this.numero = numero;
		this.saldo = saldo;
		this.p = p;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Pessoas getP() {
		return p;
	}

	public void setP(Pessoas p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", p=" + p + "]";
	}
	
	
}
