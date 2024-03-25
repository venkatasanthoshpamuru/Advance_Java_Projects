package com.satya.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDao { //
	public int createBookTable()
	{
		Connection connection=null;
		Statement statement=null;
	    int result=0;
	    try
	    {
	    	connection=DataBaseConnection.createConnection();
	    	statement=connection.createStatement();
	    	result=statement.executeUpdate("create table bookDetails(bookId varchar2(5) primary key,bookName varchar2(10),price number(5,2))");
	    	
	    }
	    catch(SQLException e)
	    {
	    	e.printStackTrace();
	    }
	    finally {
	    try 
	    {
	    	if(connection!=null)connection.close();
	    	if(statement!=null)statement.close();
	    }
	    catch(SQLException e)
	    {
	    	e.printStackTrace();
	    }
	    }
		return result;
	}
	
	
  public int saveBook(Book b)
  {
	  int result=0;
	  try(Connection connection=DataBaseConnection.createConnection())
	  { 
		  //create the preparestatement object
		  PreparedStatement preparedStatement=connection.prepareStatement("insert into bookDetails values(?,?,?)");
		  
		  //set the data to parameters
		  preparedStatement.setString(1,b.getBookId());
		  preparedStatement.setString(2,b.getBookName());
		  preparedStatement.setDouble(3,b.getPrice());
		  
		result =  preparedStatement.executeUpdate();
		  
	  }
	  catch(SQLException e)
	  {
		  e.printStackTrace();
	  }
	  return result;
  }
}
