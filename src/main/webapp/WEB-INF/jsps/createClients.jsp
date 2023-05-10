<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>client</title>
</head>
<body>
	<h2>Enter Clients Info...</h2>
		<form action="saveClient" method="post">
		<pre>
		Id<input type="text" name="id"/>
		Date<input type="date" name="date"/>
		Client Name<input type="text" name="clientName"/>
		Email<input type="text" name="email"/>
		Mobile<input type="text" name="mobile"/>
		Address<input type="text" name="address"/>
		Organisation<input type="text" name="organisation"/>
		Requirement<input type="text" name="requirement"/>
		Project Schedule Date<input type="text" name="projectScheduleDate"/>
		<label for="clientsource">Choose a client source</label>
		<select name="clientSource" id="client">
  			<option value="Friend">Friend</option>
  			<option value="Linkedin">Linkedin</option>
  			<option value="facebook">Facebook</option>
  			<option value="instagram">Instagram</option>
  			<option value="website">Website</option>
		</select>
		Amount Paid<input type="text" name="amountPaid"/>
		Amount Balance<input type="text" name="amountBalance"/>
		Payment Date<input type="text" name="paymentDate"/>
		Payment Mode<input type="text" name="paymentMode"/>
		
		<input type="submit" value="save client"/>
		</pre>
		</form>
${msg}
</body>
</html>