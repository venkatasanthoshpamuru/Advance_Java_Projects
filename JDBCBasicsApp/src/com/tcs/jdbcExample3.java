package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcExample3 {
  public static void main(String[] args) {
	try(Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","venkatt");
			Statement statement=connection.createStatement()){
		
		ResultSet set=statement.executeQuery("select * from employes");
		
		//1.using column index
		/*
		 * while(set.next()) {
		 * 
		 * System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getInt(3)); }
		 */
		System.out.println("**********************");
		
		while(set.next()) {
			System.out.println(set.getInt("eid"));
			
		}
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	System.out.println("Operation successful....");
}
}
