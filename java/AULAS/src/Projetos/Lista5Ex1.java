package Projetos;

import java.util.Scanner;
public class Lista5Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anos,meses,dias,idade;
		
		System.out.println("Digite sua idade em anos: ");
		anos = leia.nextInt();
		System.out.println("Meses remanescentes: ");
		meses = leia.nextInt();
		System.out.println("Dias remanescentes: ");
		dias = leia.nextInt();
		
		anos = anos*365;
		meses = meses*30;
		idade = anos+meses+dias;
		
		System.out.println("Oi!!! Sua idade em dias é "+idade+".");

	}

}
