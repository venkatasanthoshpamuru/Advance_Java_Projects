package com.satya.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
 
  // This method create connection and return the connection
	public static Connection createConnection() {
		Connection connection=null;
		
		try {
			//load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//create the connection
			
				connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","venkatt");
				
				
			
		} 
		catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		return connection;
		
	}
}
