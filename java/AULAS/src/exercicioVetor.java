
public class exercicioVetor {

	public static void main(String[] args) {
		
		/*Criar uma aplicação que consiga ler 5 nomes e cinco notas de uma determinada turma em VETOR.
		A aplicação irá ler e calcular e exibir a média das notas da turma.
		E em seguida será exibida a relação de nomes cuja nota é superior a esta média.*/
		String[] alunos = {"Luffy","Zoro","Nami", "Usopp", "Sanji"};
		int[] notas = {2, 3, 10, 7, 8};
		int acumulador = 0;
		int media = 0;
		
						System.out.println("ALUNOS\tNOTAS");
					for(int x = 0; x < 5; x++) {
				System.out.println(alunos[x]+"\t- ["+notas[x]+"]");
			acumulador += notas[x];
		media = (acumulador / notas.length);
	}
		System.out.printf("\nA média das notas é %d.\n",media);
		
		for(int x = 0; x < 5; x++) {
		
			System.out.println(alunos[x]+"\t- ["+notas[x]+"]");
			
			
			if(notas[0] > media) {
			System.out.println("\nEstá acima da média, parabéns!!!");
			}
			else if(notas[0] < media) {
			System.out.println("\nEstá abaixo da média, precisa estudar mais");
			}
			
			
			else if(notas[1] > media) {
			System.out.println("\nEstá acima da média, parabéns!!!");
			}
			else if(notas[1] < media) {
			System.out.println("\nEstá abaixo da média, precisa estudar mais");
			}
			
			
			else if(notas[2] > media) {
			System.out.println("\nEstá acima da média, parabéns!!!");
			}
			else if(notas[2] < media) {
			System.out.println("\nEstá abaixo da média, precisa estudar mais");
			}
			
			else if(notas[3] > media) {
			System.out.println("\nEstá acima da média, parabéns!!!");
			}
			else if(notas[3] < media) {
			System.out.println("\nEstá abaixo da média, precisa estudar mais");
			}
			
			
			else if(notas[4] > media) {
			System.out.println("\nEstá acima da média, parabéns!!!");
			}
			else if(notas[4] < media) {
			System.out.println("\nEstá abaixo da média, precisa estudar mais");
			}
			
			else {
				System.out.println("sei lá man");
			}
		}
	}

}
