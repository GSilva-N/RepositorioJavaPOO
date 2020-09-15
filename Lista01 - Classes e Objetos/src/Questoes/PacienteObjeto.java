package Questoes;

public class PacienteObjeto {

	public static void main(String[] args) {
		
		PacienteClasse paciente01 = new PacienteClasse("Joaquina", 502, true);
		PacienteClasse paciente02 = new PacienteClasse("Pedro", 709, false);
		
		paciente01.dadosCliente();
		paciente02.dadosCliente();

	}

}
