package program;

import entitie.Empresa;
import entitie.Funcionario;

public class Main {

	public static void main(String[] args) {
		Empresa emp = new Empresa("Soft & Ware Informatica","Rua dos Bobos, 0, Campinas");
		
		Funcionario []funcionarios = new Funcionario[2];
		
		funcionarios[0] = new Funcionario("Thiago", 3500.50, emp);
		
		funcionarios[1] = new Funcionario("Rafael", 3800.50, emp);
		
		for (Funcionario c : funcionarios) {
			System.out.println(c);
		}
		
	}

}
