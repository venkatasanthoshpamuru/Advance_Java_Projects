package com.sathya.saveuser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
   public void saveUser(String userId,String userName,String userEmail,String userMobile,String userLocation) 
   {
	   //get the connection
	   Connection connection=DBConnectionUtils.createConnection();
	   try {
		PreparedStatement preparedStatement=
				   connection.prepareStatement("insert into user_Detail values(?,?,?,?,?)");
	   	preparedStatement.setString(1, userId);
	   	preparedStatement.setString(2, userName);
	   	preparedStatement.setString(3, userEmail);
	   	preparedStatement.setString(4, userMobile);
	   	preparedStatement.setString(5, userLocation);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
   }
}
