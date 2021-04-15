package com.VirtualClassroom.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.VirtualClassroom.dao.InsertDao;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String login_id = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		String house_no = request.getParameter("houseNum");
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");

		// String name =request.getParameter("name");
		InsertDao id = new InsertDao();
		boolean insertion = id.insert(login_id, password, name, age, email, house_no, street,
				city, state, country);
		if (insertion == true) {
			response.sendRedirect("message.html");
		} else {
			response.sendRedirect("admin.jsp");
		}
	}

}
