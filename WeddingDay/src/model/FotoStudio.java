package model;

public class FotoStudio {
	
	 private int FSID;
	 private String GradFS;
	 private String ImeFS;
	 private String AdresaFS;
	 private String TelefonFS;
	 private int FS1ID;
	 
	 public FotoStudio(){
		 super();
	 }

	 public FotoStudio (int FSID,String GradFS,String ImeFS,String AdresaFS,String TelefonFS,int FS1ID){
		 
		 super();
		 this.FSID=FSID;
		 this.GradFS=GradFS;
		 this.ImeFS=ImeFS;
		 this.AdresaFS=AdresaFS;
		 this.TelefonFS=TelefonFS;
		 this.FS1ID=FS1ID;
	 }

	public int getFSID() {
		return FSID;
	}

	public void setFSID(int fSID) {
		FSID = fSID;
	}

	public String getGradFS() {
		return GradFS;
	}

	public void setGradFS(String gradFS) {
		GradFS = gradFS;
	}

	public String getImeFS() {
		return ImeFS;
	}

	public void setImeFS(String imeFS) {
		ImeFS = imeFS;
	}

	public String getAdresaFS() {
		return AdresaFS;
	}

	public void setAdresaFS(String adresaFS) {
		AdresaFS = adresaFS;
	}

	public String getTelefonFS() {
		return TelefonFS;
	}

	public void setTelefonFS(String telefonFS) {
		TelefonFS = telefonFS;
	}

	public int getFS1ID() {
		return FS1ID;
	}

	public void setFS1ID(int fS1ID) {
		FS1ID = fS1ID;
	}

	 
}
