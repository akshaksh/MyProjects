<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
FirstName:${thestudent.firstName}<br>
LastName:${thestudent.lastName}<br>
Email:${thestudent.email}<br>
Country:${thestudent.country}<br>
countryOptions:${thestudent.countryOptions}
Course:${thestudent.course}<br>
CourseCode:${thestudent.courseCode}<br>
Comments:${thestudent.comments}<br>
Label:${thestudent.checklabel}<br>
hiddenvalue:${thestudent.hiddeninput}<br>
pasess:${thestudent.pasess}<br><br>
Hobby:
<c:forEach items="${thestudent.hobbyList}" var="hobby">
	<c:out value="${hobby}"></c:out>
</c:forEach>

 </body>
</html>