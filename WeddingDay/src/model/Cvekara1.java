package model;

public class Cvekara1{
	
	 private int C1ID;
	 private int CenaC;
	 private String Boja;
	 private Boolean Sala;
	 private Boolean Kola;	
	 private Boolean Dom;
	 
	 public Cvekara1(){
		 super();
	 }

	 public Cvekara1(int C1ID,int CenaC,String Boja,Boolean Sala,Boolean Kola,Boolean Dom){
		 
		 super();
		 this.C1ID=C1ID;
		 this.CenaC=CenaC;
		 this.Boja=Boja;
		 this.Sala=Sala;
		 this.Kola=Kola;
		 this.Dom=Dom;
	 }

	public int getC1ID() {
		return C1ID;
	}

	public void setC1ID(int c1id) {
		C1ID = c1id;
	}

	public int getCenaC() {
		return CenaC;
	}

	public void setCenaC(int cenaC) {
		CenaC = cenaC;
	}

	public String getBoja() {
		return Boja;
	}

	public void setBoja(String boja) {
		Boja = boja;
	}

	public Boolean getSala() {
		return Sala;
	}

	public void setSala(Boolean sala) {
		Sala = sala;
	}

	public Boolean getKola() {
		return Kola;
	}

	public void setKola(Boolean kola) {
		Kola = kola;
	}

	public Boolean getDom() {
		return Dom;
	}

	public void setDom(Boolean dom) {
		Dom = dom;
	}
	 
	 
}
