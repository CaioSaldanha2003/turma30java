package projetosIndividuais;

import java.util.Scanner;
public class Lista2Ex1 {
	public static void main (String[] args) {;
	Scanner leia = new Scanner(System.in);
	int num1, num2, num3, maiorNum;
	
	System.out.println("Informe o primeiro n�mero: ");
	num1 = leia.nextInt();
	System.out.println("O segundo n�mero: ");
	num2 = leia.nextInt();
	System.out.println("Agora o terceiro, bb: ");
	num3 = leia.nextInt();
	
	
	if(num1 > num2 && num1 > num3) {
			System.out.println("O maior n�mero � "+num1+".");

	}
	
	else if(num2 > num1 && num2 > num3) {
			System.out.println("O maior n�mero � "+num2+".");
	}
	
	else if(num3 > num1 && num3 > num2) {
			System.out.println("O maior n�mero � "+num3+".");
	}
	
	else {
			System.out.println("N�meros iguais colega.");
	}
	
}
}