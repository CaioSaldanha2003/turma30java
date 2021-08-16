package classesEcommerce;

public class Dados {
	String cod,sab;
	double val;
	int estoque;
	public Dados (String cod,String sab, double val, int estoque) {
		this.cod = cod;
		this.sab = sab;
		this.val = val;
		this.estoque = estoque;
	}
	public String getCod() {
		return cod;
	}

	public String getSab() {
		return sab;
	}

	public double getVal() {
		return val;
	}

	public int getEstoque() {
		return estoque;
	}

}
