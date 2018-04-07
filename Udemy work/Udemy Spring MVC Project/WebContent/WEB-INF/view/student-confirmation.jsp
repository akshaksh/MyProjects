<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Info</title>
</head>
<body>
<!-- this is same attribute name which we created at start -->
firstName:${student.firstName}<br><br>
lastName:${student.lastName}<br><br>
age:${student.age}<br><br>
sex:${student.sex}<br><br>
country:${student.country}<br><br>
state:${student.state}<br><br>
favirouteLanguage:${student.favirouteLanguage}<br><br>
operatingSystem:
<ul>
	<c:forEach var="os" items="${student.operatingSystem}">
		<li>${os}</li>
	</c:forEach>
</ul>
</body>
</html>