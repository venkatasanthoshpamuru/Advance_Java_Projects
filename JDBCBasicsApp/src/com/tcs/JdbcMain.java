
  package com.tcs;
  
  import java.sql.Connection;
  import java.sql.DriverManager;
  import java.sql.SQLException; 
  import java.sql.Statement;
 
  public class JdbcMain {
  
  public static void main(String[] args) throws ClassNotFoundException,SQLException { 
	  //step-1:load the driver
  Class.forName("oracle.jdbc.driver.OracleDriver");
  System.out.println("Driver loading completed....");
  
  //step-2:create the connection 
  Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","venkatt");
  System.out.println("connection created successfully....");
  
  //step-3:create the statement object 
  Statement statement=connection.createStatement();
 
  //step-4:process the query 
  int x=statement.executeUpdate("create table employes(eid number,ename varchar2(30),esal number)" ); 
  System.out.println("table created sucessfully...."+x);
  
  
  
  //step-5:release the resources 
  statement.close(); 
  connection.close();
  System.out.println("connection closed successfully..."); }
  
  }
 