<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>User Information system</title>
	</head>

	<body>
	
		<h2 style = "text-align: center; text-color: blue">User Information</h2>
		
		<form action = "Ques3.jsp" method = "post">
			<input type="hidden" name="submitted" value="true">
		
			Name: <input type = "text" name = "name">
			<c:if test="${param.submitted && empty param.name}">
				<font color="red"> Name field cannot be empty</font>
			</c:if>

			<br><br>

			DOB : <input type = "text" name = "dob"> (Use format DD/MM/YYYY)
			<c:if test="${param.submitted && empty param.dob}">
				<font color="red"> Please Enter your Date of Birth </font>
			</c:if>

			<br><br>
 
			Email Address: <input type = "text" name = "email"> (Use format name@domain.com)
			<c:if test="${param.submitted && empty param.email}">
				<font color="red"> Email Address is a required field </font>
			</c:if>

			<br><br>
			
			Lucky Number: <input type = "text" name = "lucky_number"> (A number between 1 and 100)
			<c:if test="${param.submitted && (param.lucky_number < 1 || param.luck_number > 1000)}">
				<font color="red"> Lucky Number can only be b/w 1 and 1000</font>
			</c:if>

			<br><br>
			
			Favorite Food : <input type = "text" name = "fav_food">
			<c:if test="${param.submitted && empty param.fav_food}">
				<font color="red"> Favorite Food cannot be empty </font>
			</c:if>

			<br><br>

			<input type = "submit", value = "Submit">
		</form>

		<div>
			<c:if test="${param.submitted && (not empty param.name && not empty param.dob && not empty param.email && not empty param.lucky_number && not empty param.fav_food)}">
				<h4> Output </h4>
				
				<p> Name: ${param.name} </p>
				<p> DOB: ${param.dob} </p>
				<p> Email Address: ${param.email} </p>
				<p> Lucky Number: ${param.lucky_number} </p>
				<p> Favorite Food: ${param.fav_food} </p>
			</c:if>
		</div>
	</body>
</html>
