package entitites;

public class Cliente {

	private String cpf;
	private String nome;
	private Endereco end;
	private String complemento;
	private Integer numero;

	public Cliente(String cpf, String nome, Endereco end, String complemento, Integer numero) {
		this.cpf = cpf;
		this.nome = nome;
		this.end = end;
		this.complemento = complemento;
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", end=" + end + ", complemento=" + complemento + ", numero="
				+ numero + "]";
	}

	
}
