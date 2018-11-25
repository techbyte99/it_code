<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><h2>Question 2 </h2>
<h2>Question 2 query submission </h2>
</title>
</head>
<body>
	<h2 style = "text-align: center">Mathematics</h2>
	
		<%
			int x = Integer.parseInt(request.getParameter("number_x"));
			int y = Integer.parseInt(request.getParameter("number_y"));

			String operation = request.getParameter("maths");

			if (operation.equals("addition")){
				out.print("<h4>Value: " + (x + y) + "</h4>");	
			}
			else if (operation.equals("subtraction")){
				out.print("<h4>Value: " + (x - y) + "</h4>");	
			}
			else{
				out.print("<h4>Value: " + (x * y) + "</h4>");	
			}
			
		%>
</body>
</html>