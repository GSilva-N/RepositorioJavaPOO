package Questoes;

public class ClienteClasse {
	private String nomeCliente;
	private int cpfCliente;
	private String enderecoCliente;
	private int telefoneCliente;
	
	public ClienteClasse(String nomeCliente, int cpfCliente, String enderecoCliente, int telefoneCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.enderecoCliente = enderecoCliente;
		this.telefoneCliente = telefoneCliente;
	}
	
	@Override
	public String toString() {
		return "Nome do Cliente: " + nomeCliente + "\nCPF: " + cpfCliente + "\nEndereço: "
				+ enderecoCliente + "\nTelefone: " + telefoneCliente;
	}


	public void dadosCliente() {
		System.out.println("=======DADOS DO CLIENTE=======");
		System.out.println(toString());
		System.out.println("==============================");
	}
	
	public void fazerPedido() {
	
	}
	
	public void pagarCompra() {
		
	}
	
	public void devolverCompra() {
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public int getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(int telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
}
