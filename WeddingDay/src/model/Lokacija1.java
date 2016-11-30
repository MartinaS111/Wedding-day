package model;

public class Lokacija1 {

	private int LO1ID;
	 private String Sala;
	 private int Kapacitet;
	 private String Porcija;
	 private String Gosti;
	 private int CenaPorcija;
	 
	 public Lokacija1(){
		 super();
	 }
	
	 public Lokacija1(int LO1ID,String Sala,int Kapacitet,String Porcija,String Gosti,int CenaPorcija){
		 
		 super();
		 this.LO1ID=LO1ID;
		 this.Sala=Sala;
		 this.Kapacitet=Kapacitet;
		 this.Porcija=Porcija;
		 this.Gosti=Gosti;
		 this.CenaPorcija=CenaPorcija;
	 }

	public int getLO1ID() {
		return LO1ID;
	}

	public void setLO1ID(int lO1ID) {
		LO1ID = lO1ID;
	}

	public String getSala() {
		return Sala;
	}

	public void setSala(String sala) {
		Sala = sala;
	}

	public int getKapacitet() {
		return Kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		Kapacitet = kapacitet;
	}

	public String getPorcija() {
		return Porcija;
	}

	public void setPorcija(String porcija) {
		Porcija = porcija;
	}

	public String getGosti() {
		return Gosti;
	}

	public void setGosti(String gosti) {
		Gosti = gosti;
	}

	public int getCenaPorcija() {
		return CenaPorcija;
	}

	public void setCenaPorcija(int cenaPorcija) {
		CenaPorcija = cenaPorcija;
	}
	 
	 
}
