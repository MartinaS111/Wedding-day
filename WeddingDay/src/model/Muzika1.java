package model;

public class Muzika1 {

	 private int M1ID;
	 private int CenaM;
	 private String BrojSviraci;
	 private String Solist;
	
	 public Muzika1(){
		 super();
	 }
	 
	 public Muzika1(int M1ID,int CenaM,String BrojSviraci,String Solist){
		 
		 super();
		 this.M1ID=M1ID;
		 this.CenaM=CenaM;
		 this.BrojSviraci=BrojSviraci;
		 this.Solist=Solist;
	 }

	public int getM1ID() {
		return M1ID;
	}

	public void setM1ID(int m1id) {
		M1ID = m1id;
	}

	public int getCenaM() {
		return CenaM;
	}

	public void setCenaM(int cenaM) {
		CenaM = cenaM;
	}

	public String getBrojSviraci() {
		return BrojSviraci;
	}

	public void setBrojSviraci(String brojSviraci) {
		BrojSviraci = brojSviraci;
	}

	public String getSolist() {
		return Solist;
	}

	public void setSolist(String solist) {
		Solist = solist;
	}
	 
	 
}
