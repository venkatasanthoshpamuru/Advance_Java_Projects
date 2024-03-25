package com.satya.madhu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully....");
		
		// Create connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","venkatt");
		System.out.println("Connection succesfull....");
		
		// create statement 
		Statement statement = connection.createStatement();
		System.out.println("Statement created....");
		
		//int a=statement.executeUpdate("create table madhu01(mid number, name varchar2(10), salary number(8,2))");
		//System.out.println("table created success.."+a);
		
		/*
		 * int a=0;
		 * a=statement.executeUpdate("insert into madhu01 values (111, 'venkat',100.0)"
		 * ); System.out.println("Data inserted succesfull..."+a);
		 */
		/*
		 * int a =
		 * statement.executeUpdate("update madhu01 set name ='venkatttt' where mid=111"
		 * ); System.out.println("updated success..."+a);
		 */
		int a=0;
		a= statement.executeUpdate("select * from ");
		
		// Close the resources 
		connection.close();
		statement.close();
		System.out.println("connection closed success.");
	}

}
