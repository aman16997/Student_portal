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
<a href="index.jsp">Home</a>
		<h2>Students</h2>
		<h2> You are logged IN</h2></div>
		<%-- <%
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
	
	%>  --%>
	
	
	
	
	
	
	 <ul class="nav nav-tabs" id="myTab" role="tablist">
  <li class="nav-item">
    <a class="nav-link active" id="aboutme-tab" data-toggle="tab" href="#aboutme" role="tab" aria-controls="aboutme" aria-selected="true">About Me</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" id="resumes-tab" data-toggle="tab" href="#resume" role="tab" aria-controls="resume" aria-selected="false">Resume</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact" role="tab" aria-controls="contact" aria-selected="false">Contact</a>
  </li>
</ul>
<div class="tab-content" id="myTabContent">
  <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="aboutme-tab">
  	<h3>About me</h3>
  	
  
  	<h3>Git Repositories</h3>
  
  	 <h3>Work Process</h3>
  	 
  	   	<h3>Fun Facts</h3>
  	 
  	   	<h3>Latest Instagram	</h3>
  	 
  	
  
  
  </div>
  
  <div class="tab-pane fade" id="resume" role="tabpanel" aria-labelledby="resumes-tab">
  
  	<form>
  <div class="form-row">
    <div class="col-md-6 mb-3">
      <label for="validationDefault01">First name</label>
      <input type="text" class="form-control" id="validationDefault01" placeholder="First name" value="Mark" required>
    </div>
    <div class="col-md-6 mb-3">
      <label for="validationDefault02">Last name</label>
      <input type="text" class="form-control" id="validationDefault02" placeholder="Last name" value="Otto" required>
    </div>
    <div class="col-md-4 mb-3">
      <label for="validationDefaultUsername">Username</label>
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text" id="inputGroupPrepend2">@</span>
        </div>
        <input type="text" class="form-control" id="validationDefaultUsername" placeholder="Username" aria-describedby="inputGroupPrepend2" required>
      </div>
    </div>
  </div>
  <div class="form-row">
    <div class="col-md-6 mb-3">
      <label for="validationDefault03">City</label>
      <input type="text" class="form-control" id="validationDefault03" placeholder="City" required>
    </div>
    <div class="col-md-3 mb-3">
      <label for="validationDefault04">State</label>
      <input type="text" class="form-control" id="validationDefault04" placeholder="State" required>
    </div>
    <div class="col-md-3 mb-3">
      <label for="validationDefault05">Zip</label>
      <input type="text" class="form-control" id="validationDefault05" placeholder="Zip" required>
    </div>
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
      <label class="form-check-label" for="invalidCheck2">
        Agree to terms and conditions
      </label>
    </div>
  </div>
  <button class="btn btn-primary" type="submit">Submit form</button>
</form>
  
  
  
  
  
  
  
  
  </div>
  <div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="contact-tab">...</div>
</div>
	

	
	  <%@include file="footer.html" %> 
	
</body>
</html>