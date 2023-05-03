package program;

import entitie.Conta;

public class Main {

	public static void main(String[] args) {

		Conta []contas = new Conta[4];
		
		contas[0] = new Conta("1234-1");
		contas[1] = new Conta("1234-2");
		contas[2] = new Conta("1234-3");
		contas[3] = new Conta("1234-4");
	
		System.out.println("Não usando for");
		System.out.println(contas[2].getNumeroConta());
		
		System.out.println("");
		System.out.println("Usando for");
		for (int i=0; i<contas.length; i++) {
			System.out.println(contas[i].getNumeroConta());
		}
		
		System.out.println("");
		System.out.println("Usando foreach");
		for (Conta cont : contas) {
			System.out.println(cont.getNumeroConta());
		}
		
	}

}
