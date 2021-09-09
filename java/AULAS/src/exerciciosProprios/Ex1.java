package exerciciosProprios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int valor1, valor2, valor3, soma2e3;
		
		System.out.print("Informe o primeiro valor: ");
		valor1 = ler.nextInt();
		System.out.print("Informe o segundo valor: ");
		valor2 = ler.nextInt();
		System.out.print("Informe o terceiro valor: ");
		valor3 = ler.nextInt();
		
		soma2e3 = valor2 + valor3;
		
		if(valor1 > soma2e3) {
			System.out.println("é maior... :^");
		} else {
			System.out.println("Nem é maior, mals aew");
		}
	}
}
