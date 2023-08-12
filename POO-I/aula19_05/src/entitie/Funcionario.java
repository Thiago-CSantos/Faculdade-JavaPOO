package entitie;

public class Funcionario {
	private String nome;
	private Double salario;
	private Empresa empregador;
	
	public Funcionario(String nome, Double salario, Empresa emp) {
		this.nome = nome;
		this.salario = salario;
		this.empregador = emp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Empresa getEmpregador() {
		return empregador;
	}

	public void setEmpregador(Empresa empregador) {
		this.empregador = empregador;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", empregador=" + empregador + "]";
	}
	
	
}
