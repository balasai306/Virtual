package com.VirtualClassroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.Connector;
import util.myExceptions;

import util.Closing;

public class StudentInsert {

	String sqlStudent = "insert into students values(?,?,?,?)";
	Closing close1 = new Closing();

	public boolean studentInsert(String username, String student_name, int student_age, String student_email,
			String house_no, String street, String city, String state, String country) {

		// TODO Auto-generated method stub

		Connector connection = new Connector();
		Connection con = null;
		PreparedStatement ps1 = null;
		AddressInsertDao ai=new AddressInsertDao();
		ResultSet rs = null;
		try {
			con = connection.getConnector();
			ps1 = con.prepareStatement(sqlStudent);
			ps1.setString(1, student_name);
			ps1.setInt(2, student_age);
			ps1.setString(3, student_email);
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
