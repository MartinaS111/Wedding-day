package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Login;

public class RegisterDao {

	private int uspesno;
	
	public RegisterDao(){
		
	}
	
	public void vnesi(Login korisnik){
		
		  try(
				   DBConnect db = new DBConnect();
				   Connection connection =db.getConnection();){
				   
				   //proverka na konekcijata na konzola
				   System.out.println("konekcijata e ovozmozhena, sega ke polnam");
				   
				   //podgotvi sto da mu ispratam so query
				    PreparedStatement preparedStatement = connection.prepareStatement("insert into dbo.Login (Ime,Prezime,Telefon,Adresa,Email,Password) values(?,?,?,?,?,?)");
				    preparedStatement.setString(1, korisnik.getIme());
				    preparedStatement.setString(2, korisnik.getPrezime());
				    preparedStatement.setString(3, korisnik.getTelefon());
				    preparedStatement.setString(4, korisnik.getAdresa());
				    preparedStatement.setString(5, korisnik.getEmail());
				    preparedStatement.setString(6, korisnik.getPassword());
				    
				    uspesno=preparedStatement.executeUpdate();
				   
				   System.out.println("bazata e polna so vnesenite podatoci");
				    
				   }catch (Exception e) {
				    // TODO: handle exception
				    e.printStackTrace();
				   }
		
	}
	
	public int getStatus(){
		return uspesno;
	}
}
