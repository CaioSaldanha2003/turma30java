package classes;

public class Cliente {
	public String nome;
	public int anoNascimento;
	public int dinheiro;
	public String produtoDesejado;
	
	public int mostraIdade() {
		return 2021 - anoNascimento;
	}
}
