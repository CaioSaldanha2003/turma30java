package lista3;

import java.util.Scanner;
public class lista3Ex5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			int num, somaTotal = 0;
		
					do {
						System.out.println("Mande alguns n�meros, quero encontrar um neg�cio. . .");
							num = leia.nextInt();
						somaTotal += num;
			} while (num != 0);
					
					System.out.println("ACHEI O QUE EU QUERIA!!! ali�s, a soma dos n�meros que voc� escreveu � "+somaTotal+".");
					
	}
}
