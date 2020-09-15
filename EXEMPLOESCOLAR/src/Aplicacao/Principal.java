package Aplicacao;
import javax.swing.JOptionPane;
import entidades.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno01 = new Aluno("Guilherme Silva", 1994, 'M', 'A');
		
		aluno01.informacoes();
		aluno01.situacaoAluno(5);
		
		

	}

}
