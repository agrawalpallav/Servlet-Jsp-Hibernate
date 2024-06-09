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
		String x = request.getParameter("x");
	    String y = request.getParameter("y");
	    
	    System.out.println(x);
	    System.out.println(y);
	%>

</body>
</html>