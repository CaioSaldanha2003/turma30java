package lista4;

import classes.Aviao;
public class lista4Ex2 {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
			aviao1.nome = "Airbus A380";
				aviao1.paisOrig = "Alemanha";
					aviao1.fabric = "EADS Airbus";
						aviao1.quantProd = 234;
							aviao1.capacMax = 853;
								aviao1.numClasses = 3;
		
					System.out.println("O "+aviao1.nome+", conhecido por ser o maior avi�o comercial do mundo foi originalmente fabricado na "+aviao1.paisOrig+".");
						System.out.println("pela "+aviao1.fabric+". Apenas "+aviao1.quantProd+" foram produzidos at� hoje.");
							aviao1.periodoProd(2021);
								System.out.println("At� hoje, foram feitos "+aviao1.quantProd+" modelos, sendo que todos tem a capacidade m�xima de "+aviao1.capacMax+" passageiros e um total de "+aviao1.numClasses+" classes individualmente.");

	}

}
