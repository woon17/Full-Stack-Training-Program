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
		<span>Welcome admin </span>,
		<%
		// println in broswer, in client machine. not in console
		HttpSession ses = request.getSession();
		out.println(ses.getAttribute("un"));
		/* ses.getAttribute("un") */
		%>. You login successfully
	</p>
	<a href="/CarServiceSystem/RegisteredCustomers">Registered
		Customers</a>
	<br>
	<a href="/CarServiceSystem/PendingRequest">Pending
		request</a>
	<br>
	
	<a href="/CarServiceSystem/updateServiceStatus.html">Update Status</a>

</body>
</html>