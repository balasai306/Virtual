package com.VirtualClassroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.Closing;
import util.Connector;
import util.myExceptions;

public class AddressInsertDao {
	String sqlAddress = "insert into address values(?,?,?,?,?,?)";
	Closing close1 = new Closing();

	public boolean addressInsert(String username, String house_no, String street, String city, String state,
			String country) {
		Connector connection = new Connector();
		Connection con = null;
		PreparedStatement ps2 = null;
	
		ResultSet rs = null;
		try {
			con = connection.getConnector();
			ps2 = con.prepareStatement(sqlAddress);
			ps2.setString(1,username);
			ps2.setString(2, house_no);
			ps2.setString(3, street);
			ps2.setString(4, city);
			ps2.setString(5, state);
			ps2.setString(6, country);
			ps2.executeUpdate();
			
			return true;

		} catch (myExceptions | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close1.closeConnection(rs);
			close1.closeConnection(ps2);
			close1.closeConnection(con);

		}
		return false;
	}

}
