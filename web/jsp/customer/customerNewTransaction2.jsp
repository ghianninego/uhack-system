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
		<script src="../../js/myscript.js"></script>
		
		<title>Universal Hospital Archive Card - New Transaction</title>
	</head>
	
	<body>
		<!-- Sidebar -->
		<%@include file="../sidebar.jsp" %>
		<!-- End of Sidebar -->
				
		<!-- Content -->
		<div class="content">
			<div class="moduleTitle">
				<h1>NEW TRANSACTION</h1>
			</div>
			<div class="inprofile">
				<h4>Delivery Details</h4>
				<form class="form-horizontal acttion="" >
	            	<div class="form-group">
	            		<label for="Contact" class="col-sm-3 control-label">Contact No.</label>
	            		<div class="col-sm-5">
	            			<input type="number" class="form-control" name="contact" id="contact" min="1" placeholder="Weight" /> <!-- put ${bean.seminarDescription} in the placeholder -->
	            		</div>
	            	</div>
	            	
	            	<div class="form-group">
	            		<label for="Address" class="col-sm-3 control-label">Address</label>
	            		<div class="col-sm-8">
	            			<textarea class="form-control" name="address" id="address" rows=5></textarea> <!-- put ${bean.seminarDescription} in the placeholder -->
	            		</div>
	            	</div>
				
				</form>
				</div>
				
			</div>
		</div>
		<!-- End of Content -->
	</body>
</html>