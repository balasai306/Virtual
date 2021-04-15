package com.VirtualClassroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.Closing;
import util.Connector;
import util.myExceptions;

public class InsertStaffDao {
	String sqlLogin = "insert into login values(?,?)";

	Closing close = new Closing();

	public boolean insert(String username, String password, String name, int age, String email, String house_no,
			String street, String city, String state, String country) {

		// TODO Auto-generated method stub

		Connector connection = new Connector();
		Connection con = null;
		PreparedStatement ps = null;
		StaffInsert si = new StaffInsert();
		ResultSet rs = null;
		try {
			con = connection.getConnector();
			ps = con.prepareStatement(sqlLogin);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.executeUpdate();
			si.staffInsert(username, name, age, email, house_no, street, city, state, country);
			return true;

		} catch (myExceptions | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close.closeConnection(rs);
			close.closeConnection(ps);
			close.closeConnection(con);

		}
		return false;
	}

}
