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
		<span>Welcome customer</span>,
		<%
		// println in broswer, in client machine. not in console
		HttpSession ses = request.getSession();
		out.println(ses.getAttribute("un"));
		/* ses.getAttribute("un") */
		%>. You login successfully
	</p>
	<a href="/CarServiceSystem/addNewCarDetails.html">Add car detail</a><br>
	<a href="/CarServiceSystem/requestForService.html">Request for a service</a>
</body>
</html>