package Projetos;

import java.util.Scanner;
public class Lista5Ex4 {
	public static void main(String[] args) {;
	Scanner leia = new Scanner(System.in);
	int a,b,c,r,s,d;
	
	System.out.println("Valor de: \n");
	System.out.println("A: ");
	a = leia.nextInt();
	System.out.println("B: ");
	b = leia.nextInt();
	System.out.println("C: ");
	c = leia.nextInt();
	
	r = (a+b)*(a+b);
	s = (b+c)*(b+c);
	
	d = (r + s)/2;
	
	System.out.println("R: "+r+", S: "+r+" e D é igual a "+d+".");
}
}