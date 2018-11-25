<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head></head>
	<body>
		<form action = "Ques1_part2.jsp">
			Enter value of n: <input type = "number" name = "n">
			<input type = "submit" value = "Submit">
		</form>

		<c:forEach var = "i" begin = "1" end = "${param.n}">
			<c:forEach var = "j" begin = "1" end = "${i}">
				<c:out value="${j}"/>
			</c:forEach>
			<br>
		</c:forEach>
	</body>
</html>
