package lista3;

import java.util.Scanner;
public class lista3Ex5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			int num, somaTotal = 0;
		
					do {
						System.out.println("Mande alguns números, quero encontrar um negócio. . .");
							num = leia.nextInt();
						somaTotal += num;
			} while (num != 0);
					
					System.out.println("ACHEI O QUE EU QUERIA!!! aliás, a soma dos números que você escreveu é "+somaTotal+".");
					
	}
}
