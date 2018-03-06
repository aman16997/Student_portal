 <!DOCTYPE html>
  <html>
    <head>
    	<%@include file="header.html" %> 
     
    </head>

    <body>
  
      
 <div class="row">
    <form class="col s6" method="post" action="login">
      <div class="row">
        <div class="input-field col s12">
          <input id="roll" type="roll" class="validate" name="roll">
          <label for="roll" data-error="wrong" data-success="right">Roll Number</label>
        </div>
        <div class="input-field col s12">
          <input id="pass" type="password" class="validate" name="password">
          <label for="pass" data-error="wrong" data-success="right">Password</label>
        </div>
     	<div class="input-field col s12">
          <input id="submit" type="submit" class="validate waves-effect waves-light btn" value="Let Me In">
          <a class="waves-effect waves-light btn" href="signup.jsp">Sign Up</a>
        </div>
      </div>
      
      
    </form>
  </div> 
           
      
     <%@include file="footer.html" %> 
      
    </body>
  </html>