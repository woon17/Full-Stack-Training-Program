<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><p>
		<span>Welcome customer </span>,
		<%
		// println in broswer, in client machine. not in console
		HttpSession ses = request.getSession();
		out.println(ses.getAttribute("un"));
		%>
		<span>. Your service status is </span>
		<%
		out.println(ses.getAttribute("status"));
		%>
	</p>

</body>
</html>