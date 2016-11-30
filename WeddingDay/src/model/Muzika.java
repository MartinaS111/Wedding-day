package model;

public class Muzika {
	
	 private int MID;
	 private String GradM;
	 private String ImeM;
	 private String AdresaM;
	 private String TelefonM;
	 private int M1ID;
	 
	 public Muzika(){
		 super();
	 }

	 public Muzika (int MID,String GradM,String ImeM,String AdresaM,String TelefonM,int M1ID){
		 
		 super();
		 this.MID=MID;
		 this.GradM=GradM;
		 this.ImeM=ImeM;
		 this.AdresaM=AdresaM;
		 this.TelefonM=TelefonM;
		 this.M1ID=M1ID;
	 }

	public int getMID() {
		return MID;
	}

	public void setMID(int mID) {
		MID = mID;
	}

	public String getGradM() {
		return GradM;
	}

	public void setGradM(String gradM) {
		GradM = gradM;
	}

	public String getImeM() {
		return ImeM;
	}

	public void setImeM(String imeM) {
		ImeM = imeM;
	}

	public String getAdresaM() {
		return AdresaM;
	}

	public void setAdresaM(String adresaM) {
		AdresaM = adresaM;
	}

	public String getTelefonM() {
		return TelefonM;
	}

	public void setTelefonM(String telefonM) {
		TelefonM = telefonM;
	}

	public int getM1ID() {
		return M1ID;
	}

	public void setM1ID(int m1id) {
		M1ID = m1id;
	}
	 
	 
}
