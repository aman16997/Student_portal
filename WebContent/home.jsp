<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<h2> You are logged IN</h2></div>
		<%
		String result = request.getAttribute("Result").toString();
		
		if(!result.equalsIgnoreCase("Fail") && result != null)
		{
			//out.write("<h2>"+name+"</h2>");
			out.write("<p><h3>"+result+"</h3></p>");
		}
		else
		{
			out.write("<h2>Error :"+result+"</h2>");
		}
	
	%>
	<a href="index.jsp">Home</a>
</body>
</html>