
public class exercicioVetor {

	public static void main(String[] args) {
		
		/*Criar uma aplica��o que consiga ler 5 nomes e cinco notas de uma determinada turma em VETOR.
		A aplica��o ir� ler e calcular e exibir a m�dia das notas da turma.
		E em seguida ser� exibida a rela��o de nomes cuja nota � superior a esta m�dia.*/
		String[] alunos = {"Larissa","Cec�lia","Laura", "Lays", "Mel"};
		int[] notas = {2, 3, 9, 7, 8};
		int acumulador = 0;
		int media = 0;
		
						System.out.println("ALUNAS:\tNOTAS:");
					for(int x = 0; x < 5; x++) {
				System.out.println(alunos[x]+"\t- ["+notas[x]+"]");
			acumulador += notas[x];
		media = (acumulador / notas.length);
	}
					
		System.out.printf("\nA m�dia das notas � %d.\n\n",media);
		
		System.out.println("FEEDBACK: ");
		
				for(int x = 0; x < 5; x++) {
					System.out.println(alunos[x]+"\t- ["+notas[x]+"]"+(notas[x] > media ? "\t- Parab�ns, voc� � uma nerd!!!" : "\t- C� precisa estudar amiguxa. . ."));
			}
		}
	}
