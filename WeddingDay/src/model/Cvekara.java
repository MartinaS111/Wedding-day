package model;

public class Cvekara {

	 private int CID;
	 private String GradC;
	 private String ImeC;
	 private String AdresaC;
	 private String TelefonC;	
	 private int C1ID;
	 
	 public Cvekara(){
		 super();
	 }
	 
	 public Cvekara(int CID,String GradC,String ImeC,String AdresaC,String TelefonC,int C1ID){
		 
		 super();
		 this.CID=CID;
		 this.GradC=GradC;
		 this.ImeC=ImeC;
		 this.AdresaC=AdresaC;
		 this.TelefonC=TelefonC;
		 this.C1ID=C1ID;
	 }

	public int getCID() {
		return CID;
	}

	public void setCID(int cID) {
		CID = cID;
	}

	public String getGradC() {
		return GradC;
	}

	public void setGradC(String gradC) {
		GradC = gradC;
	}

	public String getImeC() {
		return ImeC;
	}

	public void setImeC(String imeC) {
		ImeC = imeC;
	}

	public String getAdresaC() {
		return AdresaC;
	}

	public void setAdresaC(String adresaC) {
		AdresaC = adresaC;
	}

	public String getTelefonC() {
		return TelefonC;
	}

	public void setTelefonC(String telefonC) {
		TelefonC = telefonC;
	}

	public int getC1ID() {
		return C1ID;
	}

	public void setC1ID(int c1id) {
		C1ID = c1id;
	}
	 
	 
	
}
