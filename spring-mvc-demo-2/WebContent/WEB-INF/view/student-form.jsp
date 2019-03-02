<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student registgration form</title>
</head>
<body>



<form:form action="processForm" modelAttribute="student"> 
	First Name: <form:input path="firstName" /> 
	<br><br>
	Last Name: <form:input path="lastName"  />
	<br><br>
	<input type="submit" value="Submit">
	<br><br>
	<form:select path="country">
		<form:option value="USA"  label="USA"/>
		<form:option value="UK"  label="UK"/>
		<form:option value="Japan"  label="Japan"/>
		<form:option value="Russia"  label="Russia"/>
	</form:select>
	<br> <br>
	
	
	<form:select path="cityOptions">
		<form:options items="${student.cityOptions}" />	
	</form:select>
	
	<br><br>
</form:form>








</body>
</html>