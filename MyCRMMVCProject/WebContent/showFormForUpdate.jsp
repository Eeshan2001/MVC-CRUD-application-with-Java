<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Record</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h1>CRM - Customer Relationship Management</h1>
			<h2>Add Customer</h2>
		</div>

		<form action="UpdateCustomerController">
			Enter First Name: <input type="text" name="fname"
				value="<%=request.getParameter("firstName")%>"><br>
			<br> Enter Last Name: <input type="text" name="lname"
				value="<%=request.getParameter("lastName")%>"><br>
			<br> Enter Email Address: <input type="text" name="email"
				value="<%=request.getParameter("email")%>"><br>
			<br> <input type="hidden" name="hidden"
				value="<%=request.getParameter("lastName")%>"><br>
			<br> <br> <input type="submit" value="UPDATE">
		</form>
	</div>
</body>
</html>