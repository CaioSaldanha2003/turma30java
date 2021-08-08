import java.util.Scanner;
public class exemploRepeticao2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int idade;
	
		do{
			System.out.printf("Entre com a sua idade: ");
			idade = entrada.nextInt();
			
			System.out.printf("Sua idade é %d anos.",idade);
			
			if(idade >= 18) {
				System.out.println("\nVocê é de maior bro, sinto muito. . .");
			}
			
			else if (idade >= 1 && idade < 18){
				System.out.println("\nVocê é de menor, aproveite o tempo rapaz. . .");
			}
			
			else {
				System.out.println("\nIdade inválida.");
			}
			
		}while(idade >=1);

	}

}
