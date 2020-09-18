
public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void subirEmArvores() {
		System.out.println("É devagar! É devagar! É devagar!, Devagarinho...");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Preguiça Assobiando");
		System.out.println("Sim, eu assobio!");
	}
	
}
