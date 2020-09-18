package Aplicacao;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Entidades.Aluno;
import Entidades.Disciplina;
import Entidades.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		Pessoa pessoaTeste = new Pessoa("JOSE");
		Pessoa pessoaTeste2 = new Pessoa("MARIA", 'F');
		
		Disciplina disciplinaTeste = new Disciplina("Português");
		Disciplina disciplinaTeste2 = new Disciplina("Matemática");
		
					
	}
}



