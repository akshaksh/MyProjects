<html>

<body>
<h1>Spring MVC file upload example</h1>
<p>Single File Upload</p>
<form method="POST" action="${pageContext.request.contextPath}/loading/uploadSingle" enctype="multipart/form-data">
    <input type="file" name="file" /><br/>
    <input type="submit" value="Submit" />
</form>
<br><br><br>
<p>Multiple File Upload</p>
<form method="POST" action="${pageContext.request.contextPath}/loading/uploadMultiple" enctype="multipart/form-data">
    <input type="file" name="files" /><br/>
    <input type="file" name="files" /><br/>
    <input type="file" name="files" /><br/>
    <input type="submit" value="Submit" />
</form>
</body>
</html>