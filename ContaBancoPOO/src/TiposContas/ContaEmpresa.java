package TiposContas;

public class ContaEmpresa extends ContaBancaria {
	
	private double limiteEmpresa;
	
	public ContaEmpresa(int numero, double saldo,double limiteEmpresa) {
		super(numero, saldo);
		this.limiteEmpresa= limiteEmpresa;
		
	}
	
	//metodos
	public void emprestimoEmpresarial() {
		this.saldo=this.limiteEmpresa*2;		
	}
	
	//get and set
	public double getLimiteEmpresa() {
		return limiteEmpresa;
	}

	public void setLimiteEmpresa(double limiteEmpresa) {
		this.limiteEmpresa = limiteEmpresa;
	}

}
