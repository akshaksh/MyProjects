<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Add New Customer</title>
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />
</head>
<body>
	<div id="container">
	<h3>Add Customer</h3>
	<form:form modelAttribute="newcustomer" action="processAddCustomerForm">
		<table>
			<tbody>
				<tr>
					<td><label>First Name :</label></td>
					<td><form:input path="firstName"/></td>
				</tr>
				<tr>
					<td><label>Last Name :</label></td>
					<td><form:input path="lastName"/></td>
				</tr>
				<tr>
					<td><label>E-mail :</label></td>
					<td><form:input path="email"/></td>
				</tr>
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Add"></td>
				</tr>
			</tbody>
		</table>
	</form:form>
	<div style="clear;both;"></div>
	<p>
		<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
	</p>
	</div>
</body>
</html>