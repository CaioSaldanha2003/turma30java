import java.util.Scanner;
public class exercicioMatriz {

	public static void main(String[] args) {
		/*um programa que preencha uma matriz 20(linhas)x10(colunas)com numeros 
		 * inteiros, e 
		 * some cada uma das colunas, 
		 * armazenando o resultado da soma em um vetor. 
		 * A seguir o programa devera multiplicar cada elemento da matriz pela soma
		 *  da coluna e mostrar a matriz resultante.*/
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[6][5];
		int soma = 0;
		int[] somaColuna = new int[5];
		
		for(int linha = 0; linha < 6; linha++) {
			for(int coluna = 0; coluna < 5; coluna++) {
				System.out.printf("Preencha os valores da M[%d][%d]: ",(linha + 1),(coluna + 1));
				matriz[linha][coluna] = ler.nextInt();
				soma += matriz[coluna];
			}
		}
		
		System.out.println(soma);
		
	}
	
}