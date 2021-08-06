package classes;

public class Aviao {

	public String nome;
	public String paisOrig;
	public String fabric;
	public int quantProd;
	public int capacMax;
	public int numClasses;
	
	public void periodoProd(int anoAtual) {
		System.out.println("O período de produção está ativo desde 2004 a "+anoAtual+".");
	}
}
