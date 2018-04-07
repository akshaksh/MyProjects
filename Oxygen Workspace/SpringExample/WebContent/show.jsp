<html>
   <head>
      <title>Show Results</title>
   </head>
   
   <body>
      <jsp:useBean id = "students" class="com.tutorialspoint.StudentsBean" scope="session"> 
      </jsp:useBean>

      <p>Student First Name: 
         <jsp:getProperty name = "students" property = "firstName"/>
      </p>
      
      <p>Student Last Name: 
         <jsp:getProperty name = "students" property = "lastName"/>
      </p>
      
      <p>Student Age: 
         <jsp:getProperty name = "students" property = "age"/>
      </p>
   </body>
</html>