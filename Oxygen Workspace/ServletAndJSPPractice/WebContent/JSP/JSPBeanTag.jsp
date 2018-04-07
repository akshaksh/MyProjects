<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="beans.JavaBeans"></jsp:useBean>
<jsp:setProperty property="age" name="obj" value="50"/>
<jsp:setProperty property="name" name="obj" value="Ajay"/>
<jsp:setProperty property="lastname" name="obj" value="Kushwaha"/>
<%  
//obj.setAge(10);
//obj.setName("Ajay");
//obj.setLastname("Kushwaha");
out.println(obj.getAge());
out.println(obj.getName());
out.println(obj.getLastname());
%>
</body>
</html>