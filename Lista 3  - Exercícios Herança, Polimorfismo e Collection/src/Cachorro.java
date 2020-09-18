
public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Cachorro Latindo!");
	}
	
	@Override
	public void correr() {
		System.out.println("Cachorro correndo!");
	}

}
