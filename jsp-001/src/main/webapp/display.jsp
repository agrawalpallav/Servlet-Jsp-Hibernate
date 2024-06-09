<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% HttpSession hs = request.getSession(); %>
	<%=hs.getAttribute("n") %>
	<%=hs.getAttribute("g") %><br>
	<%=session.getAttribute("n") %>
	<%=session.getAttribute("g") %>
</body>
</html>