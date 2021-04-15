package com.VirtualClassroom.services;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.VirtualClassroom.dao.LoginDao;

public class UserServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		String user =request.getParameter("user");
		LoginDao log=new LoginDao();
		
		if(log.check(username, password)) {
			HttpSession session=request.getSession();
			
			session.setAttribute("username", username);
			if(user.equals("student")) {
				response.sendRedirect("welcome.jsp");
			}
			else if(user.equals("staff")) {
				response.sendRedirect("staff.jsp");
			}
			else if(user.equals("admin")) {
				response.sendRedirect("admin.jsp");
			}
			
			
		}
		else {
			response.sendRedirect("login.jsp");
			
		}
		
		// calling the servlet or jsp
		
		//RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		//rd.forward(request, response);
		
		
		
		
		


	}
}