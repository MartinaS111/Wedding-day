package model;

public class Lokacija {

	 private int LOID;
	 private String GradLO;
	 private String ImeLO;
	 private String AdresaLO;
	 private String TelefonLO;
	 private Boolean Rezervirano;
	 private int LO1ID;
	 
	 public Lokacija(){
		 super();
	 }
	
	 public Lokacija(int LOID,String GradLO,String ImeLO,String AdresaLO,String TelefonLO,Boolean Rezervirano,int LO1ID){
		 
		 super();
		 this.LOID=LOID;
		 this.GradLO=GradLO;
		 this.ImeLO=ImeLO;
		 this.AdresaLO=AdresaLO;
		 this.TelefonLO=TelefonLO;
		 this.Rezervirano=Rezervirano;
		 this.LO1ID=LO1ID;
		 
	 }

	public int getLOID() {
		return LOID;
	}

	public void setLOID(int lOID) {
		LOID = lOID;
	}

	public String getGradLO() {
		return GradLO;
	}

	public void setGradLO(String gradLO) {
		GradLO = gradLO;
	}

	public String getImeLO() {
		return ImeLO;
	}

	public void setImeLO(String imeLO) {
		ImeLO = imeLO;
	}

	public String getAdresaLO() {
		return AdresaLO;
	}

	public void setAdresaLO(String adresaLO) {
		AdresaLO = adresaLO;
	}

	public String getTelefonLO() {
		return TelefonLO;
	}

	public void setTelefonLO(String telefonLO) {
		TelefonLO = telefonLO;
	}

	public Boolean getRezervirano() {
		return Rezervirano;
	}

	public void setRezervirano(Boolean rezervirano) {
		Rezervirano = rezervirano;
	}

	public int getLO1ID() {
		return LO1ID;
	}

	public void setLO1ID(int lO1ID) {
		LO1ID = lO1ID;
	}
	 
	 
}
