package lista3;

import java.util.Scanner;
public class lista3Ex6 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, soma=0,contador=0,media=0;
		
			do {
		System.out.println("Digite um número: ");
			num = leia.nextInt();
		
					if(num % 3 == 0 && num != 0) {
						soma = soma + num;
						contador++;
					media = soma / contador;
				System.out.println("A média dos números é "+media+".");	
					}	
					
				}while(num != 0);	
		}
	}
