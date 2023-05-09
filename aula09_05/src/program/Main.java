package program;

import java.util.Scanner;

import entitie.Pessoa;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pessoa p[] = new Pessoa[3];
		int opcao, code, i;
		String nome, prof;

		do {
			System.out.println("\n===Menu Principal===");
			System.out.println("1-Cadastrar");
			System.out.println("2-Alterar");
			System.out.println("3-Excluir");
			System.out.println("4-Consultar");
			System.out.println("5-Imprimir");
			System.out.println("6-Sair");

			System.out.println("Digite uma opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("______Cadastrar______");
				System.out.println("Codigo: ");
				code = sc.nextInt();
				System.out.println("Nome: ");
				nome = sc.nextLine();
				System.out.println("Profissão: ");
				prof = sc.nextLine();

				i = 0;
				while (i < 3 && p[i] != null) {
					i++;
				}

				if (i < 3) {
					p[i] = new Pessoa(code, nome, prof);
					System.out.println("Pessoa cadastrada");
				} else {
					System.out.println("Vetor cheio. Pesoa NÂO cadastrada");
					break;
				}

			}
			case 2: {
				System.out.println("______Alterar______");
				System.out.println("Digite o codigo da pessoa que deseja alterar:");
				code = sc.nextInt();

				i = 0;
				while (i < 3 && p[i].getCodigo() != code) {
					i++;
				}
				if (i < 3) {
					System.out.println("==Alteração Pessoa==");

					if (p[i].getCodigo() == code) {
						System.out.println("\nDados Cadastrados");
						System.out.println(p.toString());

						System.out.println("Qualcampo deseja alterar?");
						System.out.println("1-nome");
						System.out.println("2-profissao");
						System.out.println("Digite a opção: ");
						opcao = sc.nextInt();

						if (opcao == 1) {
							System.out.println("Digite o novo nome:");
							p[i].setNome(sc.nextLine());
						}
						else if (opcao == 2) {
							System.out.println("Digite o nova profissão:");
							p[i].setProfissao(sc.nextLine());
						}
					}
				}
			}
			default:

			}

		} while (opcao != 6);
	}

}
