package model;

public class SalonZaCevli1 {

	private int CE1ID;
	private String BrojCE;
	private String BojaCE;
	private Boolean ZenskiCE;
	private Boolean MaskiCE;
	private int CenaCE;
	
	public SalonZaCevli1(){
		super();
	}
	
	public SalonZaCevli1(int CE1ID,String BrojCE,String BojaCE,Boolean ZenskiCE,Boolean MaskiCE,int CenaCE){
		
		super();
		this.CE1ID=CE1ID;
		this.BrojCE=BrojCE;
		this.BojaCE=BojaCE;
		this.ZenskiCE=ZenskiCE;
		this.MaskiCE=MaskiCE;
		this.CenaCE=CenaCE;
	}

	public int getCE1ID() {
		return CE1ID;
	}

	public void setCE1ID(int cE1ID) {
		CE1ID = cE1ID;
	}

	public String getBrojCE() {
		return BrojCE;
	}

	public void setBrojCE(String brojCE) {
		BrojCE = brojCE;
	}

	public String getBojaCE() {
		return BojaCE;
	}

	public void setBojaCE(String bojaCE) {
		BojaCE = bojaCE;
	}

	public Boolean getZenskiCE() {
		return ZenskiCE;
	}

	public void setZenskiCE(Boolean zenskiCE) {
		ZenskiCE = zenskiCE;
	}

	public Boolean getMaskiCE() {
		return MaskiCE;
	}

	public void setMaskiCE(Boolean maskiCE) {
		MaskiCE = maskiCE;
	}

	public int getCenaCE() {
		return CenaCE;
	}

	public void setCenaCE(int cenaCE) {
		CenaCE = cenaCE;
	}
	
	
}
