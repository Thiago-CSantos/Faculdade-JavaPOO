package entities;

public class Automovel {
	private String modelo;
	private String cor;
	private String combustivel;
	
	public Automovel(String modelo, String cor, String combustivel) {
		this.modelo = modelo;
		this.cor = cor;
		this.combustivel = combustivel;
	}

	public Automovel(String modelo, String combustivel) {
		this.modelo = modelo;
		this.combustivel = combustivel;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String toString() {
		return "\nModelo:"+modelo+"\nCor:"+cor+"\nCombustivel:"+combustivel;
	}
	
	public double quantoCusta(double valorAutomovel) {
		return valorAutomovel;
	}
	
}
