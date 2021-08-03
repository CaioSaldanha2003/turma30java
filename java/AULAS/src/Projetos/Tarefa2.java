package Projetos;

import java.util.Scanner;

public class Tarefa2 {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int idadeDias,anos,meses;
	
	System.out.println("Mande sua idade em dias: ");
	idadeDias = ler.nextInt();
	
	anos = (idadeDias)/365;
	meses = ((idadeDias)%365)/30;
	
	System.out.println("Sua idade em anos é: "+anos+". Sua idade em meses é: "+meses+".");

}
}
