package com.satya.madhu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {

	public static void main(String[] args) {
		try {
			//load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//create the connection
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","venkatt");
			
			//create statement
			Statement statement=connection.createStatement();
			
			connection.setAutoCommit(false);
			
			statement.executeUpdate("insert into emp values(333,'ravi',300)");
			connection.commit();
			System.out.println("data inserted successfull....");
			
			
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
