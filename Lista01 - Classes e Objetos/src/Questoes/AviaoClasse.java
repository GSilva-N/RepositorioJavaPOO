package Questoes;

public class AviaoClasse {
	private String fabricanteAviao ;
	private String modeloAviao;
	
	public AviaoClasse(String fabricanteAviao, String modeloAviao) {
		super();
		this.fabricanteAviao = fabricanteAviao;
		this.modeloAviao = modeloAviao;
	}
	
	public void decolar() {
		System.out.println(this.getFabricanteAviao()+" "+this.getModeloAviao()+" decolou!");
	}
	public void pousar() {
		System.out.println(this.getFabricanteAviao()+" "+this.getModeloAviao()+" pousou!");
	}

	public String getFabricanteAviao() {
		return fabricanteAviao;
	}

	public void setFabricanteAviao(String fabricanteAviao) {
		this.fabricanteAviao = fabricanteAviao;
	}

	public String getModeloAviao() {
		return modeloAviao;
	}

	public void setModeloAviao(String modeloAviao) {
		this.modeloAviao = modeloAviao;
	}
}
