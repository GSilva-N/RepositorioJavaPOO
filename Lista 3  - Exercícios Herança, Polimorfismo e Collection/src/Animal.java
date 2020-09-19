
public class Animal {
	
	private String nome;
	private int idade;
	
	public Animal() {
		
	}

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void emitirSom() {
		System.out.println("Som do animal");
	}
	
	public void correr() {
		System.out.println("Animal correndo!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}	

}
