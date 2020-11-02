<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(request.getAttribute("add")!=null)
	out.println(request.getAttribute("add"));

if(request.getAttribute("modify")!=null)
	out.println(request.getAttribute("modify"));

if(request.getAttribute("delete")!=null)
	out.println(request.getAttribute("delete"));

if(request.getAttribute("display")!=null)
	out.println(request.getAttribute("display"));
%>
</body>
</html>