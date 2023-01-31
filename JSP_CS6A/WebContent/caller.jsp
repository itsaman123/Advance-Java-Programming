<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Caller JSP Page</title>
</head>
<body>

<h1>Caller JSP Page</h1>

<%
    String param1 = "Hello";
    String param2 = "World";
    request.setAttribute("param1", param1);
    request.setattribute("param2", param2);
    request.getRequestDispatcher("callee.jsp").forward(request, response);
%>

</body>
</html>
