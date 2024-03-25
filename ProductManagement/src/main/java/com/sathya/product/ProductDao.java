package com.sathya.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.sql.Statement;

public class ProductDao 
{
	public int saveProduct(Product product)
	{
		int result=0;
		try(Connection connection=DatabaseUtils.createConnection();)
		{
			PreparedStatement preparedStatement=connection.prepareStatement("insert into product_data values(?,?,?,?,?,?,?,?)");
			preparedStatement.setString(1, product.getProId());
			preparedStatement.setString(2, product.getProName());
			preparedStatement.setDouble(3, product.getProPrice());
			preparedStatement.setString(4, product.getProBrand());
			preparedStatement.setString(5, product.getProMadeIn());
			
			preparedStatement.setDate(6, product.getProMfgDate());
			preparedStatement.setDate(7, product.getProExpDate());
			
			preparedStatement.setBinaryStream(8, product.getProImage());
			
			result=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Product> findAll()
	 {
        List<Product> productList = new ArrayList<Product>();
        //try-with resources :: Resources released automatically
        try(Connection connection=DatabaseUtils.createConnection();
        	Statement statement = connection.createStatement();) 
        {	
        	//Read the data from resultSet store into ResultSet 
            ResultSet resultSet = statement.executeQuery("select * from product_data");
            
            //Read the data from ResultSet set to Product object & store into List  
            //The loop repeated how many records present in table. 
            while (resultSet.next()) 
            {
	         	  Product product = new Product();
	         	  product.setProId(resultSet.getString("proId"));
				  product.setProName(resultSet.getString("proName"));
				  product.setProPrice(Double.parseDouble(resultSet.getString("proPrice")));
				  product.setProBrand(resultSet.getString("proBrand"));
				  product.setProMadeIn(resultSet.getString("proMade"));
				  product.setProMfgDate(resultSet.getDate("proMfgdate"));
				  product.setProExpDate(resultSet.getDate("proExpDate"));
				  product.setProImage(resultSet.getBinaryStream("proImage"));
				  productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

}
