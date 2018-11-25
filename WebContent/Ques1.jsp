<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question 1</title>
</head>
<body>

	<form action = "Quest1.jsp" method = "GET">
		Enter value of n: <input type = "number" name = "n" value = "5">
		<input type = "submit" value = "Submit">
	</form>
	
	<% 
		int a = Integer.parseInt(request.getParameter("n")); %>
	
    <% 
    	for(int i = 1; i < a+1; i++) {
        	for(int j = 1; j <= i; j++)
            	out.print(j +" ");
        	out.print("<br>");
        }
    %>
	
</body>
</html>
