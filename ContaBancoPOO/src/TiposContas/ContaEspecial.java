package TiposContas;

public class ContaEspecial extends ContaCorrente {
	
	private double limite;
	final double Selic=1.16;

	public ContaEspecial(int numero, double saldo, int talonario, double limite) {
		super(numero, saldo, talonario);
		this.limite = limite;
	}

	//metodos
	public double calculaJuros() {
		//selic 2 
		return saldo*Selic; 
	}

	//get and set
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
