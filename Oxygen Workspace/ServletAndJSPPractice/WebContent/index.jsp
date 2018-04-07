<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Signup Page</title>
</head>
<body>
<form action="UserRegistrationServlet">
	Name:<input id="name" name="name" type="text"><br>
	LastName:<input id="lastname" name="lastname" type="text"><br>
	Email:<input id="email" name="email" type="text"><br>
	DOB:<input id="date" name="date" type="date"><br>
	Gender:
	<select id="gender" name="gender">
		<option>Selection</option>
		<option>Male</option>
		<option>Female</option>		
	</select><br>
	Password:<input type="password" id="password"><br>
	ConfirmPassword:<input type="password" id="ConfirmPassword"><br>
	<input type="submit" value="Submit">
</form>
</body>
</html>