<%@taglib prefix="ex" uri="WEB-INF/tlds/Ques8.tld" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reverse Tag</title>
</head>
<body>

	<h2 style="text-align: center">Custom Tags reverse</h2>

	<form action="Ques8.jsp" method="post">
		<input type="hidden" name="submitted" value="true">
		
		String: <input type="text" name="str" required><br><br>
		
		<input type="submit">
	</form>
	
	<br><br>
	
	<c:if test = "${param.submitted && not empty param.str}">
		<h3>Output</h3>
		<p style="text-align: center; font-size:2em">
			<ex:reverse input="${param.str}"/>
		</p>
	</c:if>
</body>
</html>