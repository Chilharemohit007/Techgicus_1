<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client Info</title>
</head>
<body>
	<a href="getclients">All Clients</a>
	<h2>Client Information...</h2>
	Id						:${client.id}<br/>
	Date   		  		 	:${client.date}<br/>
	Client Name   		 	:${client.clientName}<br/>
	Email         		 	:${client.email}<br/>
	Mobile	      		 	:${client.mobile}<br/>
	Address       		 	:${client.address}<br/>
	Organisation  		 	:${client.organisation}<br/>
	Requirement	  			:${client.requirement}<br/>
	Project Schedule Date	:${client.projectScheduleDate}<br/>
	Client Source		 	:${client.clientSource}<br/>
	Amount Paid 		 	:${client.amountPaid}<br/>
	Amount Balance   	 	:${client.amountBalance}<br/>
	Payment Date 		 	:${client.paymentDate}<br/>
	Payment Mode		 	:${client.paymentMode}<br/>
	<form action="sendEmailClient" method="post">
		<input type="hidden" name="email" value="${client.email}"/>
		<input type="Submit" value="send email"/>
	</form>
	<form action="clientsContacts" method="post">
		<input type="hidden" name="id" value="${client.id}"/>
		<input type="hidden" name="date" value="${client.date}"/>
		<input type="hidden" name="clientName" value="${client.clientName}"/>
		<input type="hidden" name="email" value="${client.email}"/>
		<input type="hidden" name="mobile" value="${client.mobile}"/>
		<input type="hidden" name="address" value="${client.address}"/>
		<input type="hidden" name="organisation" value="${client.organisation}"/>
		<input type="hidden" name="requirement" value="${client.requirement}"/>
		<input type="hidden" name="projectScheduleDate" value="${client.projectScheduleDate}"/>
		<input type="hidden" name="clientSource" value="${client.clientSource}"/>
		<input type="hidden" name="amountPaid" value="${client.amountPaid}"/>
		<input type="hidden" name="amountBalance" value="${client.amountBalance}"/>
		<input type="hidden" name="paymentDate" value="${client.paymentDate}"/>
		<input type="hidden" name="paymentMode" value="${client.paymentMode}"/>
		
		<input type="submit" value="convert to Immortal Clients"/>
	</form>
</body>
</html>