<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <%@include file="header.html" %> 
</head>
<body>	
	<h2>HOD</h2>
	<h2> You are logged IN</h2></div>
		 <%
		String roll = request.getAttribute("roll").toString();
		String result = request.getAttribute("result").toString();
		
		if(!result.equalsIgnoreCase("Fail") && result != null)
		{
			out.write("<h2>"+roll+"</h2>");
			//out.write("<p><h3>"+result+"</h3></p>");
		}
		else
		{
			out.write("<h2>Error :"+result+"</h2>");
		}
	
	%> 
	<a href="index.jsp">Home</a>
	
	
	
	
	
	  <%@include file="footer.html" %> 
</body>
</html>