package Questoes;

import javax.swing.JOptionPane;

public class PacienteClasse {
	private String nomePaciente;
	private int cpfPaciente;
	private boolean convenioCliente;
	
	
	public PacienteClasse(String nomePaciente, int cpfCliente, boolean convenioCliente) {
		super();
		this.nomePaciente = nomePaciente;
		this.cpfPaciente = cpfCliente;
		this.convenioCliente = convenioCliente;
	}
	
	public void dadosCliente() {
		if (this.convenioCliente == true) {
		System.out.println("=======DADOS DO PACIENTE=======");
		System.out.println("Paciente: " + nomePaciente + "\nCPF:" + cpfPaciente+"\nTem convenio");
		System.out.println("==============================");
		} else {
			System.out.println("=======DADOS DO PACIENTE=======");
			System.out.println("Paciente: " + nomePaciente + "\nCPF:" + cpfPaciente
					+ "\nNão tem convenio");
			System.out.println("==============================");
		}
	}
}
