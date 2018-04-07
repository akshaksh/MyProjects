<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
<!-- This is form tag of Spring mvc -->
<!-- modelAttribute="student" must be same like model.addAttribute("student",new Student()); -->
<!--Here i have to use modelAttribute to bind all the inputs of the form with object student -->
<form:form action="processForm" method="get" modelAttribute="student" autocomplete="off">
Firstname:<form:input path="firstName"/><br><br>
Lastname:<form:input path="lastName"/><br><br>
Age:<form:input path="age"/><br><br>
Sex:<form:input path="sex"/><br><br>
Country:
<form:select path="country">
	<form:options items="${theCountryOptions}"/>
</form:select><br><br>
<!-- Here we are showing the values not keys but if whatever values we will
select here internally it will select as key so it will show key value
on printing the state on the jsp -->
State:
<form:select path="state">
	<form:options items="${student.stateItemValues}"/>
</form:select><br><br>
FavriouteLanguage:
<form:radiobuttons path="favirouteLanguage" items="${student.favoriteLanguageOptions}"/><br><br>
Operating System:
<form:checkboxes path="operatingSystem" items="${student.operatingSystemOptions}"/>
<input type="submit" value="Submit Form">
<%-- <form:button value="Submit"/> --%>
</form:form>
</body>
</html>