package com.VirtualClassroom.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.VirtualClassroom.dao.DeleteStaffDao;
import com.VirtualClassroom.dao.DeleteStudentDao;

@WebServlet("/DeleteStaff")
public class DeleteStaffServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String login_id = request.getParameter("deletestaff");
		System.out.println("hi" + login_id);
		DeleteStaffDao ds = new DeleteStaffDao();
		boolean studentDeleted = ds.deleteStaff(login_id);
		if (studentDeleted == true) {
			response.sendRedirect("message.html");
		} else {
			response.sendRedirect("admin.jsp");
		}
	}
}
