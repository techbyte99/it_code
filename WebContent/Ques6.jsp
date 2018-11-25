<%@taglib prefix="ex" uri="WEB-INF/tlds/Ques6.tld"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Tags</title>
</head>
<body>
	<h2 style="text-align: center">Custom Tags hello and choco</h2>

	<h3>Hello Tag</h3>
	<form action="Ques6.jsp" method="post">
		<input type="hidden" name="submitted" value="true">
		Name : <input type="text" name="name"><br><br>
		<input type="submit">
	</form>
	
	<c:if test = "${param.submitted && not empty param.name}">
		<p style="text-align: center"><ex:hello name = "${param.name}"/></p>
	</c:if>
	
	<br><br>
	
	<h3>Choco Tag</h3>
	<form action="Ques6.jsp" method="post">
		<input type="hidden" name="submitted" value="true">
		Texture : <input type="text" name="texture"><br><br>
		<input type="submit">
	</form>
	
	<c:if test = "${param.submitted && not empty param.texture}">
		<p style="text-align: center"><ex:choco texture = "${param.texture}"/></p>
	</c:if>
</body>
</html>