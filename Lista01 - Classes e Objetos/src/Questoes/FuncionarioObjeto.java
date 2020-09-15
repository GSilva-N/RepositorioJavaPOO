package Questoes;
import java.util.Scanner;
public class FuncionarioObjeto {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		FuncionarioClasse funcionario01 = new FuncionarioClasse("Marcelo Santos", 1005, "Desenvolvedor");
		
		funcionario01.dadosFuncionario();
	

	}

}
