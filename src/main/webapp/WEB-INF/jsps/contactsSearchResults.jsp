<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results..</title>
</head>
<body>
	<h2>Contact Book</h2>
	<table border='1'>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Course Name</th>
			<th>Batch</th>
			<th>Address</th>
			<th>Intern Source</th>
			<th>Joining Date</th>
			<th>Advance Fees</th>
			<th>Balance Fees</th>
		</tr>
		<c:forEach items="${contacts}" var="contact">
		<tr>
			<td><a href="/getInternsContactsInfo?id=${contact.id}">${contact.id}</a></td>
			<td>${contact.firstName}</td>
			<td>${contact.lastName}</td>
			<td>${contact.email}</td>
			<td>${contact.mobile}</td>
			<td>${contact.courseName}</td>
			<td>${contact.batch}</td>
			<td>${contact.address}</td>
			<td>${contact.internSource}</td>
			<td>${contact.joiningDate}</td>
			<td>${contact.advanceFees}</td>
			<td>${contact.balanceFees}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>