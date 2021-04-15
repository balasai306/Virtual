<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body bgcolor="silver" style="border: 5px solid black; padding: 10px; margin: 5% 5% 5% 5%;">
	<header style="font-size: 60px; text-align: center">Welcome to
		Virtual Class</header>

	<div
		style="margin: 5% 35% 10% 35%; border: 2px solid black; width: 30%; height: 450px">
	
		<img alt="image" src="https://img.icons8.com/dusk/64/000000/monitor--v1.png" 
			style="text-align: center; display:block; width:100px;margin-left:auto; margin-right:auto;padding:10% 5% 10% 5%">
			<h3 style="text-align: center;">Please enter your credentials</h3>
		<form action="login" method="get"
			style="text-align: center; padding: 10px 0px 10px 0px">

			Enter username <input type="text" name="username"><br> <br>

			Enter password <input type="password" name="password"><br>
			<br> <select name="user" id="list" required placeholder="choose"
				style="width: 100px">
				<option value="">select</option>
				<option value="student">student</option>
				<option value="staff">staff</option>
				<option value="admin">admin</option>

			</select> <br>
			<br> <input type="submit" value="login"> <br>

		</form>
	</div>

</body>
</html>