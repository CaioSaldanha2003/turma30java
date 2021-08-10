package programas;

public class exemploEncap {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		func1.setNome("Cleitin");
		func1.setSalario(200);
		
		System.out.println(func1.getNome());
		System.out.println(func1.getSalario());

	}

}
