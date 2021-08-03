package projetosIndividuais;

import java.util.Scanner;
public class Lista5Ex2 {
	
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int idadeDias,anos,meses;
	
	System.out.println("Mande sua idade em dias: ");
	idadeDias = leia.nextInt();
	
	anos = (idadeDias)/365;
	meses = ((idadeDias)%365)/30;
	
	System.out.println("Sua idade em anos é: "+anos+". Sua idade em meses e "+meses+".");

}
}
