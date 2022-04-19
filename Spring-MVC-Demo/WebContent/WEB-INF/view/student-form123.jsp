<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- student is the student object reference name in Student123Controller -->
	<form:form action="processForm" modelAttribute="student">
	FirstName: <form:input path="firstName"></form:input>
		<br>
	LastName: <form:input path="lastName"></form:input>
		<br>
		<input type="submit" value="submit data">
	</form:form>
</body>
</html>