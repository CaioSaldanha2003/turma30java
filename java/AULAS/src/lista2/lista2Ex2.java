package lista2;

import java.util.Scanner;
public class lista2Ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			int a, b , c;
			
				System.out.println("Informe tr�s n�meros, mas n�o repita nenhum deles");
					System.out.println("A: ");
						a = leia.nextInt();
							System.out.println("B: ");
								b = leia.nextInt();
									System.out.println("C: ");
										c = leia.nextInt();
										
										
											if(a < b && b < c) {
												System.out.println(a+" - "+b+" - "+c+".");
			
											}
		
												else if (a < c && c < b) {
													System.out.println(a+" - "+c+" - "+b+".");
												}
		
													else if (b < a && a < c) {
														System.out.println(b+" - "+a+" - "+c+".");
													}
		
														else if (b < c && c < a) {
															System.out.println(b+" - "+c+" - "+a+".");
														}
		
															else if (c < a && a < b) {
																System.out.println(c+" - "+a+" - "+b+".");
															}
		
																else if (c < b && b < a) {
																	System.out.println(c+" - "+b+" - "+a+".");
																}
		
																else {
																	System.out.println("Inv�lido meu consagrado");
																}
						
	}
}
