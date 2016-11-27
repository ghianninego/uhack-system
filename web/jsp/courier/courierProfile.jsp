<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link type="text/css" rel="stylesheet" href="../../css/style.css" />
		<link type="text/css" rel="stylesheet" href="../../css/sidebar.css" />
		<link rel="stylesheet" href="../../css/bootstrap.min.css">
		
		<script src="../../js/jquery.js"></script>
		<script src="../../js/bootstrap.min.js"></script>
		
		<title>Universal Hospital Archive Card - Profile</title>
	</head>
	
	<body>
		<!-- Sidebar -->
		<%@include file="../sidebar.jsp" %>
		<!-- End of Sidebar -->
				
		<!-- Content -->
		<div class="content">
			<div class="moduleTitle">
				<h1>PROFILE</h1>
			</div>
			<div class="inprofile">
				<h4>Name</h4>
				<h4 id="space"><%=user.getFirstName() %> <%=user.getMiddleName() %><%=user.getLastName() %></h4>
				<h4>Contact No.</h4>
				<h4 id="space"><%=user.getCellphoneNumber()%></h4>
				<h4>Tel. No.:</h4>
				<h4 id="space"><%=user.getTelephoneNumber()%></h4>
				<h4>Email</h4>
				<h4 id="space"><%=user.getEmail() %></h4>
				<h4>Address:</h4>
				<h4 id="space"><%=user.getAddress() %></h4>
			</div>
		</div>
		<!-- End of Content -->
	</body>
</html>