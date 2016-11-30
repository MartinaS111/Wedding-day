package model;

public class FrizerskiSalon {
	
	 private int FRID;
	 private String GradFR;
	 private String ImeFR;
	 private String AdresaFR;
	 private String TelefonFR;
	 private int FR1ID;
	 
	 public FrizerskiSalon(){
		 super();
	 }

	 public FrizerskiSalon(int FRID,String GradFR,String ImeFR,String AdresaFR,String TelefonFR,int FR1ID){
		 
		 super();
		 this.FRID=FRID;
		 this.GradFR=GradFR;
		 this.ImeFR=ImeFR;
		 this.AdresaFR=AdresaFR;
		 this.TelefonFR=TelefonFR;
		 this.FR1ID=FR1ID;
	 }

	public int getFRID() {
		return FRID;
	}

	public void setFRID(int fRID) {
		FRID = fRID;
	}

	public String getGradFR() {
		return GradFR;
	}

	public void setGradFR(String gradFR) {
		GradFR = gradFR;
	}

	public String getImeFR() {
		return ImeFR;
	}

	public void setImeFR(String imeFR) {
		ImeFR = imeFR;
	}

	public String getAdresaFR() {
		return AdresaFR;
	}

	public void setAdresaFR(String adresaFR) {
		AdresaFR = adresaFR;
	}

	public String getTelefonFR() {
		return TelefonFR;
	}

	public void setTelefonFR(String telefonFR) {
		TelefonFR = telefonFR;
	}

	public int getFR1ID() {
		return FR1ID;
	}

	public void setFR1ID(int fR1ID) {
		FR1ID = fR1ID;
	}
	 
	 

}
