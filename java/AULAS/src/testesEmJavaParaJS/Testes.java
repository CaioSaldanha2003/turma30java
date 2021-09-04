package testesEmJavaParaJS;

import java.util.ArrayList;
import java.util.List;

public class Testes {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();

		for (int i = 0; i <= 6; i++) {
			numeros.add(i);
		}

		int contador = 0;
		int numero = 0;
		for(Integer i : numeros) {

			for(int u = 1; u <= i; u++) {
				if (i % u == 0) {
					contador++;
					numero = u;
				}
			}

			if (contador == 2) {
				System.out.println("O Número: " + numero + " é primo.");
			}
		}

	}
}
