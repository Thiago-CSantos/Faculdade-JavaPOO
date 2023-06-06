package program;

import java.util.Scanner;

import entitites.Cliente;
import entitites.Endereco;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int vetC = 3;
		final int vetE = 3;

		Cliente[] clientes = new Cliente[vetC];
		Endereco[] enderecos = new Endereco[vetE];
		int op, op2, i, a = 1;
		String nome = null, cpf = null, complemento = null, CEP;
		Integer numero = null;

		do {

			System.out.println("\n\n==[Menu Principal]==");
			System.out.println("1 - Cliente");
			System.out.println("2 - Endereco");
			System.out.println("3 - Sair");

			System.out.println("Digite a opção desejada: ");
			op = sc.nextInt();

			switch (op) {
			case 1:

				do {
					System.out.println("\n\n==[Cliente]==");
					System.out.println("1 - Cadastrar");
					System.out.println("2 - Alterar");
					System.out.println("3 - Excluir");
					System.out.println("4 - Consultar");
					System.out.println("5 - Imprimir");
					System.out.println("6 - Sair");
					System.out.println("Digite a opção desejada: ");
					op2 = sc.nextInt();

					switch (op2) {
					case 1: {

						if (a > 0) {
							System.out.println("\n\n==[Cadastrar Cliente]==");
							System.out.println("Digite o nome: ");
							nome = sc.nextLine();
							sc.nextLine();
							System.out.println("Digite o CPF: ");
							cpf = sc.next();
							System.out.println("Digite o Complemento: ");
							complemento = sc.nextLine();
							sc.nextLine();
							System.out.println("Digite o numero: ");
							numero = sc.nextInt();

							System.out.println("CEP:");
							CEP = sc.next();
						}

						i = 0;
						while (i < vetC && clientes[i] != null) {
							i++;
						}

						if (i < vetC) {
							clientes[i] = new Cliente(cpf, nome, enderecos[i], complemento, numero);
						} else {
							break;
						}
						break;
					}

					case 4:
						System.out.println("\n\n==[Consultar Cliente]==");
						System.out.println("Digite o CEP da pessoa que deseja consultar: ");
						String cep = sc.next();

						i = 0;
						while (i < vetC && cep.equals(enderecos[i].getCEP())) {
							i++;
						}

						if (i < vetC) {
							clientes[i].toString();
						}

					}

				} while (op2 != 6);

			case 2:
				a = 2;

//				if(CEP.equals(enderecos[a].getCEP()) ) {
//					System.out.println("Rua: ");
//					String rua = sc.next();
//					System.out.println("CEP: ");
//					String cep = sc.next();
//					System.out.println("Cidade: ");
//					String cidade = sc.next();
//					enderecos[i] = new Endereco(rua, cep, cidade);
//				}else {
//					System.out.println("Endereco ja cadastrado!");
//				}
			}

		} while (op != 3);

	}

}
