<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose</title>
</head>
<body>
<form action="sendMail" method="post">
	<pre>
		to<input type="text" name="toEmail" value="${email}"/>
		subject<input type="text" name="subject"/>
		<textarea name="emailBody" rows="20" cols="100">
		
		</textarea>
		<input type="submit" value="send"/>	
	</pre>
	</form>
${msg}
</body>
</html>