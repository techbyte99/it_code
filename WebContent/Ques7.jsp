<%@taglib prefix="ex" uri="WEB-INF/tlds/Ques7.tld" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SubString Tag</title>
</head>
<body>

	<h2 style="text-align: center">Custom Tags substring</h2>

	<form action="Ques7.jsp" method="post">
		<input type="hidden" name="submitted" value="true">
		
		Enter a string: <input type="text" name="str" required><br><br>
		Starting Index: <input type="number" name="begin" required><br><br>
		Ending Index:   <input type="number" name="end" required><br><br>
		
		<input type="submit">
	</form>
	
	<br><br>
	
	<c:if test = "${param.submitted && (not empty param.str && not empty param.begin && not empty param.end)}">
		<h3>Output</h3>
		<p style="text-align: center; font-size:2em">
			<ex:substring input="${param.str}" begin="${param.begin}" end="${param.end}"/>
		</p>
	</c:if>
</body>
</html>