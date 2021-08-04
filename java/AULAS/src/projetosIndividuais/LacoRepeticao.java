package projetosIndividuais;

import java.util.Scanner;
public class LacoRepeticao {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String time1 ="SANTOS" ,time2 = "SPFC",time3 = "PALMEIRAS",time4 = "CORINTHIANS";
		int ponto1 = 0,ponto2 = 0,ponto3 = 0,ponto4 = 0;
		char op; //G = GANHOU - 3, P = PERDEU - 0, E = EMPATOU - 1
		//caracter = uma letra, um numero, um simbolo
		
		for(int x = 1; x<= 4; x++) {
			System.out.print(time1+"G - GANOU, P - PERDEU OU E - EMPATOU: ");
			op = leia.next().toUpperCase().charAt(0);
			
			if(op == 'G'){
				ponto1 = 3;
			}
			
			else if(op == 'E') {
				ponto1 = 1;
			}
			
			else if(op == 'P') {
				ponto1 = 0;
			}
			
			else {
				System.out.println("Digitou errado, vai ficar com 0!!!");
			}
		}
		
	}
}
