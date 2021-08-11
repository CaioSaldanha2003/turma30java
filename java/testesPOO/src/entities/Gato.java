package entities;

public class Gato extends Pet {
	private boolean miadoAlto;

	public Gato(String raca, int anoNasci, boolean miadoAlto) {
		super(raca, anoNasci);
		this.miadoAlto = miadoAlto;
	}
	
	public void avaliacaoMiado() {
		if(miadoAlto == true) {
			System.out.println("mia alto pacas"); 
		}
		if(miadoAlto == false) {
			System.out.println("mia baixin");
		}
	}
	
	@Override
	public void somAlto() {
		System.out.println("MIAAAAUUUU");
		
	}

	@Override
	public void somBaixo() {
		System.out.println("mew...");
		
	}

	public boolean isMiadoAlto() {
		return miadoAlto;
	}

	public void setMiadoAlto(boolean miadoAlto) {
		this.miadoAlto = miadoAlto;
	}
	
}
