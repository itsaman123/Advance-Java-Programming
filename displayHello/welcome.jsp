<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#78CEED">

<%
	String name=request.getParameter("name");
	out.print("Welcomen to : "+ name);
%>


</body>
</html>