package Projetos;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos,meses,dias,idade;
		
		System.out.println("Digite sua idade em anos: ");
		anos = ler.nextInt();
		System.out.println("Meses remanescentes: ");
		meses = ler.nextInt();
		System.out.println("Dias remanescentes: ");
		dias = ler.nextInt();
		
		anos = anos*365;
		meses = meses*30;
		idade = anos+meses+dias;
		
		System.out.println("Oi!!! Sua idade em dias é "+idade+".");

	}

}
