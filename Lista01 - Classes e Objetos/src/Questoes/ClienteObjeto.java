package Questoes;

public class ClienteObjeto {

	public static void main(String[] args) {
		
		ClienteClasse cliente01 = new ClienteClasse("Jo�o de Souza", 100, "Rua da Pedra", 988887777);
		cliente01.dadosCliente();
		
		ClienteClasse cliente02 = new ClienteClasse("Maria da Silva", 101, "Rua da �rvore", 955552222);
		cliente02.dadosCliente();

	}

}
