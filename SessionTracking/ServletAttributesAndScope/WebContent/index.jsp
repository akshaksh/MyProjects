<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="pagevariable" value="pagevariable" scope="page" />
<c:set var="requestvariable" value="requestvariable" scope="request" />
<c:set var="sessionvariable" value="sessionvariable" scope="session" />
<c:set var="applicationvariable" value="applicationvariable" scope="application" />
pagevariable:<c:out value="${pagevariable}" /><br>
requestvariable:<c:out value="${requestvariable}"/><br>
sessionvariable:<c:out value="${sessionvariable}" /><br>
applicationvariable:<c:out value="${applicationvariable}" /><br>
<a href="test.jsp">Test Page</a>
<!-- jsp:action persist request scope attribute on second page but if we use hyperlink then it will not maintain -->
<%-- <jsp:include page="test.jsp"></jsp:include> --%>
<%-- <jsp:forward page="test.jsp"></jsp:forward> --%>
