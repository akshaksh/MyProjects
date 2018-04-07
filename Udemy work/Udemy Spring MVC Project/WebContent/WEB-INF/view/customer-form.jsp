<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Customer Form</title>
<style type="text/css">
.error{
color:red;
}
</style>
</head>
<body>
<form:form method="post" modelAttribute="customer" action="customerProcessForm">
First name(*):<form:input path="firstName"/><form:errors  path="firstName" cssClass="error"></form:errors><br><br>
Last name:<form:input path="lastName"/><br><br>
Free Pass:<form:input path="freePass"/><form:errors  path="freePass" cssClass="error"></form:errors><br><br>
Postal Code:<form:input path="postalCode"/><form:errors cssClass="error" path="postalCode"></form:errors><br><br>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>