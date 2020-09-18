package Entidades;

public class Funcionarios {
	
	private String nome;
	private int horasTrabalhadas;
	private double valorPorHora;
	
	public Funcionarios() {
		
	}

	public Funcionarios(String nome) {
		this.nome = nome;
	}
	
	public double pagamento() {
		
		return (this.horasTrabalhadas*this.valorPorHora);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	

}
