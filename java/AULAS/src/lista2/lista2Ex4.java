package lista2;

import java.util.Scanner;

public class lista2Ex4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		double raiz, potencia;

		System.out.println("Entre com o primeiro n�mero: ");
		num = leia.nextInt();

		if (num % 2 == 0) {
			raiz = Math.sqrt(num);
			System.out.println("A raiz do n�mero � " + raiz + ".");
		} else if (num % 2 == 1) {
			potencia = Math.pow(num, 2);
			System.out.println("O n�mero ao quadrado � " + potencia + ".");
		} else {
			System.out.println("Valor inv�lido para o n�mero.");
		}
	}
}