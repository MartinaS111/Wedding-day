package dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnect implements AutoCloseable{
	
	 protected Connection connection;
	 
	 public DBConnect(){
		 
	  try{
	  InitialContext context = new InitialContext();
	  DataSource dataSource= (DataSource) context.lookup("java:/comp/env/jdbc/Wedding day");
	  connection = dataSource.getConnection();
	  }
	  catch(NamingException e){
	   e.printStackTrace();
	  } catch (SQLException e) {
	   e.printStackTrace();
	  }
	  
	 }
	 
	 public Connection getConnection(){
		 return connection;
	 }
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
