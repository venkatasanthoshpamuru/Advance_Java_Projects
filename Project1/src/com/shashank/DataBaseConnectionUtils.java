package com.shashank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionUtils {
	
	public static Connection createConnection()
	{
	Connection connection=null;
	{
				try {
					Class.forName("jdbc.oracle.driver.OracleDriver");

		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521::xe","system","venkatt");
		} catch (SQLException|ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
}
