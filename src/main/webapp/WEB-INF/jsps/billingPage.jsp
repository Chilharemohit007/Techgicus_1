<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing</title>
</head>
<body>
	<h3>      !! HAR HAR MAHADEV !!      </h3>
	<h4>>>>>>>>>>>Bill Invoice>>>>>>>>>>></h4>
	<p align="left">
    <b>Company :</b>
	TECHGICUS Software Solution Pvt. Ltd.<br>
	Kharbi Square, Nagpur-440009.</p>
	<p align="right">
    <b>GST No. :</b> TECH2345327601<br>
    </p>
    
	<form action="" method="post">
		<pre>
		Date<input type="date" name="date"/>
		Billed to<input type="text" name="billedTo"/>
		Amount Paid<input type="text" name="amountPaid"/>
		<input type="submit" value="GenerateBill"/>
		</pre>
	</form>
</body>
</html>