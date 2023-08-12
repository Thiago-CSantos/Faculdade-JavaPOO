package program;

import java.util.Scanner;

import entitie.ContaBancaria;

public class Main {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria contas[]= new ContaBancaria[3];
		
		Integer op,qtd;
		int i;
		
		do {
			System.out.println("1-Cadastrar");
			System.out.println("2-Alterar Conta");
			System.out.println("3-Excluir conta");
			System.out.println("4-Imprimir Conta");
			System.out.println("5-Depostiar");
			System.out.println("6-Sacar");
			System.out.println("7-Consultar");
			System.out.println("8-Sair");
			op =  sc.nextInt();
			switch (op) {
			//Cadastrar
			case 1: {
				
				System.out.println("Quantos cadastrar: ");
				qtd = sc.nextInt();
				
				for(i=0;i<qtd;i++) {
					
					if(contas[i] != null) {
						System.out.println("Nome: ");
						String nome = sc.next();
						System.out.println("Numero da conta: ");
						String numeroConta = sc.next();
						System.out.println("Saldo: ");
						Double saldo = sc.nextDouble();
						
						contas[i] = new ContaBancaria(numeroConta, nome, saldo);
					}
					
				}
				
			}
			//Alterar conta
			case 2:{
				i=0;
				while(i<3) {
					if(contas[i] != null) {
						System.out.println(contas[i].toString());
					}
					i++;
				}
				
				sc.nextLine();
				
				System.out.println("Qual o numero da conta que deseja alterar? ");
				String numConta = sc.next();
				
				
				i=0;
				while(i< 3 && contas[i] != null) {
					
					if(contas[i].getNumeroConta().equals(numConta)) {
						System.out.println("Nome: ");
						String alt = sc.next();
						contas[i].setNome(alt);
						System.out.println("Nome alterado: "+ contas[i].getNome());
					}
					i++;
				}
				
			}
			//Exluir conta
			case 3:{
				i=0;
				while(i< 3 && contas[i] != null) {
					
				}
			}
			case 4:{
				
			}
			case 5:{
				
			}
			case 6:{
				
			}
			case 7:{
				
			}
			case 8:{
				
			}

		}
		}while(op!=8);

	}

}
