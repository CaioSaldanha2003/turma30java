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
		
		System.out.printf("Seu nome � %s.",nome);
		System.out.printf("\nSua idade � %d.",idade);
				
				if(idade >= 18) {
					System.out.println("\nTu � de maior, j� pode ser preso.");
				}
		
				else if(idade >= 1 && idade < 18) {
					System.out.println("\nVoc� � de menor, ainda � uma kid.");
				}
				
				else {
					System.out.println("\nwtf, que idade � essa. . .");
				}

	}

}
