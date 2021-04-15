package com.VirtualClassroom.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.VirtualClassroom.dao.DeleteStudentDao;

@WebServlet("/DeleteStudent")
public class DeleteStudentServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		String login_id = request.getParameter("deletestudent");
		System.out.println("hi"+login_id);
		DeleteStudentDao ds=new DeleteStudentDao();
		boolean studentDeleted=ds.deleteStudent(login_id);
		if (studentDeleted == true) {
			response.sendRedirect("message.html");
		} else {
			response.sendRedirect("admin.jsp");
		}
	}
}
