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
        
      
      <!-- 
      <form method="post" action="login">
  <div class="form-group"> left unspecified, .bmd-form-group will be automatically added (inspect the code)
    <label for="formGroupExampleInput" class="bmd-label-floating">Roll Number</label>
    <input type="text" class="form-control" >
  </div>
  <div class="form-group bmd-form-group"> manually specified 
    <label for="formGroupExampleInput2" class="bmd-label-floating">Another label</label>
    <input type="text" class="form-control" id="formGroupExampleInput2">
  </div>
  <button type="submit" class="btn btn-primary btn-raised">Submit</button>
</form>
       -->
      
      
      
      
      
      
     <%@include file="footer.html" %> 
      
    </body>
  </html>