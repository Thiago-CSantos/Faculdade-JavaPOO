package entitie;

public class Pessoas {

	private String nome;
	private String cpf;
	private String rg;
	
	public Pessoas(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + "]";
	}
	
	
}
