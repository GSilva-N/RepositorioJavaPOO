package TiposContas;

public class ContaPoupanca extends ContaBancaria {
	
	private double juros;
	private double corrMonetaria;
	private int mesAniversario;
	
	public ContaPoupanca(int numero, double saldo, double juros, double corrMonetaria, int mesAniversario) {
		super(numero, saldo);
		this.juros = juros;
		this.corrMonetaria = corrMonetaria;
		this.mesAniversario = mesAniversario;
	}

	//metodos
	public void aniversarioMes() {
		 this.saldo*=this.juros;
	}
	
	//get and set
	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double getCorrMonetaria() {
		return corrMonetaria;
	}

	public void setCorrMonetaria(double corrMonetaria) {
		this.corrMonetaria = corrMonetaria;
	}

	public int getMesAniversario() {
		return mesAniversario;
	}

	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}
	

}
