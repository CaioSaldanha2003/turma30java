package exerciciosProprios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int velocidade, velocidadeMax = 60, multa;

		System.out.print("Qual a velocidade que cê tava correndo ?: ");
		velocidade = ler.nextInt();
		
		if(velocidade >= velocidadeMax + 1 && velocidade <= velocidadeMax + 10) {
			multa = 50;
			System.out.printf("Amigão, tua multa é de R$"+multa + ",00 de reais");
		} else if(velocidade >= velocidadeMax + 11 && velocidade <= velocidadeMax + 30) {
			multa = 100;
			System.out.printf("Amigão, tua multa é de R$"+multa + ",00 de reais");
		} else if(velocidade >= velocidadeMax + 31) {
			multa = 300;
			System.out.printf("Amigão, tua multa é de R$"+multa + ",00 de reais");
		} else {
			multa = 0;
			System.out.printf("Amigão, tua multa é de R$"+multa + ",00 de reais. Cê tá de bouas kk");
		}
	}

}
