package lista5;

public class Cachorro extends Animal {
	private String emitirSom;

	public Cachorro (String nome,int anoNascimento) {
		super(nome,anoNascimento);
	}
	
	public void correr() {
		System.out.println("*correndo por aí*");
	}
}
