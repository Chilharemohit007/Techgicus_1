<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
	<h2>All Interns</h2>
	<table border='1'>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Course Name</th>
			<th>Batch</th>
			<th>Advance Fees</th>
			<th>Address</th>
			<th>Intern Source</th>	
			<th>Joining Date</th>
			<th>Balance Fees</th>
			<th>Delete</th>
			<th>Update</th>			
		</tr>
		<c:forEach items="${interns}" var="intern">
		<tr>
			<td><a href="getInternInfo?id=${intern.id}">${intern.id}</a></td>
			<td>${intern.firstName}</td>
			<td>${intern.lastName}</td>
			<td>${intern.email}</td>
			<td>${intern.mobile}</td>
			<td>${intern.courseName}</td>
			<td>${intern.batch}</td>
			<td>${intern.address}</td>
			<td>${intern.internSource}</td>
			<td>${intern.joiningDate}</td>
			<td>${intern.advanceFees}</td>
			<td>${intern.balanceFees}</td>
			<td><a href="delete?id=${intern.id}">Delete</a></td>
			<td><a href="update?id=${intern.id}">Update</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>