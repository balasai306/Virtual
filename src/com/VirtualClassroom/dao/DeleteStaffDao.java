package com.VirtualClassroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.Closing;
import util.Connector;
import util.myExceptions;

public class DeleteStaffDao {
	String sqlDeleteStaff = "delete login,staff,address from login inner join staff on login.login_id=staff.login_id inner join address on staff.login_id=address.login_id where login.login_id=? and staff.login_id=? and address.login_id=?";

	Closing close = new Closing();

	public boolean deleteStaff(String login_id) {
		System.out.println(login_id);
		Connector connection = new Connector();
		Connection con = null;

		PreparedStatement ps1 = null;

		ResultSet rs = null;
		try {
			con = connection.getConnector();

			ps1 = con.prepareStatement(sqlDeleteStaff);
			ps1.setString(1, login_id);
			ps1.setString(2, login_id);
			ps1.setString(3, login_id);
			int count = ps1.executeUpdate();

			if (count > 0) {
				return true;

			}
			System.out.println(count);

		} catch (myExceptions | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close.closeConnection(rs);
			close.closeConnection(ps1);
			close.closeConnection(con);

		}
		return false;

	}

}
