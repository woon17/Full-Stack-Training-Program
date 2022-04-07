<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<p>
		<span>Welcome</span>,
		<%
		// println in broswer, in client machine. not in console
		HttpSession ses = request.getSession();
		out.println(ses.getAttribute("un"));
		/* ses.getAttribute("un") */
		%>.
		<%
		out.println("Current Email: " + ses.getAttribute("email"));
		%>
	</p>
	<a href="/SigninApplication/changeEmail.html">change to a new
		email?</a>


</body>
</html>