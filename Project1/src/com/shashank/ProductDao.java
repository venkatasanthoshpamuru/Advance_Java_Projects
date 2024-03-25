package com.shashank;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDao {
public int createTable()
{
	Connection connection=null;
	int result=0;
	Statement statement=null;
	try {
	
	
	connection=DataBaseConnectionUtils.createConnection();
	statement=connection.createStatement();
			String query="create table Product_table(proId number,proName varChar2(20),proPrice number)";
	
	result=statement.executeUpdate(query);
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	
	
	
	return result;
	
}

}
