package lista2;

import java.util.Scanner;
public class lista2Ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			int a, b , c;
			
				System.out.println("Informe três números, mas não repita nenhum deles");
					System.out.println("A: ");
						a = leia.nextInt();
							System.out.println("B: ");
								b = leia.nextInt();
									System.out.println("C: ");
										c = leia.nextInt();
										
										
		if(a < b && a < c) {
			System.out.println(a+" - "+b+" - "+c+".");
			
		}
		
		else if (a < c && a < b) {
				System.out.println(a+" - "+c+" - "+b+".");
		}
		
		else if (b < a && b < c) {
				System.out.println(b+" - "+a+" - "+c+".");
		}
		
		else if (b < c && b < a) {
				System.out.println(b+" - "+c+" - "+a+".");
		}
		
		else if (c < a && c < b) {
				System.out.println(c+" - "+a+" - "+b+".");
		}
		
		else if (c < b && c < a) {
				System.out.println(c+" - "+b+" - "+a+".");
		}
		
		else {
				System.out.println("Inválido meu consagrado");
		}
						
	}
}
