package programas;

import classes.Carro;
public class exemploPOO2 {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.cor = "Vermelho";
		carro1.modelo = "Fusca";
		carro1.velocidadeAtual = 0;
		carro1.velocidadeMax = 80;
		
		carro1.liga();
		carro1.acelera(70);
		System.out.println(carro1.velocidadeAtual);
		System.out.println("Marcha: "+carro1.pegaMarcha());
	}

}
