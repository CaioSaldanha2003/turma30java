package exerciciosProprios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor1, valor2, valor3;
		
		System.out.println("Entre com o valor 1: ");
		valor1 = leia.nextInt();
		System.out.println("Entre com o valor 2: ");
		valor2 = leia.nextInt();
		System.out.println("Entre com o valor 3: ");
		valor3 = leia.nextInt();
		
		if(valor1 > valor2 && valor2 > valor3) {
			System.out.println();
		} else {
			System.out.println("Não é possível fazer a ordem crescente");
		}

	}

}
