package com.VirtualClassroom.services;

import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.VirtualClassroom.dao.InsertDao;
import com.VirtualClassroom.dao.ViewStudentDao;
@WebServlet("/ViewStudent")
public class ViewStudentServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		

		// String name =request.getParameter("name");
		ViewStudentDao vsd=new ViewStudentDao();
		List view = vsd.viewStudent();
		ListIterator li =view.listIterator();
		while(li.hasNext()) {
			
			System.out.println(li.next());
		}
		request.setAttribute("view_1", view);
		RequestDispatcher rd= request.getRequestDispatcher("/view.jsp");
		rd.forward(request, response);
		
//		if (view == true) {
//			response.sendRedirect("message.html");
//		} else {
//			response.sendRedirect("admin.jsp");
//		}
	}

}
