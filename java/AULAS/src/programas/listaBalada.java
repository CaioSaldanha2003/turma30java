package programas;

import classes.Pessoa;

public class listaBalada {

	public static void main(String[] args) {
		
		Pessoa primeiroFila = new Pessoa();
		Pessoa segundoFila = new Pessoa();
		primeiroFila.nome = "Paulo";
		primeiroFila.anoNascimento = 2000;
		
		System.out.println("Quem � primeiro da fila? � o "+primeiroFila.nome+".");
		primeiroFila.idade();
	}

}
