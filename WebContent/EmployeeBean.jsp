<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee JavaBean</title>
</head>
<body>
	<jsp:useBean id = "employee" class = "com.javabean_programs.JavaBean_Ques2"> 
		<jsp:setProperty name = "employee" property = "employeeID" value = "10069089"/>
		<jsp:setProperty name = "employee" property = "employeeName" value = "Ron Weasely"/>
		<jsp:setProperty name = "employee" property = "employeeSalary" value = "1050000.00"/>
		<jsp:setProperty name = "employee" property = "employeeShift" value = "10:30 AM - 5:00 PM"/>
	</jsp:useBean>
	
	<h2 style="text-align:center">Employee JavaBeans</h2>
	
	<p>Employee Details:</p>
	
	<p><b>ID: </b>
	   <jsp:getProperty name = "employee" property = "employeeID"/>
	</p>
	
	<p><b>Name: </b> 
	   <jsp:getProperty name = "employee" property = "employeeName"/>
	</p>
	
	<p><b>Salary: </b> 
	   <jsp:getProperty name = "employee" property = "employeeSalary"/>
	</p>
	
	<p><b>Shift: </b> 
	   <jsp:getProperty name = "employee" property = "employeeShift"/>
	</p>
</body>
</html>