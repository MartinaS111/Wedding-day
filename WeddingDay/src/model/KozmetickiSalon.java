package model;

public class KozmetickiSalon {

	 private int SID;
	 private String GradS;
	 private String ImeS;
	 private String AdresaS;
	 private String TelefonS;
	 private int CenaS;
	 
	 public KozmetickiSalon(){
		 super();
	 }

	 public KozmetickiSalon(int SID,String GradS,String ImeS,String AdresaS,String TelefonS,int CenaS){
		 
		 super();
		 this.SID=SID;
		 this.GradS=GradS;
		 this.ImeS=ImeS;
		 this.AdresaS=AdresaS;
		 this.TelefonS=TelefonS;
		 this.CenaS=CenaS;
	 }

	public int getSID() {
		return SID;
	}

	public void setSID(int sID) {
		SID = sID;
	}

	public String getGradS() {
		return GradS;
	}

	public void setGradS(String gradS) {
		GradS = gradS;
	}

	public String getImeS() {
		return ImeS;
	}

	public void setImeS(String imeS) {
		ImeS = imeS;
	}

	public String getAdresaS() {
		return AdresaS;
	}

	public void setAdresaS(String adresaS) {
		AdresaS = adresaS;
	}

	public String getTelefonS() {
		return TelefonS;
	}

	public void setTelefonS(String telefonS) {
		TelefonS = telefonS;
	}

	public int getCenaS() {
		return CenaS;
	}

	public void setCenaS(int cenaS) {
		CenaS = cenaS;
	}
	 
	 

}
