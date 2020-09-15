package entidades;

import javax.swing.JOptionPane;

public class Aluno {
	
	public String nomeAluno;
	public int anoDeNascAluno;
	public char sexoAluno;
	public char turmaAluno;
	public int notas[] = new int[4];
	
	
	public Aluno(String nomeAluno, int anoDeNascAluno, char sexoAluno, char turmaAluno) {
		super();
		this.nomeAluno = nomeAluno;
		this.anoDeNascAluno = anoDeNascAluno;
		this.sexoAluno = sexoAluno;
		this.turmaAluno = turmaAluno;
	}
	
	
	@Override
	public String toString() {
		return "Aluno: " + nomeAluno + "\nAno de Nascimento: " + anoDeNascAluno + "\nSexo: " + sexoAluno
				+ "\nTurma do Aluno: " + turmaAluno;
	}

	public void informacoes() {
		JOptionPane.showMessageDialog(null, toString());
	}
	
	public double media() {
		int somaNotas=0;
		double media;
		
		for(int i=0; i<4; i++) {
			notas[i]=Integer.parseInt(JOptionPane.showInputDialog("Nota "+(i+1)));
			somaNotas+=notas[i];
		}
		media=somaNotas/4;
		return media;
	}
	public void situacaoAluno(double mediaEscolar) {
		double media = media();
		if (media<mediaEscolar) {
			JOptionPane.showMessageDialog(null, "REPROVADO PELA MÉDIA: "+media);

		} else if (media>=mediaEscolar) {
			JOptionPane.showMessageDialog(null, "APROVADO PELA MÉDIA: "+media);

		}
	}
	 
}
