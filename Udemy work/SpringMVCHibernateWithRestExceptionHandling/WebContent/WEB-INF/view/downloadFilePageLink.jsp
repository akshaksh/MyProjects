<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spring MVC Download File Example</title>
</head>
<body>

    <h1>Spring MVC Download File Example</h1>

    <a href="<c:url value='/download/pdf'/>">Download PDF File</a><br/>
    <a href="<c:url value='/download/doc'/>">Download DOC File</a><br/>
    <a href="<c:url value='/download/image'/>">Download IMAGE File</a><br/>

</body>
</html>