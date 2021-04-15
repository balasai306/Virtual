package com.VirtualClassroom.services;

import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.VirtualClassroom.dao.AssignmentDao;

@WebServlet("/assignmentServlet")
public class AssignmentServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String subjectName=request.getParameter("subjectName");
		String studentName=request.getParameter("studentName");
		String assignment =request.getParameter("assignment");
		System.out.println(assignment);
		if(assignment!=null) {
			assignment="done";
		}
		System.out.println(assignment);
		AssignmentDao ad= new AssignmentDao();
		boolean assignmentSubmitted =ad.assignmentInsert(subjectName, studentName, assignment);
		if (assignmentSubmitted == true) {
			response.sendRedirect("assignment.html");
		} else {
			response.sendRedirect("welcome.jsp");
		}
		
		
};
}
