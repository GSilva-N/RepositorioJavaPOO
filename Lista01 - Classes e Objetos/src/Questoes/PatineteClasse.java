package Questoes;

public class PatineteClasse {
	private String marcaPatinete;
	private String corPatinete;
	private boolean eletrico;
	
	public PatineteClasse(String marcaPatinete, String corPatinete, boolean eletrico) {
		super();
		this.marcaPatinete = marcaPatinete;
		this.corPatinete = corPatinete;
		this.eletrico = eletrico;
	}
	
	public void informacao() {
		System.out.println("==============================");
		System.out.println(this.marcaPatinete);
		System.out.println(this.corPatinete);
		
		if (this.eletrico == true) {
			System.out.println("Patinete � el�trico");
		}else {
			System.out.println("Patinete n�o � el�trico");
		}
		System.out.println("==============================");
		
	}

	public String getMarcaPatinete() {
		return marcaPatinete;
	}

	public void setMarcaPatinete(String marcaPatinete) {
		this.marcaPatinete = marcaPatinete;
	}

	public String getCorPatinete() {
		return corPatinete;
	}

	public void setCorPatinete(String corPatinete) {
		this.corPatinete = corPatinete;
	}

	public boolean getEletrico() {
		return eletrico;
	}

	public void setEletrico(boolean eletrico) {
		this.eletrico = eletrico;
	}
	
	
	
}
