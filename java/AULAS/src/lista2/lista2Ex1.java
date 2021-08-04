package lista2;

import java.util.Scanner;
public class lista2Ex1 {
	public static void main (String[] args) {;
	Scanner leia = new Scanner(System.in);
	int num1, num2, num3, maiorNum;
	
	System.out.println("Informe o primeiro número: ");
	num1 = leia.nextInt();
	System.out.println("O segundo número: ");
	num2 = leia.nextInt();
	System.out.println("Agora o terceiro, bb: ");
	num3 = leia.nextInt();
	
	
	if(num1 > num2 && num1 > num3) {
			System.out.println("O maior número é "+num1+".");

	}
	
	else if(num2 > num1 && num2 > num3) {
			System.out.println("O maior número é "+num2+".");
	}
	
	else if(num3 > num1 && num3 > num2) {
			System.out.println("O maior número é "+num3+".");
	}
	
	else {
			System.out.println("Números iguais colega.");
	}
	
}
}
