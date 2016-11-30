package model;

public class NevestinskiSalon {
	
	 private int FUID;
	 private String GradFU;
	 private String ImeFU;
	 private String AdresaFU;
	 private String TelefonFU;
	 private int FU1ID;
	 
	 public NevestinskiSalon(){
		 super();
	 }
	 
	 public NevestinskiSalon (int FUID,String GradFU,String ImeFU,String AdresaFU,String TelefonFU,int FU1ID){
		 
		 super();
		 this.FUID=FUID;
		 this.GradFU=GradFU;
		 this.ImeFU=ImeFU;
		 this.AdresaFU=AdresaFU;
		 this.TelefonFU=TelefonFU;
		 this.FU1ID=FU1ID;
	 }

	public int getFUID() {
		return FUID;
	}

	public void setFUID(int fUID) {
		FUID = fUID;
	}

	public String getGradFU() {
		return GradFU;
	}

	public void setGradFU(String gradFU) {
		GradFU = gradFU;
	}

	public String getImeFU() {
		return ImeFU;
	}

	public void setImeFU(String imeFU) {
		ImeFU = imeFU;
	}

	public String getAdresaFU() {
		return AdresaFU;
	}

	public void setAdresaFU(String adresaFU) {
		AdresaFU = adresaFU;
	}

	public String getTelefonFU() {
		return TelefonFU;
	}

	public void setTelefonFU(String telefonFU) {
		TelefonFU = telefonFU;
	}

	public int getFU1ID() {
		return FU1ID;
	}

	public void setFU1ID(int fU1ID) {
		FU1ID = fU1ID;
	}
	 
	 

}
