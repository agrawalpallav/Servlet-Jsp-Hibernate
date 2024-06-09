<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		static{
		System.out.println("static block");
	}
	{
		System.out.println("non-static block");
	}
	static int i =10;
	
	%>
		<%
			System.out.println(i);
		%>
			<%= i %>
		<%
		
		%>	
</body>
</html>