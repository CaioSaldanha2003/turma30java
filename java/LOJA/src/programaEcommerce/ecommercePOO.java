package programaEcommerce;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ecommercePOO { 
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		char op;
		
		Collection<Integer> codigos = new ArrayList<Integer>();
		Collection<String> produtos = new ArrayList<String>();
		Collection<Double> valores = new ArrayList<Double>();
		codigos.add(1);
		codigos.add(2);
		codigos.add(3);
		codigos.add(4);
		codigos.add(5);
		codigos.add(6);
		codigos.add(7);
		codigos.add(8);
		codigos.add(9);
		codigos.add(10);
		produtos.add("Rodo de Pia");
		produtos.add("Vassoura");
		produtos.add("Rob� Aspirador");
		produtos.add("Aspirador de P�");
		produtos.add("Lixeira");
		produtos.add("Rodo M�gico");
		produtos.add("P� de Lixo");
		produtos.add("Tapete de Pia");
		produtos.add("Sacola de Lixo");
		produtos.add("Esfreg�o");
		valores.add(20.0);
		valores.add(10.0);
		valores.add(250.0);
		valores.add(150.0);
		valores.add(15.0);
		valores.add(55.0);
		valores.add(5.0);
		valores.add(22.0);
		valores.add(12.0);
		valores.add(18.0);
		
		System.out.println("Deseja fazer tuas compras aq? S/N");
		op = ler.next().charAt(0);
		
		if(op == 's' || op == 'S') {
			for(int x = 0; x < codigos.size();x++) {
				System.out.println(codigos.add(x));
				}
		} else if (op == 'n' || op == 'N'){
			System.out.println("Que pena, n�o sabe oq t� perdendo seu troxa!!!");
		} else {
			System.out.println("Op��o inv�lida, escreve direito mano...");
		}
}

}
