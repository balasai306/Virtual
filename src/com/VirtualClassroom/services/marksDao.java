package com.VirtualClassroom.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.VirtualClassroom.dao.StudentInsert;

import util.Closing;
import util.Connector;
import util.myExceptions;

public class marksDao {
	String sqlupdate = "update subject set subject_marks = ? where student_name = ? and subject_name = ? ;";

	Closing close = new Closing();

	public boolean update(String name, String marks, String subject) {
		Connector connection = new Connector();
		Connection con = null;
		PreparedStatement ps = null;

		ResultSet rs = null;
		try {
			con = connection.getConnector();
			ps = con.prepareStatement(sqlupdate);
			ps.setString(1, marks);
			ps.setString(2, name);
			ps.setString(3, subject);
			int count = ps.executeUpdate();
			if (count > 0) {
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
