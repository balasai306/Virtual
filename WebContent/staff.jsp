
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body bgcolor="#AFD1F6"style="border: 5px solid black; padding: 10px; margin: 5% 5% 5% 5%;">
	<h1 style="text-align: center">
		<%
			String username = session.getAttribute("username").toString();
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		} else {
			out.println("Welcome to Staff Portal  " + username);
		}
		%>
	</h1>
	<form action="logout">
		<button id="logout" name="logout" value="logout"
			style="width: 150px; float: right">logout</button>
		<br>
	</form>
	<div
		style="border: 2px solid black; padding: 10px; margin: 5% 25% 5% 25%; font-size: 20px;">
<h3 style="font-size:25px">Staff Previlages</h3>
	
		<form action="marks"  style="text-align:center">
			<label>Enter Student name </label> <input tpye="text"
				name="studentName"> <br> 
				<label>Enter Subject name:</label><input type="text"
				name="subjectName"> 
				<br><label>Enter marks: &emsp;  &emsp;  </label> <input
				tpye="text" name="marks"> <br><br>
			<button id="marks" name="marks" value="marks" style="width: 150px">upload</button>
			<br>
		</form>
			<br>
	
		<form action="ViewMarks"   style="text-align:center">
			<button id="class" type="submit" style="width: 150px; ">
				viewmarks</button>
		</form>


	</div>

	
</body>

</html>
