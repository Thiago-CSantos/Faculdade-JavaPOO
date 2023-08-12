package program;

import entities.Conta;
import entities.ContaEspecial;
import entities.Poupanca;

public class Main {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		ContaEspecial contaEspecial = new ContaEspecial();
		Poupanca contaPoupanca = new Poupanca();

		conta1.setNumeroConta("123");
		conta1.setSaldo(100);
		contaEspecial.setNumeroConta("456");
		contaEspecial.setSaldo(250);
		contaEspecial.setLimite(1000);

		

	}

}
