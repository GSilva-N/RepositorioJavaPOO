package Questoes;

public class PatineteObjeto {

	public static void main(String[] args) {
		
		PatineteClasse patinete = new PatineteClasse("Bel Fix E-Scooter", "Azul", true);
		PatineteClasse patinete02 = new PatineteClasse("Street", "Preto", false);
		
		patinete.informacao();
		patinete02.informacao();

	}

}
