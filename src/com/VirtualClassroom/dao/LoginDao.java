package com.VirtualClassroom.dao;

import util.Closing;
import util.Connector;
import util.myExceptions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	String sql = "select * from login where login_id=? and password=?";
	Closing close = new Closing();

	public boolean check(String username, String password) {

		Connector connection = new Connector();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = connection.getConnector();
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}

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
