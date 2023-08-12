package entitie;

public class Pessoa {

	private Integer codigo;
	private String nome;
	private String profissao;
	
	public Pessoa(Integer codigo, String nome, String profissao) {
		this.codigo = codigo;
		this.nome = nome;
		this.profissao = profissao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String toString() {
		return "codigo: "+getCodigo()+"\n Nome:"+getNome()+"\nProfissão: "+getProfissao();
	}
	
}
