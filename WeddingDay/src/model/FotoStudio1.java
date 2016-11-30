package model;

public class FotoStudio1 {

	private int FS1ID;
	private String BrojSliki;
	private Boolean Fotosesija;
	private int Cena;
	
	public FotoStudio1(){
		 super();
	 }
	
	public FotoStudio1(int FS1ID,String BrojSliki,Boolean Fotosesija,int Cena){
		
		super();
		this.FS1ID=FS1ID;
		this.BrojSliki=BrojSliki;
		this.Fotosesija=Fotosesija;
		this.Cena=Cena;
	}

	public int getFS1ID() {
		return FS1ID;
	}

	public void setFS1ID(int fS1ID) {
		FS1ID = fS1ID;
	}

	public String getBrojSliki() {
		return BrojSliki;
	}

	public void setBrojSliki(String brojSliki) {
		BrojSliki = brojSliki;
	}

	public Boolean getFotosesija() {
		return Fotosesija;
	}

	public void setFotosesija(Boolean fotosesija) {
		Fotosesija = fotosesija;
	}

	public int getCena() {
		return Cena;
	}

	public void setCena(int cena) {
		Cena = cena;
	}
	
	
}
