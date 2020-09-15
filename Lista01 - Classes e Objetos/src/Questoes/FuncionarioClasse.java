package Questoes;

public class FuncionarioClasse {
	private String nomeFuncionario;
	private int codFuncionario;
	private String cargoFuncionario;
	
	
	public FuncionarioClasse(String nomeFuncionario, int codFuncionario, String cargoFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.codFuncionario = codFuncionario;
		this.cargoFuncionario = cargoFuncionario;
	}


	@Override
	public String toString() {
		return "nomeFuncionario=" + nomeFuncionario + "\ncodFuncionario=" + codFuncionario
				+ "\ncargoFuncionario=" + cargoFuncionario;
	}
	
	public void dadosFuncionario() {
		System.out.println("=======DADOS DO FUNCIONÁRIO=======");
		System.out.println(toString());
		System.out.println("==================================");
	}
	
	
	

}
