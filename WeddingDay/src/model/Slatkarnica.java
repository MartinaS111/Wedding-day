package model;

public class Slatkarnica {
	
	 private int TID;
	 private String GradT;
	 private String ImeT;
	 private String AdresaT;
	 private String TelefonT;
	 private int T1ID;
	 
	 public Slatkarnica(){
		 super();
	 }

	 public Slatkarnica(int TID,String GradT,String ImeT,String AdresaT,String TelefonT,int T1ID){
		 
		 super();
		 this.TID=TID;
		 this.GradT=GradT;
		 this.ImeT=ImeT;
		 this.AdresaT=AdresaT;
		 this.TelefonT=TelefonT;
		 this.T1ID=T1ID;
	 }

	public int getTID() {
		return TID;
	}

	public void setTID(int tID) {
		TID = tID;
	}

	public String getGradT() {
		return GradT;
	}

	public void setGradT(String gradT) {
		GradT = gradT;
	}

	public String getImeT() {
		return ImeT;
	}

	public void setImeT(String imeT) {
		ImeT = imeT;
	}

	public String getAdresaT() {
		return AdresaT;
	}

	public void setAdresaT(String adresaT) {
		AdresaT = adresaT;
	}

	public String getTelefonT() {
		return TelefonT;
	}

	public void setTelefonT(String telefonT) {
		TelefonT = telefonT;
	}

	public int getT1ID() {
		return T1ID;
	}

	public void setT1ID(int t1id) {
		T1ID = t1id;
	}
	 
	 
}
