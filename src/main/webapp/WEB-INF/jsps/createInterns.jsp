<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>intern</title>
</head>
<body>
<h2>Enter Interns Details...</h2>

<form action="saveIntern" method="post">
<pre>
		Id<input type="text" name="id"/>
		First Name<input type="text" name="firstName"/>
		Last Name<input type="text" name="lastName"/>
		Email<input type="text" name="email"/>
		Mobile<input type="text" name="mobile"/>
		Course Name<input type="text" name="courseName"/>
		Batch<input type="text" name="batch"/>
		Address<input type="text" name="address"/>
		
		<label for="internsource">Choose a source:</label>
		<select name="internSource" id="interns">
  			<option value="Friend">Friend</option>
  			<option value="Social Media">Social Media</option>
  			<option value="Website">Website</option>
		</select>
		
		Joining Date<input type="text" name="joiningDate"/>
		Advance Fees<input type="text" name="advanceFees"/>
		Balance Fees<input type="text" name="balanceFees"/>
		
		<input type="submit" value="save intern"/>
</pre>
</form>
</body>
</html>