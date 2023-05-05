package program;

import entitie.Produto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Produto []prod = new Produto[1];
		
		Integer cd;
		Double preco;
		String desc;
		
		for(int i =0; i < prod.length; i++) {
			System.out.println("Codigo: ");
			cd = sc.nextInt();
			System.out.println("Preço: ");
			preco = sc. nextDouble();
			
			sc.nextLine();
			
			System.out.println("Descrição: ");
			desc = sc.nextLine();
			
			prod[i] = new Produto(cd, desc, preco);
			
			System.out.println("Deseja reajustar o preço? (s/n)");
			char c = sc.next().charAt(0);
			
			if(c == 's') {
				System.out.println("Quantos % deseja o reajuste? ");
				double reaj = sc.nextDouble();
				double x = prod[i].reajuste(reaj);
				
				System.out.println("Valor do reajuste: "+x);
			}
		}
		
		for(Produto p: prod) {
			System.out.println(p);
		}
		
	}

}
