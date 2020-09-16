package Questoes;

public class AviaoClasse {
	public String fabricanteAviao ;
	public String modeloAviao;
	
	public AviaoClasse(String fabricanteAviao, String modeloAviao) {
		super();
		this.fabricanteAviao = fabricanteAviao;
		this.modeloAviao = modeloAviao;
	}
	
	public void decolar() {
		System.out.println(this.fabricanteAviao+" "+this.modeloAviao+" decolou!");
	}
	public void pousar() {
		System.out.println(this.fabricanteAviao+" "+this.modeloAviao+" pousou!");
	}

}
