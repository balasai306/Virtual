package com.VirtualClassroom.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.VirtualClassroom.dao.InsertDao;
@WebServlet("/marks")
public class marksServlet extends HttpServlet {
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			String name = request.getParameter("studentName");
			String marks = request.getParameter("marks");
			String subject = request.getParameter("subjectName");
			System.out.println(name);
			System.out.println(marks);

			// String name =request.getParameter("name");
		marksDao md = new marksDao();
			boolean insertion = md.update(name,marks,subject);
			if (insertion == true) {
				response.sendRedirect("marks.html");
			} else {
				response.sendRedirect("staff.jsp");
			}
		}

}
