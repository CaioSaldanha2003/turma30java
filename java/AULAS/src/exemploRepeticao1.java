
public class exemploRepeticao1 {

	public static void main(String[] args) {
		int soma = 0;
		
		for(int x = 1; x <= 10; x++) {
			System.out.printf("\n%d",x);
			soma += x;
		}
		
		System.out.printf("\nA soma total dos números é %d",soma);
	}

}
