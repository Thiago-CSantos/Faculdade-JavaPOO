package program;

import entities.Automovel;
import entities.AutomovelBasico;
import entities.AutomovelLuxo;

public class TestarAutomovel {

	public static void main(String[] args) {
		
		Automovel automovel = new Automovel("Fox", "Vermelho", "Gasosa");
		
		AutomovelLuxo automovelLuxo = new AutomovelLuxo("Prisma", "Prata", "Alcool", true, false, true);
		
		AutomovelBasico automovelBasico = new AutomovelBasico("Tesla", "pretão", "Hibrido", true, false, true, true);

		
		System.out.println(automovel);
		System.out.println(automovelLuxo);
		System.out.println(automovelBasico);
		
		double a = automovel.quantoCusta(50000);
		double b = automovelLuxo.quantoCusta(50000);
		double c = automovelBasico.quantoCusta(50000);
		
		System.out.println("\n valor dos custos:\n"+a);
		System.out.println(b);
		System.out.println(c);
	}

}
