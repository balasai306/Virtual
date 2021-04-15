
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Previlages</title>
</head>


<body bgcolor="#AFD1F6"
	style="border: 5px solid black; padding: 10px; margin: 5% 5% 5% 5%;">
	<h1 style="text-align: center">
		<%
			String username = session.getAttribute("username").toString();
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		} else {
			out.println("Welcome to Admin Portal " + username);
		}
		%>
	</h1>

	<form action="logout">
		<button id="logout" name="logout" value="logout"
			style="width: 150px; float: right">Logout</button>
		<br>
	</form>
	<br>
	<br>
	<div
		style="border: 2px solid black; padding: 10px; margin: 5% 25% 5% 25%; font-size: 20px;text-align:center">
		<br> <label style="font-size:25px; float:left">Student operations :</label> <br>
		<br>
		<button id="class" name="addstudent" style="width: 150px">
			<a href=" register.jsp" style="text-decoration: none";"color:black">Addstudent</a>
		</button>
		<br> <br>
		<form action="DeleteStudent">
			<label>Enter username / Login Id of student to delete:</label><br>
			<input type="text" name="deletestudent">
			<button id="class" type="submit" style="width: 150px">
				Delete student</button>
		</form>

		<br>
		<form action="ViewStudent">
			<button id="class" type="submit" style="width: 150px">View
				students</button>
		</form>
		<hr>
		<br> <label style="font-size:25px; float:left">Staff operations</label> <br>
		<br>

		<button id="class" name="addstaff" style="width: 150px">
			<a href="registerStaff.jsp" style="text-decoration: none";"color:black">Addstaff</a>
		</button>
		<br><br>
		<form action="DeleteStaff">
			<label>Enter Username /Login of staff to delete;</label> <br> <input
				type="text" name="deletestaff">
			<button id="class" type="submit" style="width: 150px">
				Delete staff</button>
		</form>
		<br>

		<form action="ViewStaff">
			<button id="class" type="submit" style="width: 150px">
				Viewstaff</button>
		</form>


	</div>


</body>
</html>
