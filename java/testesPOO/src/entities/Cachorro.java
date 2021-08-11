package entities;

public class Cachorro extends Pet {
	private boolean latidoAlto;
	
	public Cachorro(String raca, int anoNasci, boolean latidoAlto) {
		super(raca, anoNasci);
		this.latidoAlto = latidoAlto;
	}
	
	public void avaliacaoLatido() {
		if(latidoAlto == true) {
			System.out.println("late alto bagarai"); 
		}
		if(latidoAlto == false) {
			System.out.println("late que parece que tá no volume mínimo");
		}
	}
	
	@Override
	public void somAlto() {
		System.out.println("AU AU AU!!!");
		
	}

	@Override
	public void somBaixo() {
		System.out.println("au...au...");
		
	}

	public boolean isLatidoAlto() {
		return latidoAlto;
	}

	public void setLatidoAlto(boolean latidoAlto) {
		this.latidoAlto = latidoAlto;
	}

}