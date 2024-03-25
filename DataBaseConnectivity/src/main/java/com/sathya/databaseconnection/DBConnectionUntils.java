package com.sathya.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionUntils {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("load the driver success");
		//2.create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","venkatt");
		System.out.println("create the connection success");
		//3.create statement object
		Statement statement=connection.createStatement();
		System.out.println("create the statement success");
		//4.process the query
		
		
		  int query=statement.executeUpdate("create table javadb(id number,name varchar2(10),bill number)");
		  System.out.println("table create status..."+query);
		 
		   //int data=statement.executeUpdate("insert into javadb values(101,'venkatt',300)");
		   //System.out.println("insert data status..."+data);
		
		//5.close the resource
		connection.close();
		statement.close();
		System.out.println("resource close success");

	}

}
