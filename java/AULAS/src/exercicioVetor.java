
public class exercicioVetor {

	public static void main(String[] args) {
		
		/*Criar uma aplica��o que consiga ler 5 nomes e cinco notas de uma determinada turma em VETOR.
		A aplica��o ir� ler e calcular e exibir a m�dia das notas da turma.
		E em seguida ser� exibida a rela��o de nomes cuja nota � superior a esta m�dia.*/
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
		System.out.printf("\nA m�dia das notas � %d.\n",media);
		
		for(int x = 0; x < 5; x++) {
		
			System.out.println(alunos[x]+"\t- ["+notas[x]+"]");
			
			
			if(notas[0] > media) {
			System.out.println("\nEst� acima da m�dia, parab�ns!!!");
			}
			else if(notas[0] < media) {
			System.out.println("\nEst� abaixo da m�dia, precisa estudar mais");
			}
			
			
			else if(notas[1] > media) {
			System.out.println("\nEst� acima da m�dia, parab�ns!!!");
			}
			else if(notas[1] < media) {
			System.out.println("\nEst� abaixo da m�dia, precisa estudar mais");
			}
			
			
			else if(notas[2] > media) {
			System.out.println("\nEst� acima da m�dia, parab�ns!!!");
			}
			else if(notas[2] < media) {
			System.out.println("\nEst� abaixo da m�dia, precisa estudar mais");
			}
			
			else if(notas[3] > media) {
			System.out.println("\nEst� acima da m�dia, parab�ns!!!");
			}
			else if(notas[3] < media) {
			System.out.println("\nEst� abaixo da m�dia, precisa estudar mais");
			}
			
			
			else if(notas[4] > media) {
			System.out.println("\nEst� acima da m�dia, parab�ns!!!");
			}
			else if(notas[4] < media) {
			System.out.println("\nEst� abaixo da m�dia, precisa estudar mais");
			}
			
			else {
				System.out.println("sei l� man");
			}
		}
	}

}
