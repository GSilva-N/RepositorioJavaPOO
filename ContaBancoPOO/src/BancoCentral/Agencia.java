package BancoCentral;

import TiposContas.ContaCorrente;

public class Agencia {

	public static void main(String[] args) {
		

		ContaCorrente contacorrente1 = new ContaCorrente(1234654,0.0,2);
		
		contacorrente1.credite(100);
		contacorrente1.emiteExtrato();
		contacorrente1.debite(30);
		contacorrente1.emiteExtrato();

	}

}
