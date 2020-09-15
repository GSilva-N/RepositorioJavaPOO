package Questoes;

public class ProdEletronicoClasse {
	
	private String nomeProduto;
	private String marcaProduto;
	private double precoProduto;
	
	public ProdEletronicoClasse(String nomeProduto, String marcaProduto, double precoProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.marcaProduto = marcaProduto;
		this.precoProduto = precoProduto;
	}
	
	public void ligar() {
		System.out.println(this.nomeProduto+" está ligada!");
	}
	
	public void desligar() {
		System.out.println(this.nomeProduto+" está desligada!");
	}
	
	

}
