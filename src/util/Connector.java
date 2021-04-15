package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	public Connection getConnector() throws myExceptions  {
		// TODO Auto-generated method stub
		Connection connect = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/virtual_classroom";
			String user = "root";
			String wordpass = "root";

			connect = DriverManager.getConnection(url, user,wordpass );

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw new myExceptions("connection failed");
		}
		
		

		return connect;

	}

}
