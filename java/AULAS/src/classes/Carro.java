package classes;

public class Carro {
	public String cor;
	public String modelo;
	public double velocidadeAtual;
	public double velocidadeMax;
	
	public void liga() {
		System.out.println("O carro está ligando...");
			}
	
	public void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual+quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	public int pegaMarcha() {
		if(this.velocidadeAtual < 0) {
			return -1;
		}
		if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		}
		if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}
}
