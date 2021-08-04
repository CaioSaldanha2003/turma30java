package projetosIndividuais;

import java.util.Scanner;
public class Lista1Ex3 {
	
	public static void main(String[] args) {;
	Scanner leia = new Scanner(System.in);

	int tempSeg,horas,minutos;
	
	System.out.println("Informe o tempo de duração do evento em segundos: ");
	tempSeg = leia.nextInt();
	
	horas = (tempSeg)/3600;
	minutos = (tempSeg)/60;
	
	System.out.println("O evento durou "+horas+" horas, ou "+minutos+" minutos.");
	
}
}
