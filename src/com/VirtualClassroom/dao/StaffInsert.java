package com.VirtualClassroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.Closing;
import util.Connector;
import util.myExceptions;

public class StaffInsert {
	String sqlStaff = "insert into staff values(?,?,?,?)";
	Closing close1 = new Closing();

	public boolean staffInsert(String username, String staff_name, int staff_age, String staff_email,
			String house_no, String street, String city, String state, String country) {

		// TODO Auto-generated method stub

		Connector connection = new Connector();
		Connection con = null;
		PreparedStatement ps1 = null;
		AddressInsertDao ai = new AddressInsertDao();
		ResultSet rs = null;
		try {
			con = connection.getConnector();
			ps1 = con.prepareStatement(sqlStaff);
			ps1.setString(1, staff_name);
			ps1.setInt(2, staff_age);
			ps1.setString(3, staff_email);
			ps1.setString(4, username);
			ps1.executeUpdate();
			ai.addressInsert(username, house_no, street, city, state, country);
			return true;

		} catch (myExceptions | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close1.closeConnection(ps1);
			close1.closeConnection(con);

		}
		return false;
	}

}
