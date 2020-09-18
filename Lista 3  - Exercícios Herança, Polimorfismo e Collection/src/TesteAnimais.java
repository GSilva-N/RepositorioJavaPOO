
public class TesteAnimais {

	public static void main(String[] args) {
		
		Cachorro doguinho = new Cachorro("Lobinho", 3);
		Cavalo pangare = new Cavalo("Pangaré", 12);
		Preguica preguica = new Preguica("Soninho", 5);
		
		System.out.println(doguinho.getNome());
		doguinho.correr();
		doguinho.emitirSom();
		
		System.out.println("==========================");
		System.out.println(pangare.getNome());
		pangare.correr();
		pangare.emitirSom();
		
		System.out.println("==========================");
		System.out.println(preguica.getNome());
		preguica.subirEmArvores();
		preguica.emitirSom();
		
	}

}
