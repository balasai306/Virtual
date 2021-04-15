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

public class ViewStaffDao {
	String sqlView = "select * from login inner join staff on login.login_id=staff.login_id inner join address on staff.login_id=address.login_id ";
	Closing close = new Closing();

	public List viewStaff() {
		Connector connection = new Connector();
		Connection con = null;
		Statement stmt = null;

		ResultSet rs = null;
		List<String> Staff= new ArrayList();
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
						
						details=details+rs.getString(i)+",";
					}
				
				
			}
				Staff.add(details);
				
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
		return Staff;
		
	}


}
