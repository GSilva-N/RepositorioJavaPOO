
public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void subirEmArvores() {
		System.out.println("� devagar! � devagar! � devagar!, Devagarinho...");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Pregui�a Assobiando");
		System.out.println("Sim, eu assobio!");
	}
	
}
