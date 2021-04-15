<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#AFD1F6" style="border: 5px solid black; padding: 10px; margin: 5% 5% 5% 5%;">
	<h1 style="text-align: center; font-size: 40px">
		<%
			String username = session.getAttribute("username").toString();
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		} else {
			out.println("Welcome to Student Portal " + username);
		}
		%>
	</h1>

	<form action="logout">
		<button id="logout" name="logout" value="logout"
			style="width: 150px; float: right">logout</button>
		<br>
	</form>
	<br>
	<h2 style="text-align: center; font-size:25px" >Student Previlages</h2>
	<div
		style="border: 2px solid black; padding: 10px; margin: 2% 25% 2% 25%; font-size: 20px;">
		<h3>Choose a class to enter</h3>
		
		<button id="class" name="enter classroom" ">
			<a href="classroom.jsp" style="text-decoration: none";"color:black">Enter
				Maths Class</a>
		</button>
		&emsp;&emsp;&emsp;
		<button id="class" name="enter classroom">
			<a href="classroom1.jsp" style="text-decoration: none";"color:black">Enter
				Physics Class</a> <br>
		</button>
		<hr>

		<!-- <br>
	<button id="assign" name="Assignments">submit assignemnts</button>
	<br> -->
	

		<form action="assignmentServlet" style="text-align: center;">
		<h3>Assignments Submition</h3>
			<label style="text-align: center;">Enter Subject name</label><input
				type="text" name="subjectName"><br> <br> <label>Enter
				Student name</label><input type="text" name="studentName"><br>
			<br> <label>Select Assignment </label><input
				type="file" name="assignment" required><br> <br> <input
				type="Submit" value="upload">
		</form>
	</div>
</body>
</html>
