package entitie;

public class Funcionario {
	
	private Integer numRegistro;
	private String nomeFuncionario;
	private String cargo;
	private Double salario;
	
	public Funcionario(Integer numRegistro, String nomeFuncionario, String cargo, Double salario) {
		this.numRegistro = numRegistro;
		this.nomeFuncionario = nomeFuncionario;
		this.cargo = cargo;
		this.salario = salario;
	}

	public Integer getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(Integer numRegistro) {
		this.numRegistro = numRegistro;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [numRegistro=" + numRegistro + ", nomeFuncionario=" + nomeFuncionario + ", cargo=" + cargo
				+ ", salario=" + salario + "]";
	}
	

}
