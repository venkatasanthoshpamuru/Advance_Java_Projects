package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcExample2 {
   public static void main(String[] args) {
	  Connection connection=null;
	  Statement statement=null;
	  
	   try {
		   //load the driver
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   System.out.println("Load the driver successful...");
		   connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","venkatt");
		   System.out.println("connection created successful...");
		   
		   statement=connection.createStatement();
		   System.out.println("create the statement successful...");
		   
		   statement.executeUpdate("insert into employes values(101,'venkatt',100)");
		   statement.executeUpdate("insert into employes values(102,'ram',200)");
		   statement.executeUpdate("insert into employes values(103,'raju',300)");
		   System.out.println("insert the data successful...");
		  
			/*
			 * statement.executeUpdate("update employes set ename='ravi' where eid=101");
			 *statement.executeUpdate("update employes set esal=esal+50 where esal<=100");
			  int x=statement.executeUpdate("delete from employes where esal>=150");
			  System.out.println(" data.."+x);*/
			 
	   }
	   catch(ClassNotFoundException|SQLException e)
	   {
		   e.printStackTrace();
	   }
	   finally
	   {
		   try {
		   if(connection!=null)
		   {
			   connection.close();
		   }
		   if(statement!=null)
		   {
			   statement.close();
		   }
		   System.out.println("close the resource sucessful....");
		   }
		   catch(SQLException e1)
		   {
			   e1.printStackTrace();
		   }
	   }
	   
    }
}
