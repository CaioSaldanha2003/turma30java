import java.util.Scanner;

public class exemploCondicional1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.println("Entre com a tua idade: ");
		idade = leia.nextInt();
		leia.nextLine();
		System.out.println("Agora informe teu nome: ");
		nome = leia.nextLine();
		
		System.out.printf("Seu nome é %s.",nome);
		System.out.printf("\nSua idade é %d.",idade);
				
				if(idade >= 18) {
					System.out.println("\nTu é de maior, já pode ser preso.");
				}
		
				else if(idade >= 1 && idade < 18) {
					System.out.println("\nVocê é de menor, ainda é uma kid.");
				}
				
				else {
					System.out.println("\nwtf, que idade é essa. . .");
				}

	}

}
