package application;

import entities.Cachorro;
import entities.Gato;
public class testePet {

	public static void main(String[] args) {
		Cachorro cao = new Cachorro("Pinscher",2010,true);
		Gato gato = new Gato("Persa",2019,false);
		
		System.out.printf("O %s ",cao.getRaca());
		cao.avaliacaoLatido();
		cao.somAlto();
		System.out.printf("\nJá o %s ",gato.getRaca());
		gato.avaliacaoMiado();
		gato.somBaixo();
		

	}

}
