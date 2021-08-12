package entities;

public abstract class Pet implements sonsAnimais {
	private String raca;
	private int anoNasci;
	
	
	public Pet(String raca, int anoNasci) {
		this.raca = raca;
		this.anoNasci = anoNasci;
	}
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getAnoNasci() {
		return anoNasci;
	}
	public void setAnoNasci(int anoNasci) {
		this.anoNasci = anoNasci;
	}

	@Override
	public void somAlto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void somBaixo() {
		// TODO Auto-generated method stub
		
	}
  }
