
<!DOCTYPE html>
<html>
<head>
<%@include file="header.html"%>

</head>

<body>

	<div class="row">
		<div class="col s12 m8 lg4">
			<form class="col s6" method="post" action="login">

				<div class="card blue-grey darken">
					<div class="card-content">
						<span class="card-title white-text"><h4>Login</h4></span>
						<hr>
						<div class="row">
							<div class="input-field col s6 white-text">
								<input id="roll" type="text" name="roll" class="validate" required>
								<label for="roll">Roll Number</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s6">
								<input type="password" name="password" class="validate"
									id="password"> <label for="password">Password</label>
							</div>
						</div>
						</span>
						<div class="card-action">
							<input type="submit" value="Let Me In" id="submit"
								class="validate waves-effect waves-light btn"> <a
								class="waves-effect waves-light btn" href="signup.jsp">Sign
								Up</a>
						</div>
			</form>

		</div>
	</div>
	</div>
	</div>



	<%@include file="footer.html"%>

</body>
</html>