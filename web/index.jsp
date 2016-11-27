<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link type="text/css" rel="stylesheet" href="css/index.css" />
		<link rel="stylesheet" href="css/bootstrap.min.css">
		
		<script src="js/jquery.js"></script>
		<script src="js/bootstrap.min.js"></script>
		
		<title>Universal Hospital Archive Card</title>
	</head>
	
	<body>
		<div class="outer">
			<div class="middle">
				<div class = "row">
					<div class="col-xs-8 col-xs-offset-2 col-sm-6 col-sm-offset-3 inner">
					<!-- System Title -->
					<div class="row">
						<div class="col-lg-8 col-lg-offset-2 col-sm-12 indexLogo">
							<img src="img/UHC.png" alt="Universal Hospital Archive Card">
						</div>
					</div>
					<!-- End of System Title -->
						
					<!-- Login Form-->
					<div class="row">
						<div class="col-sm-6 col-sm-offset-3 col-xs-12 col-xs-offset-0">
							<form class="form login" action="jsp/customer/customerProfile.jsp">
								<input type="hidden" value="login" name="requestType">
								<div class="form-group">
									<input type="text" class="form-control" id="username" name="username" required="required" placeholder="Username">
								</div>
								<div class="form-group">
									<input type="password" class="form-control" id="password" name="password" required="required" placeholder="Password">
								</div>
								<button type="submit" class="btn btn-yellow">Login</button>
							</form>
						</div>
					</div>
					<!-- End of Login Form -->
						
					<!-- Footer -->
					<div class="row">
						<div class="col-sm-6 col-sm-offset-3 indexFooter">
							<p>© 2016 UST UHAC</p>
						</div>
					</div>
					<!-- End of Footer -->
					</div>
				</div>
			</div>				
		</div>

	</body>
</html>