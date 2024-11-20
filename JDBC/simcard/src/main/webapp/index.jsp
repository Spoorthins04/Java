<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	background-color: skyblue;
}

.heading {
	text-align: center;
	font-family: cursive;
	margin-top: 2rem;
}
</style>
</head>

<body>
	<div class="heading">
		<h2>Store Your Data here</h2>
	</div>
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="card p-4">
					<form action="join-now" method="post">
						<div class="form-group">
							<label for="firstName">First Name</label> <input type="text"
								name="firstName" id="firstName" class="form-control">
						</div>

						<div class="form-group">
							<label for="lastName">Last Name</label> <input type="text"
								name="lastName" id="lastName" class="form-control">
						</div>

						<div class="form-group">
							<label for="email">Email</label> <input type="text" name="email"
								id="email" class="form-control">
						</div>

						<div class="form-group">
							<label for="password">Password</label> <input type="password"
								name="password" id="password" class="form-control">
						</div>

						<div class="form-group text-center">
							<p>
								By clicking Join now, you agree to <strong>User's
									Agreement</strong> and <strong>Privacy Policy</strong>.
							</p>
						</div>

						<div class="form-group text-center">
							<input type="submit" value="Join Now"
								class="btn btn-primary btn-block">
						</div>

						<div class="form-group text-center">
							<hr class="w-50 mx-auto">
							<span>or</span>
							<hr class="w-50 mx-auto">
						</div>

						<div class="form-group text-center">
							<input type="submit" value="Continue with Facebook"
								class="btn btn-secondary btn-block">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>

</html>