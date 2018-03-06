
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <%--  <%@include file="header.html" %>  --%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up</title>
</head>
<body>

	<a href="index.jsp">Home</a>
	<div class="row">
    <form class="col s6 method="post" action="SignUp">
      <div class="row">
        	  <div class="input-field col s6">
          <input id="first_name" type="text" class="validate" name="first_name">
          <label for="first_name" data-error="wrong" data-success="right">First Name</label>
          </div>
          <div class="input-field col s6">
           <input id="last_name" type="text" class="validate" name="last_name">
          <label for="last_name" data-error="wrong" data-success="right">Last Name</label>
          </div>
          <div class="input-field col s12">
        		<input id="email" type="email" class="validate" name="email">
        		<label for="email" data-error="wrong" data-success="right">Email Address</label>
          </div>
          <div class="input-field col s12">
        		<input id="roll" type="text" class="validate" name="roll">
        		<label for="roll" data-error="wrong" data-success="right">Roll Number</label>
          </div>
	      <div class="input-field col s12">
	         <input id="password" type="password" class="validate" name="password">
	         <label for="password" data-error="wrong" data-success="right">Password</label>
	       </div>
           <div class="input-field col s12 m6">
           	
			    <select name="branch">
			        <option value="cse">CSE</option>
			        <option value="mech">Mechincal</option>
			        <option value="civil">Civil</option>
			        <option value="ece">Ece</option>
			    </select>
			    <label>Branch</label>
 		  </div>		
 		  <div class="input-field col s6">
 		  	<select name="role" class="browser-default">
 		  		<option value="" disabled selected>Choose Your Role</option>
 		  		<option value="s">Student</option>
 		  		<option value="t">Teacher</option>
 		  	</select>
 		  		<label>Login As:</label>
 		  </div>
 		   <div class="input-field col s12">
	         <input id="contact" type="text" class="validate" name="contact">
	         <label for="contact" data-error="wrong" data-success="right">Contact Number</label>
	       </div>
 		  
     	<div class="input-field col s12">
          <input type="submit" class="validate waves-effect waves-light btn" value="Create Account">
        </div>
      </div>
    </form>
  </div>


	 <%@include file="footer.html" %> 
</body>
</html>