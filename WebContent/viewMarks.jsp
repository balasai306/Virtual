<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student marks</title>
</head>
<body bgcolor="#AFD1F6"style="border: 5px solid black; padding: 10px; margin: 5% 10% 5% 10%;">
<h3 style="font-size: 30px;text-align:center" >Student Marks and Assignment status</h3>
<div style="width:auto; border:2px solid black; margin:5px 10px 5px 10px ; background-color:#B0A295;padding:5% 8% 5% 8%">
<p Style="font-size: 25px">Format: Subject, Student Name, Status, Marks</p>
<hr>
<ol type="1">

<c:forEach var="s" items="${ view_1}"> 
<br>
 <li Style="font-size: 23px"> ${s} <br> <hr> </c:forEach></ol></div>
 
 <div style=" margin:10px 5px 5px 5px;text-align:center;">
 <button id="class" name="Return" style="width: 150px">
			<a href="staff.jsp" style="text-decoration: none; color:black";"color:black">Back</a>
		</button>
		<br>
		</div>


</body>


</html>