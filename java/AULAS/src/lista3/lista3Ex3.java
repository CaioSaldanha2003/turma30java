package lista3;

import java.util.Scanner;
public class lista3Ex3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade=0, totalMenos21=0, totalMais50=0;
		
				while(idade != -99) {
			System.out.println("Informe sua idade, meu guerreiro: ");
			idade = leia.nextInt();
			
				if(idade < 21) {
			totalMenos21 = totalMenos21 + 1;
			}
				if(idade > 50) {
			totalMais50 = totalMais50 + 1;
			}
		}
				
	System.out.println("Total de pessoas com menos de 21 anos: "+totalMenos21);
	System.out.println("Total de pessoas com mais de 50 anos: "+totalMais50);
	
	}
}
