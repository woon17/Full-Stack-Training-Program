<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	// println in broswer, in client machine. not in console
	HttpSession ses = request.getSession();
	out.println(ses.getAttribute("id"));
	out.println(ses.getAttribute("name"));
	out.println(ses.getAttribute("marks1"));
	out.println(ses.getAttribute("marks2"));
	out.println(ses.getAttribute("marks3"));
	%>


</body>
</html>