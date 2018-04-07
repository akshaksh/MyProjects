<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<title>
	Form Page
</title>
<body>
<form action="processFormVersionTwo" method="get">
Name:<input type="text" name="name" id="username" placeholder="What's your name"><br>
Lastname:<input type="text" name="lastname" id="userlastname" placeholder="What's your last name"><br>
Age:<input type="text" name="age" id="age" placeholder="What's your age"><br>
<input type="submit" name="Submit" value="Submit Query">
</form>
</body>
</html>