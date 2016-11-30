package model;

public class NevestinskiSalon1 {
	
	 private int FU1ID;
	 private String BojaFU;
	 private String DolzinaFU;
	 private String BrojFU;
	 private int CenaFU;
	 
	 public NevestinskiSalon1(){
		 super();
	 }

	 public NevestinskiSalon1(int FU1ID,String BojaFU,String DolzinaFU,String BrojFU,int CenaFU){
		 
		 super();
		 this.FU1ID=FU1ID;
		 this.BojaFU=BojaFU;
		 this.DolzinaFU=DolzinaFU;
		 this.BrojFU=BrojFU;
		 this.CenaFU=CenaFU;
	 }

	public int getFU1ID() {
		return FU1ID;
	}

	public void setFU1ID(int fU1ID) {
		FU1ID = fU1ID;
	}

	public String getBojaFU() {
		return BojaFU;
	}

	public void setBojaFU(String bojaFU) {
		BojaFU = bojaFU;
	}

	public String getDolzinaFU() {
		return DolzinaFU;
	}

	public void setDolzinaFU(String dolzinaFU) {
		DolzinaFU = dolzinaFU;
	}

	public String getBrojFU() {
		return BrojFU;
	}

	public void setBrojFU(String brojFU) {
		BrojFU = brojFU;
	}

	public int getCenaFU() {
		return CenaFU;
	}

	public void setCenaFU(int cenaFU) {
		CenaFU = cenaFU;
	}
	 
	 
}
