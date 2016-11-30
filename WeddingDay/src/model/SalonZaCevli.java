package model;

public class SalonZaCevli {
	
	 private int CEID;
	 private String GradCE;
	 private String ImeCE;
	 private String AdresaCE;
	 private String TelefonCE;
	 private int CE1ID;
	 
	 public SalonZaCevli (){
		 super();
	 }

	 public SalonZaCevli (int CEID,String GradCE,String ImeCE,String AdresaCE,String TelefonCE,int CE1ID){
		 
		 super();
		 this.CEID=CEID;
		 this.GradCE=GradCE;
		 this.ImeCE=ImeCE;
		 this.AdresaCE=AdresaCE;
		 this.TelefonCE=TelefonCE;
		 this.CE1ID=CE1ID;
	 }

	public int getCEID() {
		return CEID;
	}

	public void setCEID(int cEID) {
		CEID = cEID;
	}

	public String getGradCE() {
		return GradCE;
	}

	public void setGradCE(String gradCE) {
		GradCE = gradCE;
	}

	public String getImeCE() {
		return ImeCE;
	}

	public void setImeCE(String imeCE) {
		ImeCE = imeCE;
	}

	public String getAdresaCE() {
		return AdresaCE;
	}

	public void setAdresaCE(String adresaCE) {
		AdresaCE = adresaCE;
	}

	public String getTelefonCE() {
		return TelefonCE;
	}

	public void setTelefonCE(String telefonCE) {
		TelefonCE = telefonCE;
	}

	public int getCE1ID() {
		return CE1ID;
	}

	public void setCE1ID(int cE1ID) {
		CE1ID = cE1ID;
	}
	 
	 
}
