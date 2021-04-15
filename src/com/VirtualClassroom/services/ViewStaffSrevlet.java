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

import com.VirtualClassroom.dao.ViewStaffDao;
import com.VirtualClassroom.dao.ViewStudentDao;
@WebServlet("/ViewStaff")
public class ViewStaffSrevlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		

		// String name =request.getParameter("name");
		ViewStaffDao vsd=new ViewStaffDao();
		List view = vsd.viewStaff();
		ListIterator li =view.listIterator();
		while(li.hasNext()) {
			
			System.out.println(li.next());
		}
		request.setAttribute("view_2", view);
		RequestDispatcher rd= request.getRequestDispatcher("/viewStaff.jsp");
		rd.forward(request, response);
		
//		if (view == true) {
//			response.sendRedirect("message.html");
//		} else {
//			response.sendRedirect("admin.jsp");
//		}
	}
}
