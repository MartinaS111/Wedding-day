package model;

public class Pokani {
	
	private int PID;
	private int CenaP;
	
	public Pokani(){
		super();
	}

	public Pokani(int PID,int CenaP){
		
		super();
		this.PID=PID;
		this.CenaP=CenaP;
	}

	public int getPID() {
		return PID;
	}

	public void setPID(int pID) {
		PID = pID;
	}

	public int getCenaP() {
		return CenaP;
	}

	public void setCenaP(int cenaP) {
		CenaP = cenaP;
	}
	
	
}
