<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Hello from jsp</h2>
	
	<%
	
	String s= (String)request.getAttribute("mygreeting");
	out.println(s);
	%>
</body>
</html>