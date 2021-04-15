package com.VirtualClassroom.dao;

import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.Closing;
import util.Connector;
import util.myExceptions;

public class AssignmentDao {
	String sqlAssignment = "insert into subject values(?,?,?,?)";

	Closing close = new Closing();
	public boolean assignmentInsert(String Subject_name,String Student_name,String assignment ) {
		System.out.println(assignment+"dao");
		// TODO Auto-generated method stub

		Connector connection = new Connector();
		Connection con = null;
		PreparedStatement ps = null;
	
		ResultSet rs = null;
		try {
			con = connection.getConnector();
			ps = con.prepareStatement(sqlAssignment);
			ps.setString(1, Subject_name);
			ps.setString(2, Student_name);
			ps.setString(3, assignment);
			ps.setString(4, "");
			ps.executeUpdate();
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
