<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "com.wu.crmdemo.entity.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
</head>
<body>
<div id="wrapper">
				<div id = "header">
						<h1>CRM - Customer Repationship Manager</h1>
						<h2>List of Customers</h2>
				</div>
			</div>
			<div id="buttondiv">
					<form action="showFormForAdd.jsp">
							<input type="submit" value="ADD CUSTOMER">
					</form>
			</div>
			<div id="tablediv">
				<!-- Adding HTML Table here -->
				<br><br>
				<table border="1">
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Action</th>
					</tr>
					<% ArrayList<Customer> customers = (ArrayList<Customer>)request.getAttribute("custdata"); %>		
					<!-- Iterating through Customer List -->
					
					<%for(Customer customer : customers) 
					{%>
						<tr>
							<td><%=customer.getFirstName() %></td>
							<td><%=customer.getLastName() %></td>
							<td><%=customer.getEmail() %></td>
							<td> <a href="showFormForUpdate.jsp?firstName=<%= customer.getFirstName() %>
																&lastName=<%= customer.getLastName() %>
																&email=<%= customer.getEmail() %>">UPDATE|</a>
							<a href="DeleteCustomerController?lastName=<%=customer.getLastName()%>">DELETE</a></td>
						</tr>
					
					<%}%>
				
				</table>
			
			
			</div>
</body>
</html>