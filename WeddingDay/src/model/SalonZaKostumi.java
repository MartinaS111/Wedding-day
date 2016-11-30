package model;

public class SalonZaKostumi {

	 private int KID;
	 private String GradK;
	 private String ImeK;
	 private String AdresaK;
	 private String TelefonK;
	 private int K1ID;
	 
	 public SalonZaKostumi(){
		 super();
	 }

	 public SalonZaKostumi(int KID,String GradK,String ImeK,String AdresaK,String TelefonK,int K1ID){
		 
		 super();
		 this.KID=KID;
		 this.GradK=GradK;
		 this.ImeK=ImeK;
		 this.AdresaK=AdresaK;
		 this.TelefonK=TelefonK;
		 this.K1ID=K1ID;
	 }

	public int getKID() {
		return KID;
	}

	public void setKID(int kID) {
		KID = kID;
	}

	public String getGradK() {
		return GradK;
	}

	public void setGradK(String gradK) {
		GradK = gradK;
	}

	public String getImeK() {
		return ImeK;
	}

	public void setImeK(String imeK) {
		ImeK = imeK;
	}

	public String getAdresaK() {
		return AdresaK;
	}

	public void setAdresaK(String adresaK) {
		AdresaK = adresaK;
	}

	public String getTelefonK() {
		return TelefonK;
	}

	public void setTelefonK(String telefonK) {
		TelefonK = telefonK;
	}

	public int getK1ID() {
		return K1ID;
	}

	public void setK1ID(int k1id) {
		K1ID = k1id;
	}
	 
	 
	
}
