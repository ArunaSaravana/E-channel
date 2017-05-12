<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bootstrap Case</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<%@include file="Header.jsp"%>


	<div class="container">
		<div class="row">
			<div class="col-sm-4 col-sm-offset-1">
				<div class="login-form">
					<!--login form-->
					<h2>Login to your account</h2>
					<br>
					<form action="login_check.jsp" method=post>
						<input type="text" placeholder="Mobile Number" name="user_text" /><br>
						<br> <input type="password" placeholder="Password"
							name="password_text" /><br> <br> <span> <input
							type="checkbox">Keep me signed in
						</span> <span> <a href='forgot_password'> <u
								style="font-size: 10pt; margin-left: 10px;">Forgot Password
									?</u></a>
						</span><br> <br>
						<button type="submit" class="btn btn-default">Login</button>
					</form>
				</div>
				<!--/login form-->
			</div>
			<div class="col-sm-1">
				<br> <br> <br>
				<h2 class="or">OR</h2>
			</div>
			<div class="col-sm-4">
				<div class="signup-form">
					<!--sign up form-->
					<h2>New User Signup!</h2>
					<br>
					<form:form action="LoginRegister/user" commandName="user"
						method="post">

						<form:input path="cust_name" placeholder="Name" required="" />
						<br>
						<br>
						<span class="error"></span>
						<form:input path="cust_mail" placeholder="Email Address"
							required="" />
						<br>
						<br>
						<span class="error"></span>
						<form:input path="cust_pwd" placeholder="Password" type="password"
							required="" />
						<br>
						<br>
						<span class="error"></span>
						<form:input path="cust_conf_pwd" placeholder="Confirm Password"
							type="password" required="" />
						<br>
						<br>
						<span class="error"></span>
						<form:input path="cust_phone" placeholder="Mobile number"
							required="" />
						<br>
						<br>
						<span class="error"></span>
						<form:select path="role">
							<form:option value="USER">User</form:option>
							<form:option value="SUPPLIER">Supplier</form:option>
						</form:select>

						<br>
						<br>
						<input type="submit" class="btn btn-default" value="Signup">
					</form:form>
				</div>
				<!--/sign up form-->
			</div>
		</div>
	</div>
	<br>
	<br>
	<%@include file="Footer.jsp"%>
</body>
</html>