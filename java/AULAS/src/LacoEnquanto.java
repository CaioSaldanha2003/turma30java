import java.util.Scanner;
public class LacoEnquanto {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String nome;
		int salario;
		int maiorSalario=0;
		String nomeMaiorSalario="";
		int contador=1;
		char op;
		
		 do {
			 leia.nextLine();
			 if (contador>1) {
			 System.out.println("Continua S/N: ");
				op = leia.next().toUpperCase().charAt(0);
				if(op=='N'){
					break;
				}
			 }
			System.out.print("Digite o nome : ");
			nome = leia.next();
			System.out.print("Digita o salario : ");
			salario = leia.nextInt();
			
			if(salario > maiorSalario) {
				maiorSalario = salario;
				nomeMaiorSalario = nome;
			} 
			contador++;
			
		} while (salario>0);
		System.out.println();
		linha(80);
		if (maiorSalario>0) {
			System.out.printf("O maior salario é %d da pessoa %s\n", maiorSalario, nomeMaiorSalario );
		}
		
		System.out.println("Ate breve!!!");
		

	}
	
	public static void linha(int tamanho) {
		for (int x=1; x<=tamanho; x++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
