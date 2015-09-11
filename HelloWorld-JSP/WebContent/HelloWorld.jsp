<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World JSP</title>
</head>
<body>
	<h2>JSP:</h2>
	<p>A JSP is an HTML page where I can also embed java</p>
	<p>This page will be compiled into a servlet by the application server engine (in this case Tomcat) before running our application</p>
	
	<i><%= "Hello World JSP from Java" %></i>
	<br>
	<i><%= new java.util.Date() %></i>
	<br>
	
	<%  
	java.util.Date today = new java.util.Date();
	String text = "Today's date is" + today.toString();
	%>
	<i>
	<%= text %>
	</i>
	<br>
	
	<%  
	String text2 = "Today's date is: ";
	
	out.println(text2);
	%>
	<%= new java.util.Date() %>
	
	
</body>
</html>