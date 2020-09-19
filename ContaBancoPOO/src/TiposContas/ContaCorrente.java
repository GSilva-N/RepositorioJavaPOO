package TiposContas;

public class ContaCorrente extends ContaBancaria {
	
	private int talonario;
	
	public ContaCorrente(int numero, double saldo,int talonario) {
		super(numero, saldo);
		this.talonario= talonario;
	}

	
	public void emiteTalonario() {
		if (talonario == 0) {
			talonario++;
			System.out.println("O numero de talonário é:"+talonario);
		}
	}

	//get and set
	public int getTalonario() {
		return talonario;
	}

	public void setTalonario(int talonario) {
		this.talonario = talonario;
	}
}
