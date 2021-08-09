
public class exercicioVetor {

	public static void main(String[] args) {
		
		/*Criar uma aplicação que consiga ler 5 nomes e cinco notas de uma determinada turma em VETOR.
		A aplicação irá ler e calcular e exibir a média das notas da turma.
		E em seguida será exibida a relação de nomes cuja nota é superior a esta média.*/
		String[] alunos = {"Larissa","Cecília","Laura", "Lays", "Mel"};
		int[] notas = {2, 3, 9, 7, 8};
		int acumulador = 0;
		int media = 0;
		
						System.out.println("ALUNAS:\tNOTAS:");
					for(int x = 0; x < 5; x++) {
				System.out.println(alunos[x]+"\t- ["+notas[x]+"]");
			acumulador += notas[x];
		media = (acumulador / notas.length);
	}
					
		System.out.printf("\nA média das notas é %d.\n\n",media);
		
		System.out.println("FEEDBACK: ");
		
				for(int x = 0; x < 5; x++) {
					System.out.println(alunos[x]+"\t- ["+notas[x]+"]"+(notas[x] > media ? "\t- Parabéns, você é uma nerd!!!" : "\t- Cê precisa estudar amiguxa. . ."));
			}
		}
	}
