package model;

public class Login {
	
	 private int LID;
	 private String Ime;
	 private String Prezime;
	 private String Telefon;
	 private String Adresa;
	 private String Grad;
	 private String DatumSvadba;
	 private String Email;
	 private String Password;
	 
	 public Login(){
		 super();
	 }
	 
	 public Login (String Ime,String Prezime,String Telefon,String Adresa,String Grad,String DatumSvadba,String Email,String Password){
		 
		 super();
		 this.Ime=Ime;
		 this.Prezime=Prezime;
		 this.Telefon=Telefon;
		 this.Adresa=Adresa;
		 this.Grad=Grad;
		 this.DatumSvadba=DatumSvadba;
		 this.Email=Email;
		 this.Password=Password;
	 }

	public int getLID() {
		return LID;
	}

	public void setLID(int lID) {
		LID = lID;
	}

	public String getIme() {
		return Ime;
	}

	public void setIme(String ime) {
		Ime = ime;
	}

	public String getPrezime() {
		return Prezime;
	}

	public void setPrezime(String prezime) {
		Prezime = prezime;
	}

	public String getTelefon() {
		return Telefon;
	}

	public void setTelefon(String telefon) {
		Telefon = telefon;
	}
	
	public String getAdresa() {
		return Adresa;
	}

	public void setAdresa(String adresa) {
		Adresa = adresa;
	}
	
	public String getGrad() {
		return Grad;
	}

	public void setGrad(String grad) {
		Grad = grad;
	}
	
	public String getDateOfDatumSvadba() {
		return DatumSvadba;
	}

	public void setDateOfDatumSvadba(String datumsvadba) {
		DatumSvadba = datumsvadba;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
