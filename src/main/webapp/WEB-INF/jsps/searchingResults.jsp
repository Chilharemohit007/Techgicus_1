<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
	<h2>All Clients</h2>
	<table border='1'>
		<tr>
			<th>Id</th>
			<th>Date</th>
			<th>Client Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Address</th>
			<th>Organisation</th>
			<th>Requirement</th>
			<th>Project Schedule Date</th>
			<th>Client Source</th>
			<th>Amount Paid</th>
			<th>Amount Balance</th>
			<th>Payment Date</th>
			<th>Payment Mode</th>
		</tr>
		<c:forEach items="${clients}" var="client">
		<tr>
			<td><a href="getClientInfo?id=${client.id}">${client.id}</a></td>
			<td>${client.date}</td>
			<td>${client.clientName}</td>
			<td>${client.email}</td>
			<td>${client.mobile}</td>
			<td>${client.address}</td>
			<td>${client.organisation}</td>
			<td>${client.requirement}</td>
			<td>${client.projectScheduleDate}</td>
			<td>${client.clientSource}</td>
			<td>${client.amountPaid}</td>
			<td>${client.amountBalance}</td>
			<td>${client.paymentDate}</td>
			<td>${client.paymentMode}</td>		
		</tr>
		</c:forEach>
	</table>
</body>
</html>