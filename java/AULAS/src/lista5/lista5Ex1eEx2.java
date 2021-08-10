package lista5;

public class lista5Ex1eEx2 {

	public static void main(String[] args) {
		Animal cachorro = new Cachorro("Ralph",2016);
			Animal cavalo = new Cavalo("Lucky",2006);
				Animal preguica = new BichoPreguica("Soninho",2001);
		
				System.out.printf("A idade do %s é %d anos.\n",cachorro.getNome(),cachorro.calcIdade(2021));
			System.out.printf("A idade do %s é %d anos.\n",cavalo.getNome(),cavalo.calcIdade(2021));
		System.out.printf("A idade do %s é %d anos.\n",preguica.getNome(),preguica.calcIdade(2021));
		
					System.out.printf("\nCachorro(%s): ",cachorro.getNome());
						cachorro.emitirSom();
				System.out.printf("\nCavalo(%s): ",cavalo.getNome());
					cavalo.emitirSom();
			System.out.printf("\nBicho Preguiça(%s): ",preguica.getNome());
				preguica.emitirSom();
		
	}

}
