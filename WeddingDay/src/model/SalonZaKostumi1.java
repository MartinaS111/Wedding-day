package model;

public class SalonZaKostumi1 {

	 private int K1ID;
	 private String BojaK;
	 private String BrojK;
	 private int CenaK;
	 
	 public SalonZaKostumi1(){
		 super();
	 }

	 public SalonZaKostumi1(int K1ID,String BojaK,String BrojK,int CenaK){
		 
		 super();
		 this.K1ID=K1ID;
		 this.BojaK=BojaK;
		 this.BrojK=BrojK;
		 this.CenaK=CenaK;
	 }

	public int getK1ID() {
		return K1ID;
	}

	public void setK1ID(int k1id) {
		K1ID = k1id;
	}

	public String getBojaK() {
		return BojaK;
	}

	public void setBojaK(String bojaK) {
		BojaK = bojaK;
	}

	public String getBrojK() {
		return BrojK;
	}

	public void setBrojK(String brojK) {
		BrojK = brojK;
	}

	public int getCenaK() {
		return CenaK;
	}

	public void setCenaK(int cenaK) {
		CenaK = cenaK;
	}
	 
	 

}
