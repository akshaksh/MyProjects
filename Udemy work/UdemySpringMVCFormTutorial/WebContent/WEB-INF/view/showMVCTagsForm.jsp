<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style type="text/css">
	.error {
      color: #EF1313;
      font-style: italic;
  }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring form tags
</title>
</head>
<body>
	<springform:form action="processMVCTagsForm" modelAttribute="student">
		FirstName(*):<springform:input path="firstName" id="firstName" />
				  <springform:errors path="firstName" cssClass="error" id="first"/><br>
		LastName(*):<springform:input path="lastName" id="lastName" />
				 <springform:errors path="lastName" cssClass="error"/><br>
		Email(*):<springform:input path="email" id="email"/>
			  <springform:errors path="email" cssClass="error"/><br>
		Hobby(*):<springform:checkboxes items="${hobby}" path="hobbyList"/>
			  <springform:errors path="hobbyList" cssClass="error"/><br>
		Course(*):<springform:radiobuttons path="course" items="${courses}"/>
			   <springform:errors path="course" cssClass="error"/><br>
		CourseCode(*):<springform:input path="courseCode" id="courseCode" />
				 <springform:errors path="courseCode" cssClass="error"/><br>
		countryOptions(*):<springform:select path="countryOptions">
					<springform:options items="${countryOptions}"/>
				</springform:select>
				<springform:errors path="countryOptions" cssClass="error"/><br>
		Country(*):<springform:select path="country">
				 <springform:option value="BRAZIL" label="Brazil"/>
				 <springform:option value="FRANCE" label="France"/>
				 <springform:option value="GERMANY" label="Germany"/>
				 <springform:option value="INDIA" label="India"/>
				</springform:select>
				<springform:errors path="country" cssClass="error"/><br>
		Comments(*):<springform:textarea path="comments"/>
				<springform:errors path="comments" cssClass="error"/><br>
		passes(*):<springform:input path="pasess" id="pasess"/>
				  <springform:errors path="pasess" cssClass="error"></springform:errors><br>
<%-- 		Label:<springform:label path="checklabel" value="checklabelvalue"/><br> --%>
		<%-- <springform:hidden path="hiddeninput" value="hiddenvaluecheck" id="hiddenvalue"/><br> --%>
		<input type="submit" value="Register">
	</springform:form>
</body>
</html>