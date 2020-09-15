package Questoes;

public class ContaObjeto {

	public static void main(String[] args) {
		ContaClasse cliente01 = new ContaClasse();
		cliente01.setNumConta(101);
		cliente01.setCliente("Jubileu");
		cliente01.abrirConta("CC");
		cliente01.estadoConta();
		
		
		ContaClasse cliente02 = new ContaClasse();
		cliente02.setNumConta(102);
		cliente02.setCliente("Creuza");
		cliente02.abrirConta("CP");
		cliente02.estadoConta();

	}

}
