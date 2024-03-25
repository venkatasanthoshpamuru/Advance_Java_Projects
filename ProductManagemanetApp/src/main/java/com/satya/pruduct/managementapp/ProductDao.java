package com.satya.pruduct.managementapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
	public int save(Product product) {
		// Declare the resorces
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		int saveResult = 0;
		try {
		 //Load the driver and create connection.
		       connection = DataBaseConnectivity.createConnection();
		 // Create prepare statement object
		        preparedStatement=connection.prepareStatement("insert into product_data values(?,?,?,?,?,?,?,?)");
		 // Execete querry
		        preparedStatement.setString(1, product.getProId());
		        preparedStatement.setString(2, product.getProName());
		        preparedStatement.setDouble(3, product.getProPrice());
		        preparedStatement.setString(4, product.getProBrand());
		        preparedStatement.setString(5, product.getProMadeIn());
		        preparedStatement.setDate(6, product.getManfactureDate());
		        preparedStatement.setDate(7, product.getExpireDate());
		        preparedStatement.setBytes(8, product.getProImage());
		        
		        saveResult = preparedStatement.executeUpdate();
		 }
		catch (Exception e) {
		}
		finally {
			// Before closing the resources first check connection is present are not  
		     //Close the resources...
		try {
			if(connection!=null)connection.close();
			if(preparedStatement!=null)preparedStatement.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		    }
		}
		return saveResult;
	}
	
//Method 2: Find by all method 
	public static List<Product> findAll(){
		List<Product> products = new ArrayList<Product>();
		Product product= null;
		try (Connection connection = DataBaseConnectivity.createConnection();
			Statement statement = connection.createStatement()){
			ResultSet resultSet = statement.executeQuery("select*from product_data");
			
			while(resultSet.next()) {
				//read the data from resultSet and setting into product
				product=new Product();
				product.setProId(resultSet.getString(1));
				product.setProName(resultSet.getString(2));
				product.setProPrice(resultSet.getDouble(3));
				product.setProBrand(resultSet.getString(4));
				product.setProMadeIn(resultSet.getString(5));
				product.setManfactureDate(resultSet.getDate(6));
				product.setExpireDate(resultSet.getDate(7));
				product.setProImage(resultSet.getBytes(8));
				
				//adding the product into list
				products.add(product);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
		
	public int deleteProductById(String proId)
		{	int result = 0;
		try(Connection connection = DataBaseConnectivity.createConnection())
		{	//create the PS object
			PreparedStatement preparedStatement = connection.prepareStatement("delete from product_data  where proId=?");
			//set the data to params 
			preparedStatement.setString(1,proId);
			
			//execute the query 
			result =  preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{	e.printStackTrace();
		}
		return result;
	}

}

