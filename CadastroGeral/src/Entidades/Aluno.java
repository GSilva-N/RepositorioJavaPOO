package Entidades;

import java.util.Arrays;

public class Aluno extends Pessoa {
	
	private String turma;
	private int notas[] = new int[2];
	
	public Aluno(String nome, char sexo, int anoNasc, String etnia) {
		super(nome, sexo, anoNasc, etnia);
	}
}
