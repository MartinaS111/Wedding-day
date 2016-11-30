package model;

public class Slatkarnica1 {
	
	 private int T1ID;
	 private String Vkusovi;
	 private String BrojSpratovi;
	 private int CenaT;
	 
	 public Slatkarnica1(){
		 super();
	 }
	 
	 public Slatkarnica1(int T1ID,String Vkusovi,String BrojSpratovi,int CenaT){
		 
		 super();
		 this.T1ID=T1ID;
		 this.Vkusovi=Vkusovi;
		 this.BrojSpratovi=BrojSpratovi;
		 this.CenaT=CenaT;
	 }

	public int getT1ID() {
		return T1ID;
	}

	public void setT1ID(int t1id) {
		T1ID = t1id;
	}

	public String getVkusovi() {
		return Vkusovi;
	}

	public void setVkusovi(String vkusovi) {
		Vkusovi = vkusovi;
	}

	public String getBrojSpratovi() {
		return BrojSpratovi;
	}

	public void setBrojSpratovi(String brojSpratovi) {
		BrojSpratovi = brojSpratovi;
	}

	public int getCenaT() {
		return CenaT;
	}

	public void setCenaT(int cenaT) {
		CenaT = cenaT;
	}
	 
	 

}
