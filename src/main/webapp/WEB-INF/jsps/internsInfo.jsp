<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Intern Info</title>
</head>
<body>
	<h2>Intern Information...</h2>
	Id			 :${intern.id}<br/>
	First Name   :${intern.firstName}<br/>
	Last Name	 :${intern.lastName}<br/>
	Email        :${intern.email}<br/>
	Mobile       :${intern.mobile}<br/>
	Course Name  :${intern.courseName}<br/>
	Batch        :${intern.batch}<br/>
	Address		 :${intern.address}<br/>
	Intern Source:${intern.internSource}<br/>
	Joining Date :${intern.joiningDate}<br/>
	Advance Fees :${intern.advanceFees}<br/>
	Balance Fees :${intern.balanceFees}<br/>
	
	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="${intern.email}"/>
		<input type="Submit" value="send email"/>
	</form>
	
	<form action="contact" method="post">
		<input type="hidden" name="id" value="${intern.id}"/>
		<input type="hidden" name="firstName" value="${intern.firstName}"/>
		<input type="hidden" name="lastName" value="${intern.lastName}"/>
		<input type="hidden" name="email" value="${intern.email}"/>
		<input type="hidden" name="mobile" value="${intern.mobile}"/>
		<input type="hidden" name="courseName" value="${intern.courseName}"/>
		<input type="hidden" name="batch" value="${intern.batch}"/>
		<input type="hidden" name="address" value="${intern.address}"/>
		<input type="hidden" name="internSource" value="${intern.internSource}"/>
		<input type="hidden" name="joiningDate" value="${intern.joiningDate}"/>
		<input type="hidden" name="advanceFees" value="${intern.advanceFees}"/>
		<input type="hidden" name="balanceFees" value="${intern.balanceFees}"/>
		
		<input type="submit" value="convert to internship"/>
	</form>
</body>
</html>