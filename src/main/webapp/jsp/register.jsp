<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Roboto:400,700"
	rel="stylesheet">
<title>Sign Up</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
body {
	color: #fff;
	background: #3598dc;
	font-family: 'Roboto', sans-serif;
}

.form-control {
	min-height: 41px;
	box-shadow: none;
	border-color: #ddd;
}

.form-control, .btn {
	border-radius: 3px;
}

.signup-form {
	width: 390px;
	margin: 0 auto;
	padding: 30px 0;
}

.signup-form form {
	color: #999;
	border-radius: 3px;
	margin-bottom: 15px;
	background: #fff;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}

.signup-form h2 {
	color: #333;
	font-weight: bold;
	margin-top: 0;
}

.signup-form hr {
	margin: 0 -30px 20px;
}

.signup-form .form-group {
	margin-bottom: 20px;
}

.signup-form label {
	font-weight: normal;
	font-size: 13px;
}

.signup-form input[type="checkbox"] {
	margin-top: 2px;
}

.signup-form .btn {
	font-size: 16px;
	font-weight: bold;
	background: #3598dc;
	border: none;
	min-width: 140px;
}

.signup-form .btn:hover, .signup-form .btn:active {
	background: #2389cd;
	outline: none !important;
}

.signup-form a {
	color: #fff;
	text-decoration: underline;
}

.signup-form a:hover {
	text-decoration: none;
}

.signup-form form a {
	color: #3598dc;
	text-decoration: none;
}

.signup-form form a:hover {
	text-decoration: underline;
}
</style>
</head>

<body>
	<div class="signup-form">
		<form:form action="signUp" method="post" modelAtrribute="user">
			<h2>Sign Up</h2>
			<p>Please fill in this form to create an account!</p>
			<hr>
			<div class="form-group">
				<label>Username</label> 
				<form:input path="username" type="text" class="form-control"
					name="username" maxlength="20" required="required"/>
			</div>
			<div class="form-group">
				<label>Email Address</label> 
				<form:input type="email" path="email"
					class="form-control" name="email" required="required"/>
			</div>
			<div class="form-group">
				<label>Password</label> 
				<form:input path="password" type="password" class="form-control"
					name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" maxlength="20" required="required"/>
			</div>
			<div class="form-group">
				<label>Confirm Password</label> 
				<form:input path="confirmPassword" type="password"
					class="form-control" name="confirmPassword" required="required" id="confirmPassword" onChange="isPasswordMatch();"/>
			</div>
			<!-- Multiple Radios (inline) -->
			<div class="form-group">
				<label class="col-md-6 control-label" for="role">Role</label>
				<div class="col-md-4">
					<label class="radio-inline" for="role-0">
					 <form:input path="role" type="radio" name="role" id="role-0" value="User"
						checked="checked"/> User
					</label>
					 <label class="radio-inline" for="role-1">
					 <form:input path="role" type="radio" name="role" id="role-1" value="Admin"/> Admin
					</label>
				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col control-label" for="mobilenumber">Mobile
					Number</label> 
					<form:input path="mobileNumber" id="mobileNumber" name="mobileNumber" type="number"
					placeholder="Mobile Number" class="form-control input-md"
					pattern="[0-9]{10,10}" title="Don't include '0'" maxlength="10" required="required"/>

			</div>


			<div class="form-group">
				<label class="checkbox-inline">
				<input type="checkbox"
					required="required"> <a href="#">confirm email</a></label>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-lg">Sign
					Up</button>
			</div>
		</form:form>
		<div class="text-center">
			Already have an account? <a href="index">Login here</a>
		</div>
	</div>
</body>
<script type="text/javascript">
$('#confirmPassword').on('keyup', function () {
    var password = $("#password").val();
    var confirmPassword = $("#confirmPassword").val();
    if (password != confirmPassword) $("#divCheckPassword").html("Passwords do not match!").css('color','red');
    else $("#divCheckPassword").html("Passwords match.").css("color","green");
});
</script>
</html>