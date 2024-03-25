package com.sathya.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableEx01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","venkatt");
		
		//call the procedure
		CallableStatement callableStatement=connection.prepareCall("{call getSal(?,?)}");
		
		//set the input data
		callableStatement.setInt(1,111);
		
		//register one variable to store the output
		callableStatement.registerOutParameter(2, Types.DOUBLE);
		
		//execute the procedure the output will be stored in register param
		callableStatement.executeUpdate();
		
		//print the OUT
		System.out.println(callableStatement.getDouble(2));
		connection.close();

	}

}
