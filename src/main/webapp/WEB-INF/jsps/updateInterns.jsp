<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
	<h2>Update Interns Here.......</h2>
	<form action="updateInternData" method="post">
	<pre>
		Id<input type="text" name="id" value="${intern.id}" readonly>
		First Name<input type="text" name="firstName" value="${intern.firstName}"/>
		Last Name<input type="text" name="lastName" value="${intern.lastName}"/>
		Email<input type="text" name="email" value="${intern.email}"/>
		Mobile<input type="text" name="mobile" value="${intern.mobile}"/>
		Course Name<input type="text" name="courseName" value="${intern.courseName}"/>
		Batch<input type="text" name="batch" value="${intern.batch}"/>
		Address<input type="text" name="address" value="${intern.address}"/>
		<label for="internsource">Choose a source:</label>
		<select name="internSource" id="interns">
  			<option value="friend">Friend</option>
  			<option value="socialMedia">Social Media</option>
  			<option value="website">Website</option>
		</select>
		Joining Date<input type="text" name="joiningDate" value="${intern.joiningDate}"/>
		Advance Fees<input type="text" name="advanceFees" value="${intern.advanceFees}"/>
		Balance Fees<input type="text" name="balanceFees" value="${intern.balanceFees}"/>
		<input type="submit" value="update"/>
	</pre>
	</form>
</body>
</html>