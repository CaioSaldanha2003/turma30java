package lista3;

import java.util.Scanner;
public class lista3Ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			int num, quantPar = 0, quantImpar = 0;
		
		for(int x = 0; x < 10; x++) {
			System.out.println("Informe um valor: ");
				num = leia.nextInt();
				
				if (num % 2 == 0) {
					quantPar += 1;
				}
				
					if(num % 2 == 1) {
					quantImpar += 1;
				}
		}
		
		System.out.println("Existem "+quantPar+" números pares e "+quantImpar+" números ímpares.");
		

	}
}
