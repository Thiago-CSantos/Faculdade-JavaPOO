package entitites;

public class Endereco {

	private String rua;
	private String CEP;
	private String cidade;

	public Endereco(String rua, String CEP, String cidade) {
		this.rua = rua;
		this.CEP = CEP;
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", CEP=" + CEP + ", cidade=" + cidade + "]";
	}

}
