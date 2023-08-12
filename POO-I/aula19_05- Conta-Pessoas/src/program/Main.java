package program;

import java.util.Scanner;

import entitie.Conta;
import entitie.Pessoas;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int vet_pessoas = 2;
		final int vet_contas =2;
		
		Pessoas pessoas[] = new Pessoas[vet_pessoas];
		Conta conta[] = new Conta[vet_contas];
		int x=0,i = 0;
		
		System.out.println("===Menu Principal===");
		System.out.println("1-Pessoa\n2-Conta\n3-Sair");
		int op = sc.nextInt();
		
		while(x!=3) {
			switch(op) {
			case 1:{
				System.out.println("==Pessoa==");
				System.out.println("1-Cadastrar\n2-Alterar\n3-Excluir\n4-Consultar\n5-Imprimir\n6-Voltarao menu principal");
				int op1 = sc.nextInt();
				switch(op1) {
					case 1:{
						System.out.println("Cadastrar Pessoa: ");
						System.out.println("Nome: ");
						String nome= sc.nextLine();
						System.out.println("CPF: ");
						String cpf = sc.nextLine();
						System.out.println("Digite o rg: ");
						String rg = sc.next();
						
						i=0;
						while(i<vet_pessoas && pessoas[i] != null) {
							i++;
						}
						if(i<vet_pessoas) {
							pessoas[i] = new Pessoas(nome, cpf, rg);
							System.out.println("Pessoa cadastrada com sucesso!");
						}
						else {
							System.out.println("Vetor cheio. Pessoa NÃO cadastrada");
						}
						break;
					}
					case 2:{
						
					}
					case 3:{
						
					}
					case 4:{
						
					}
					case 5:{
						
					}
					case 6:{
						
					}
						
				}
			}
			case 2:{
				System.out.println("==Conta==");
				System.out.println("1-Cadastrar\n2-Alterar\n3-Excluir\n4-Consultar\n5-Imprimir\n6-Voltarao menu principal");
				
				int op1 = sc.nextInt();
				switch(op1) {
					case 1:{
						
					}
					case 2:{
						
					}
					case 3:{
						
					}
					case 4:{
						
					}
					case 5:{
						
					}
					case 6:{
						
					}
						
				}
				
			}
			case 3:{
				x=3;
			}
		}
		
		}
	}

}
