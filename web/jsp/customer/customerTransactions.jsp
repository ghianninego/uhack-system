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
				<h1>ALL TRANSACTIONS</h1>
			</div>
			<div class="tableContent">
				<div class="table-responsive">
					<table id="myTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
						<thead>
							<tr>
								<th>Trk #</th>
								<th>Medicine</th>
								<th>Qty</th>
								<th>Date Ordered</th>
								<th>Time Ordered</th>
								<th>Total Amount (w/ service charge)</th>
							</tr>
						</thead>
						<%while(records.next()){ %>
						<tbody>
							<tr>
								<td><%=records.getString("transactionID") %></td>
								<td><%=records.getString("MedicineName") %></td>
								<td><%=records.getString("quantity") %></td>
								<td><%=records.getString("dateOrder") %></td>
								<td><%=records.getString("orderTime") %></td>
								<td><%=records.getString("deliveryCharge") %></td>
							</tr>
						</tbody>
						<%}records.first();%>
					</table>
				</div>
			</div>
		</div>
		<!-- End of Content -->
	</body>
</html>