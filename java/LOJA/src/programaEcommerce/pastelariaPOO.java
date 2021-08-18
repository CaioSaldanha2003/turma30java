package programaEcommerce;

import java.util.ArrayList;
import java.util.Scanner;

import classesEcommerce.Dados;

public class pastelariaPOO {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		char op = 0;
		
		ArrayList<Dados> lista = new ArrayList<>();
		lista.add(new Dados("001","Carne c/queijo",7.0,10));
		lista.add(new Dados("002","Carne Seca",7.0,10));
		lista.add(new Dados("003","Calab c/queijo",7.0,9));
		lista.add(new Dados("004","Pizza	",6.5,8));
		lista.add(new Dados("005","Atum   ",8.0,10));
		lista.add(new Dados("006","Palmito",7.0,9));
		lista.add(new Dados("007","Especial",10.0,10));
		
		System.out.println("Seja bem vindo(a) ao PASTEL DO BOM!!!\n");
		System.out.println("Deseja conferir nosso cardápio? \u00BB S/N \u00AB");
		System.out.print("Opção: "); op = ler.next().charAt(0);

		if(op == 's' || op == 'S') {
			System.out.println("\n\t\t------------------");
			System.out.println("\t       |     CARDÁPIO     |");
			System.out.println("\t\t------------------");
			System.out.println("\nCÓDIGOS\t SABORES\t  PREÇOS\tESTOQUE");
			
			for(int x = 0; x < lista.size(); x++) {
			System.out.print(lista.get(x).getCod()+"\t ");
			System.out.print(lista.get(x).getSab()+"\t  R$ ");
			System.out.print(lista.get(x).getVal()+"	");
			System.out.println(lista.get(x).getEstoque());
			}
			
			System.out.print("\nDigite o código do sabor desejado: ");
			String codSab = ler.next();
			
			for(Dados y : lista) {
				if(codSab.equals(y.getCod())) {
					System.out.printf("\nEntão você quer um pastel do sabor: %s não é mesmo? \u00BB S/N \u00AB",y.getSab());
						System.out.print("\nOpção: "); op = ler.next().charAt(0);
							}
						}	
			System.out.println("Não temos um sabor com esse código, portanto tente novamente...");
			
			} else if (op == 'n' || op == 'N') {
			System.out.println("\nQue pena, volte sempre!!!");
			
		} else {
			System.out.println("\nOpção inválida bro, tente de novo...");
			
				}
			
		}
	}


