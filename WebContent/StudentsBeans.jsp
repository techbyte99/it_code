<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student JavaBean</title>
</head>
<body>
	<jsp:useBean id = "students" class = "com.javabean_programs.JavaBean_Ques1"> 
		<jsp:setProperty name = "students" property = "firstName" value = "Yash"/>
		<jsp:setProperty name = "students" property = "lastName" value = "Sharma"/>
		<jsp:setProperty name = "students" property = "age" value = "20"/>
		<jsp:setProperty name = "students" property = "rollNumber" value = "16/CS/017"/>
		<jsp:setProperty name = "students" property = "courseName" value = "B.Sc (H.) Computer Science"/>
	</jsp:useBean>
	
	<h2 style="text-align:center">Student JavaBeans</h2>
	
	<p>Student Details:</p>
	
	<p><b>Name: </b>
	   <jsp:getProperty name = "students" property = "firstName"/> <jsp:getProperty name = "students" property = "lastName"/>
	</p>
	
	<p><b>Age: </b> 
	   <jsp:getProperty name = "students" property = "age"/>
	</p>
	
	<p><b>Roll Number: </b> 
	   <jsp:getProperty name = "students" property = "rollNumber"/>
	</p>
	
	<p><b>Course: </b> 
	   <jsp:getProperty name = "students" property = "courseName"/>
	</p>
</body>
</html>