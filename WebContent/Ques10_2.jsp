<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question 10</title>
</head>
<body>
	<p style="text-align: center; font-size:2em">
		Hello <c:out value="${name}" />, You have ordered <c:out value="${param.sell}" />
	</p>
</body>
</html>