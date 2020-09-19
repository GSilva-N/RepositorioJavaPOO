package TiposContas;

public abstract class ContaBancaria {
	
	private int numero;
	protected double saldo;
	
	private String transacoes[]= new String [3];
	
	public ContaBancaria(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	//metodos
	
	public void emiteExtrato() {
		System.out.println("Numero da conta:"+this.numero);
		System.out.println("seu saldo é:"+ this.saldo);
	}
	public double credite(double valorDeposito) {
		return this.saldo = (this.getSaldo()+valorDeposito);
	}
	public double debite(double valorDeposito) {
		return this.saldo = (this.getSaldo()-valorDeposito);
	}
	
	//get and set
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String[] getTransacoes() {
		return transacoes;
	}
	public void setTransacoes(String[] transacoes) {
		this.transacoes = transacoes;
	}

}
