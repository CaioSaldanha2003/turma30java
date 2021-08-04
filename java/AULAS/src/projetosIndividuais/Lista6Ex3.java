package projetosIndividuais;

import java.util.Scanner;
public class Lista6Ex3 {
	public static void main(String[] args) {;
	Scanner leia = new Scanner(System.in);
		int idade;
		
				System.out.println("Informe sua idade queridão: ");
		idade = leia.nextInt();
		
			if (idade < 10) {
		System.out.println("Novo demais, portanto sem classe");
			}
			
			else if (idade >= 10 && idade <= 15) {
				System.out.println("Classe Infantil");
			}
			
			else if (idade >= 15 && idade <= 17) {
		System.out.println("Classe Juvenil");
			}
			
			else if (idade >= 18 && idade <= 25) {
				System.out.println("Classe Adulto");
			}
		
			else {
		System.out.println("Velho demais. portanto sem classe");
			}

}
}
