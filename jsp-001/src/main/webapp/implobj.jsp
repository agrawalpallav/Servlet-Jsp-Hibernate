<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%= request.getClass() %><br>
	<%= response.getClass() %><br>
	<%= out.getClass() %><br>
	<%= session.getClass() %><br>
	<%
		out.println("hii");
	    out.print("hello");
	%>

</body>
</html>