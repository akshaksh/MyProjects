<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<title>StudentInfoForms</title>
	</head>
	<body>
		<form:form action="processShowPage" modelAttribute="student" method="post">
			FirstName:<form:input path="firstName"/><br><br>
			LastName:<form:input path="lastName"/><br><br>
			CourseCode:<form:input path="courseCode"/><form:errors cssClass="error" path="courseCode"></form:errors><br><br>
			<input type="submit" value="Form Submit"/>
		</form:form>
	</body>
</html>