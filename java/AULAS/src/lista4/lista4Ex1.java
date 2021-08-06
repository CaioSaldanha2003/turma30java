package lista4;

import classes.Cliente;
public class lista4Ex1 {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
			cliente1.nome = "Caio";
				cliente1.anoNascimento = 2003;
					cliente1.dinheiro = 30;
						cliente1.produtoDesejado = "PC Gamer";
		
			System.out.println("O cliente "+cliente1.nome+", cuja idade é "+cliente1.mostraIdade()+", deseja comprar um "+cliente1.produtoDesejado+".");
				System.out.println("Mas o cliente só tem "+cliente1.dinheiro+" reais na carteira.");
	}
}
