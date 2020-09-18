package Entidades;

public class Terceiros extends Funcionarios {
	
	private double horasAdicionais;
	
	public Terceiros() {
		
	}


	public Terceiros(String nome, double horasAdicionais) {
		super(nome);
		this.horasAdicionais = horasAdicionais;
	}
	
	public double pagamento() {
		
		return ((this.getHorasTrabalhadas()+this.horasAdicionais)*this.getValorPorHora());
	}

	public double getHorasAdicionais() {
		return horasAdicionais;
	}

	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}

}
