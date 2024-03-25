package com.sathya.jdbc_first_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDao {
  
	Connection connection=null;
	Statement statement=null;
	int result=0;
	public int createProductTable()
	{
		try {
			connection=DBConnectionUntils.createConnection();
			statement=connection.createStatement();
			String query="create table product_infos(proId varchar2(30) primary key,proName varchar2(20),proPrice number)";
			result=statement.executeUpdate(query);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if(connection!=null) connection.close();
				if(statement!=null) statement.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public int saveProduct(Product p)
	{
		int result=0;
		try(Connection connection=DBConnectionUntils.createConnection())
		{
			//creating prepareStatement object with parameters
			PreparedStatement preparedStatement=
					connection.prepareStatement("insert ");
		}
		
	}
}

















