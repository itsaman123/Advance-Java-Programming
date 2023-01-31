<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Callee JSP Page</title>
</head>
<body>

<h1>Callee JSP Page</h1>

<%
    String param1 = (String) request.getAttribute("param1");
    String param2 = (String) request.getattribute("param2");
%>

<p>The parameters passed from the caller JSP page are:</p>
<p>param1: <%= param1 %></p>
<p>param2: <%= param2 %></p>

</body>
</html>
