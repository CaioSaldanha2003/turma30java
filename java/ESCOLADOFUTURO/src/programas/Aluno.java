package programas;

public class Aluno {
	
	//atributos - variavel
	public String nome;
	public String matricula;
	public boolean ativo;
	public int nota;
	public int anoNascimento;
	
	
	//sobrecarga - mais do mesmo
	//construtores
	//encapsulamento - seguran�a - getters and setters
	//metodos
	public void mostraIdade(int anoAtual) {
		System.out.println("a idade � "+(anoAtual-anoNascimento));
	}
	
	//polimorfismo
	//heran�a
	//abstra��o
	//delega��o
	//override - annotation
}
