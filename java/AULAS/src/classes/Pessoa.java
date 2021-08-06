package classes;

public class Pessoa {
	
	//ATRIBUTOS DA CLASSE
	
	public String nome;
	public int anoNascimento;
	public String cpf;
	public char pronome; //O, A
	public boolean ativo;
	
	//TUDO É MÉTODO ()
	
	public void idade () {
		System.out.println(2021 - this.anoNascimento);
	}
	
	public int calcIdade (int anoAtual) {
		int valor;
		valor = anoAtual - anoNascimento;
		return valor;
	}
	
}
	
