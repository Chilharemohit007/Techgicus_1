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
	<h2>All Clients Contact Book</h2>
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
		<c:forEach items="${clientsContacts}" var="clientContact">
		<tr>
			<td><a href="/payment?id=${clientContact.id}">${clientContact.id}</a></td>
			<td>${clientContact.date}</td>
			<td>${clientContact.clientName}</td>
			<td>${clientContact.email}</td>
			<td>${clientContact.mobile}</td>
			<td>${clientContact.address}</td>
			<td>${clientContact.organisation}</td>
			<td>${clientContact.requirement}</td>
			<td>${clientContact.projectScheduleDate}</td>
			<td>${clientContact.clientSource}</td>
			<td>${clientContact.amountPaid}</td>
			<td>${clientContact.amountBalance}</td>
			<td>${clientContact.paymentDate}</td>
			<td>${clientContact.paymentMode}</td>		
		</tr>
		</c:forEach>
	</table>
</body>
</html>