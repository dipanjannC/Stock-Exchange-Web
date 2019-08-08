<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<form action="/examples/actions/confirmation.php" method="post">
			<h2>Sign Up</h2>
			<p>Please fill in this form to create an account!</p>
			<hr>
			<div class="form-group">
				<label>Username</label> <input type="text" class="form-control"
					name="username" required="required">
			</div>
			<div class="form-group">
				<label>Email Address</label> <input type="email"
					class="form-control" name="email" required="required">
			</div>
			<div class="form-group">
				<label>Password</label> <input type="password" class="form-control"
					name="password" required="required">
			</div>
			<div class="form-group">
				<label>Confirm Password</label> <input type="password"
					class="form-control" name="confirm_password" required="required">
			</div>
			<!-- Multiple Radios (inline) -->
			<div class="form-group">
				<label class="col-md-6 control-label" for="role">Role</label>
				<div class="col-md-4">
					<label class="radio-inline" for="role-0"> <input
						type="radio" name="role" id="role-0" value="User"
						checked="checked"> User
					</label> <label class="radio-inline" for="role-1"> <input
						type="radio" name="role" id="role-1" value="Admin"> Admin
					</label>
				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col control-label" for="mobilenumber">Mobile
					Number</label> <input id="mobilenumber" name="mobilenumber" type="text"
					placeholder="Mobile Number" class="form-control input-md"
					required="">

			</div>


			<div class="form-group">
				<label class="checkbox-inline"><input type="checkbox"
					required="required"> <a href="#">confirm email</a></label>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-lg">Sign
					Up</button>
			</div>
		</form>
		<div class="text-center">
			Already have an account? <a href="#">Login here</a>
		</div>
	</div>
</body>

</html>
