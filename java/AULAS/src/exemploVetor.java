import java.util.Scanner;
public class exemploVetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] arrayUm = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int[] arrayDois = {80, 70, 60, 50, 40, 30, 20, 10};
		String[] elementos = {"Fogo","Água","Terra","Ar"};
		float[] notas = new float[5];
		
		System.out.printf("O tamanho do array 1 é %d e o tamanho do array 2 é %d.\n",arrayUm.length,arrayDois.length);
		
		for(String i : elementos) {
			System.out.println(i);
		}
		
		for(int x = 0; x < 5; x++) {
			System.out.println("Entre com uma nota: ");
			notas[x] = leia.nextFloat();
		}
		
		for(int x = 0; x < 5; x++) {
			System.out.printf("\nNota - "+(x + 1)+" é igual a "+notas[x]);
		}
		
	}

}
