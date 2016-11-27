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
		
		<title>Universal Hospital Archive Card - All Transactions</title>
	</head>
	
	<body>
		<!-- Sidebar -->
		<%@include file="../sidebar.jsp" %>
		<!-- End of Sidebar -->
				
		<!-- Content -->
		<div class="content">
			<div class="moduleTitle">
				<h1>LIST OF ALL USERS</h1>
			</div>
			<div class="tableContent">
				<div class="table-responsive">
					<table id="myTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
						<thead>
							<tr>
								<th>ID #</th>
								<th>Name</th>
								<th>Contact #</th>
								<th>Phone #</th>
								<th>Address</th>
								<th>Type</th>
							</tr>
						</thead>
						
						<tbody>
							<tr>
								<td>001</td>
								<td>sdfg</td>
								<td>091777777722</td>
								<td>911</td>
								<td>payatas</td>
								<td>courier</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!-- End of Content -->
	</body>
</html>