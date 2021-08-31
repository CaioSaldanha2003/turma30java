package lista2;

import java.util.Scanner;

public class lista2Ex4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		double raiz, potencia;

		System.out.println("Entre com o primeiro número: ");
		num = leia.nextInt();

		if (num % 2 == 0) {
			raiz = Math.sqrt(num);
			System.out.println("A raiz do número é " + raiz + ".");
		} else if (num % 2 == 1) {
			potencia = Math.pow(num, 2);
			System.out.println("O número ao quadrado é " + potencia + ".");
		} else {
			System.out.println("Valor inválido para o número.");
		}
	}
}