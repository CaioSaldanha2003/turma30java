import java.util.Scanner;
public class exemploRepeticao2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int idade;
	
		do{
			System.out.printf("Entre com a sua idade: ");
			idade = entrada.nextInt();
			
			System.out.printf("Sua idade � %d anos.",idade);
			
			if(idade >= 18) {
				System.out.println("\nVoc� � de maior bro, sinto muito. . .");
			}
			
			else if (idade >= 1 && idade < 18){
				System.out.println("\nVoc� � de menor, aproveite o tempo rapaz. . .");
			}
			
			else {
				System.out.println("\nIdade inv�lida.");
			}
			
		}while(idade >=1);

	}

}
