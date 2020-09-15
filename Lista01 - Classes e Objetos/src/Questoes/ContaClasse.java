package Questoes;
import javax.swing.JOptionPane;

public class ContaClasse {
	public int numConta;
	protected String tipo;
	private String cliente;
	private float saldo;
	private boolean status;
	
	public void estadoConta() {
		JOptionPane.showMessageDialog(null, "Conta: "+this.getNumConta());
		JOptionPane.showMessageDialog(null, "Tipo da Conta: "+this.getTipo());
		JOptionPane.showMessageDialog(null, "Cliente: "+this.getCliente());
		JOptionPane.showMessageDialog(null, "Saldo em conta R$ "+this.getSaldo());
		JOptionPane.showMessageDialog(null, "Status: "+this.getStatus());
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50.0f);
		} else if (t == "CP") {
			this.setSaldo(150.0f);
		}
		JOptionPane.showMessageDialog(null, "Você agora possui uma conta!");
	}
	
	public void depositar(float valor) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo()+valor);
			JOptionPane.showMessageDialog(null, "Deposito de R$ "+valor+" na conta de "+this.getCliente());
		} else {
			JOptionPane.showMessageDialog(null, "Conta não encontrada!");
		}
	}	
	 
	public void sacar(float valor) {
		if (this.getStatus()) {
			if (this.getSaldo()>=valor) {
				this.setSaldo(this.getSaldo()-valor);
				JOptionPane.showMessageDialog(null, "Saque realizado no valor de R$ "+valor);
			} else {
				JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Conta não encontrada!");
		}
	}

	public ContaClasse() {
		this.setSaldo(0.0f);
		this.setStatus(false);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
