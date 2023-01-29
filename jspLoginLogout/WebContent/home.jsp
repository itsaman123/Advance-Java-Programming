<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<%
Connection con= null;
PreparedStatement ps = null;
ResultSet rs = null;

String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/record";
String user = "root";
String password = "root";

String sql = "select usertype from userdetail";

try {
	Class.forName(driverName);
	con = DriverManager.getConnection(url, user, password);
	ps = con.prepareStatement(sql);
	rs = ps.executeQuery();	
%>
<form method="post" action="login.jsp">
<center><h2 style="color:green">JSP Login Example</h2></center>
<table border="1" align="center">
<tr>
<td>Enter Your Name :</td>
<td><input type="text" name="name"/></td>
</tr>
<tr>
<td>Enter Your Password :</td>
<td><input type="password" name="password"/></td>
</tr>
<tr>
<td>Select UserType</td>
<td><select name="usertype">
<option value="select">select</option>
<%
while(rs.next())
{
	String usertype = rs.getString("usertype");
%>
<option value=<%=usertype%>><%=usertype%></option>
<%		
	}
}
catch(SQLException sqe)
{
	out.println("home"+sqe);
}
%>
</select>
</td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="submit"/></td>
</table>
</form>
</body>
</html>