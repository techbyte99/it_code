<%@taglib prefix="ex" uri="WEB-INF/tlds/Ques10.tld" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question 10</title>
</head>
<body>
	<p style="text-align: center; font-size:2em">
		<ex:uname name="${param.name}" />
	</p>
	<c:set var = "name" value = "${param.name}" scope = "session"/>
	
	<br>
	
	<div style="text-align: center">
		<form action="Ques10_2.jsp" method="POST">
			<h4>Select the Product</h4>
			
			<input type="radio" name="sell" value="Phone">Phone<br>
			<input type="radio" name="sell" value="Laptop">Laptop<br>
			<input type="radio" name="sell" value="TV">TV<br><br>
			
			<input type="submit">
	    </form>
    </div>
</body>
</html>