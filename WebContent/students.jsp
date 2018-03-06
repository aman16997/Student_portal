<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@include file="header.html"%>
</head>
<body>
	<a href="index.jsp">Home</a>
	<h2>Students</h2>
	<h2>You are logged IN</h2>
	</div>
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



	<a href="index.jsp">Logout</a>


	<form id="test" method="get" action="student1">
		<table border="1" cellpadding="20">
			<tr>
				<td><label>Name</label></td>
				<td class="name">Aman</td>
				<td class="name">Goyal</td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td class="name">Email</td>
			</tr>
			<tr>
				<td><label>Contact Number</label></td>
				<td class="name">234</td>
			</tr>
			<tr>
				<td><label>Branch</label></td>
				<td class="name">branch</td>
			</tr>

			<tr>
				<td><label>Qualification/Education</label></td>
				<td class="name">Qualification</td>
			</tr>
			<tr>
				<td><label>Achivement</label></td>
				<td class="name">Achivement</td>
			</tr>
			<tr>
				<td><label>project</label></td>
				<td class="name">project title</td>
				<td class="name">Summary/Details</td>
			</tr>

			<tr>
				<td><label>Internship</label></td>
				<td class="name">Company</td>
				<td class="name">Details</td>
			</tr>
			<tr>
				<td><label>hobbies</label></td>
				<td class="name">hobbies</td>
			</tr>
			<tr>
				<td><label>Skills(technical/other)</label></td>
				<td class="name">skills</td>
			</tr>
			<tr>
				<td><label>other</label></td>
				<td class="name">other</td>
			</tr>
		</table>
		<br>
		<!-- <input type="text" name="name"> -->
		<button onclick="sub()">Submit</button>

	</form>
	<button id='edit'>Edit</button>


















	<script>
		$('#edit')
				.on(
						'click',
						function() {
							var count = 0;
							var names = [ "first_name", "last_name", "email",
									"contact", "branch", "education",
									"achivement", "git", "intership",
									"hobbies", "skill", "other" ];
							$('.name')
									.each(
											function() {
												var x = $(this).text();
												$(this)
														.replaceWith(
																'<input class="editBox" type="text" value="'+x+'" name="'+names[count]+'"/>');
												count++;
											});
						});

		function sub() {
			$('.editBox').each(function() {
				console.log($(this).attr('name'));
			})

		}
	</script>














	<%@include file="footer.html"%>







</body>
</html>