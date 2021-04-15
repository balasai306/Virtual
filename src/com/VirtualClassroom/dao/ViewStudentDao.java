package com.VirtualClassroom.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.Closing;
import util.Connector;
import util.myExceptions;

public class ViewStudentDao {
	String sqlView = "select * from login inner join students on login.login_id=students.login_id inner join address on students.login_id=address.login_id ";
	Closing close = new Closing();

	public List viewStudent() {

		// TODO Auto-generated method stub

		Connector connection = new Connector();
		Connection con = null;
		Statement stmt = null;

		ResultSet rs = null;
		List<String> Students= new ArrayList();
		try {
			con = connection.getConnector();
			stmt = con.prepareStatement(sqlView);

			rs = stmt.executeQuery(sqlView);
			while(rs.next()) {
				String details="";
				for(int i=1;i<=12;i++) {
					if(i==6||i==7) {
						continue;
					}
					else {
						
						details=details+",  "+rs.getString(i);
					}
				
				
			}
				Students.add(details);
				
				System.out.println();
			}
			

		} catch (myExceptions | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close.closeConnection(rs);
			close.closeConnection(stmt);
			close.closeConnection(con);

		}
		return Students;
		
	}

}
