<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
    
<%
Connection con = null;
Statement stmt = null;
ResultSet rs = null;
		 		try
				{  
		   		Class.forName("com.mysql.jdbc.Driver"); 
				out.println("Driver is Loaded");
		   	    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nietdb","root","sps@133"); 
				out.println("<br><br>"); 
				out.println( "Connection is Available");
		   		stmt=con.createStatement();  
		   	        rs=stmt.executeQuery("select * from prakash");
		   	 %>
		    <table border=2 width=50% height=50%>  
				<tr><th>EmpId</th><th>EmpName</th><th>EMPADD</th><th>EMPHONE</th><tr> 
		   	<% while(rs.next())
					{ 
		 			String eid = rs.getString(1);
					String ename = rs.getString(2);
					String eadd = rs.getString(3);
					String ephone = rs.getString(4);
			%>
				<% out.println("<tr><td>" + eid + "</td><td>" + ename + "</td><td>" + eadd + "</td><td>" + ephone + "</td></tr>"); %>   
					
					<%
		  			 }  
		  
				}
				catch(Exception e){out.println(e);}  %>
	

