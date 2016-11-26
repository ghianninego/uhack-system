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
				<form>
					<div class="form-group">
						<label class="control-label" for="medicine">Medicine</label>
					</div>
					<div class="form-group">
						<div class="col-sm-10">
							<select class="form-control" id="medicine" name="medicine">
								<option value="">Biogesic</option>
								<option value="">Ceelin</option>
								<option value="">Neozep</option>
							</select>
						</div>
						<div class="col-sm-2">
							<input type="number" class="form-control" id="qty" name="qty" placeholder="Qty" min=0/>
						</div>
					</div>
					<br>
					<div class="form-group">
						<br>
						<button type="submit" class="btn btn-default">Submit</button>
					</div>
				</form>
			</div>
		</div>
		<!-- End of Content -->
	</body>
</html>