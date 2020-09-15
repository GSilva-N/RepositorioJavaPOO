package Questoes;

public class AviãoObjeto {

	public static void main(String[] args) {
		
		AviaoClasse aviao01 = new AviaoClasse("Boeing", "767F");
		AviaoClasse aviao02 = new AviaoClasse("Airbus", "A319");
		
		aviao01.decolar();
		aviao02.pousar();

	}

}
