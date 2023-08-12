package program;

import entitie.Funcionario;
import java.util.Scanner;

public class Testa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario []func = new Funcionario[10];
		
		for(int i=0;i<func.length;i++) {
			System.out.println("Numero de registro: ");
			Integer rg = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Nome de funcionario: ");
			String nome = sc.nextLine();
			
			System.out.println("Cargo de funcionario: ");
			String cargo = sc.nextLine();
			
			System.out.println("Salario de funcionario: ");
			Double salario = sc.nextDouble();
			
			func[i] = new Funcionario(rg, nome, cargo, salario);
		}

		
		for(Funcionario f: func) {
			System.out.println(f);
		}
	}

}
