<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Info</title>
</head>
<body>
	<h2>Intern Contacts Information...</h2>
	Id			 :${internscontactsinfo.id}<br/>
	First Name   :${internscontactsinfo.firstName}<br/>
	Last Name	 :${internscontactsinfo.lastName}<br/>
	Email        :${internscontactsinfo.email}<br/>
	Mobile       :${internscontactsinfo.mobile}<br/>
	Course Name  :${internscontactsinfo.courseName}<br/>
	Batch        :${internscontactsinfo.batch}<br/>
	Address		 :${internscontactsinfo.address}<br/>
	Intern Source:${internscontactsinfo.internSource}<br/>
	Joining Date :${internscontactsinfo.joiningDate}<br/>
	Advance Fees :${internscontactsinfo.advanceFees}<br/>
	Balance Fees :${internscontactsinfo.balanceFees}<br/>
	
	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="${internscontactsinfo.email}"/>
		<input type="Submit" value="send email"/>
	</form>
</body>
</html>