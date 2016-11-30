package model;

public class FrizerskiSalon1 {
	
	private int FR1ID;
	private int CenaFR;
	private Boolean Nevesta;
	private Boolean Ostanato;

	public FrizerskiSalon1(){
		super();
	}
	
	public FrizerskiSalon1(int FR1ID,int CenaFR,Boolean Nevesta,Boolean Ostanato){
		
		super();
		this.FR1ID=FR1ID;
		this.CenaFR=CenaFR;
		this.Nevesta=Nevesta;
		this.Ostanato=Ostanato;
	}

	public int getFR1ID() {
		return FR1ID;
	}

	public void setFR1ID(int fR1ID) {
		FR1ID = fR1ID;
	}

	public int getCenaFR() {
		return CenaFR;
	}

	public void setCenaFR(int cenaFR) {
		CenaFR = cenaFR;
	}

	public Boolean getNevesta() {
		return Nevesta;
	}

	public void setNevesta(Boolean nevesta) {
		Nevesta = nevesta;
	}

	public Boolean getOstanato() {
		return Ostanato;
	}

	public void setOstanato(Boolean ostanato) {
		Ostanato = ostanato;
	}
	
	
}
