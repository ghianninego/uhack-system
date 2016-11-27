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
						<%int x =0;
						while(records.next()){ %>
						<thead>
							<tr>
								<th>Trk #</th>
								<th>Customer</th>
								<th>Status</th>
								<th></th>
							</tr>
						</thead>
						
						<tbody>
							<tr>
								<td><%=records.getInt("transactionID") %></td>
								<td><%=records.getString("firstName") %><%=records.getString("middleName") %><%=records.getString("lastName") %></td>
								<td>Delivered</td>
								<td>
									<button type="button" class="btn btn-link" data-toggle="modal" data-target="#infoModal<%=x %>" data-trxid="LOL">more info</button> | 
									<button type="button" class="btn btn-link" data-toggle="modal" data-target="#statusModal">set status</button>
								
								</td>
							</tr>
						
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!-- End of Content -->
		
		
		<!-- INFO_MODAL -->
		<div class="modal fade" id="infoModal<%=x %>>" tabindex="-1" role="dialog" aria-labelledby="gridSystemModalLabel">
			<div class="modal-dialog modal-md" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						<h4 class="modal-title" id="gridSystemModalLabel">More Information</h4>
					</div>
					
					<div class="modal-body">
		            	<h5>Trk#: <%=records.getString("transactionID") %></h5>
		            	<h5>Customer: <%=records.getString("firstName") %> <%=records.getString("middleName") %> <%=records.getString("lastName") %></h5>
		            	<h5>Medicine: <%=records.getString("medicineName") %></h5>
		            	<h5>Quantity: <%=records.getString("quantity") %></h5>
		            	<h5>Date Ordered: <%=records.getString("quantity") %></h5>
		            	<h5>Time Ordered: <%=records.getString("orderTime") %></h5>
		            	<h5>Type of Service <%if(records.getBoolean("enqueue")){
		            		%>
		            		EXPRESS
		            		<%}else{%>
		            		NOT EXPRESS
			            		<%} %></h5>
		            	
		            	<h5>Total Amount (w/ service charge): <%=records.getString("deliveryCharge") %></h5>
		            	<h5>Courier: </h5>
		            	<h5>Status: </h5>
		            </div>
		            <div class="modal-footer">
		            	<button type="button" class="btn btn-gray pull-left" data-dismiss="modal">Close</button>
		            </div>
		        </div>
			</div>
		</div>
		<!-- INFO_MODAL -->
				<%} records.first();x=0;records.first();%>
		<!-- SET_STATUS_MODAL -->
		<div class="modal fade" id="statusModal" tabindex="-1" role="dialog" aria-labelledby="gridSystemModalLabel">
			<div class="modal-dialog modal-md" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						<h4 class="modal-title" id="gridSystemModalLabel">Has the package been delivered?</h4>
					</div>
				<form class="form-horizontal" action="" method="post">
		            <div class="modal-body">
		            <input type="hidden" name="requestType" value="setStatus"/>
		            
		            	<!-- STATUS -->
		            	<div class="form-group">
		            		<label for="Status" class="col-sm-4 control-label">Status</label>
		            		<div class="col-sm-5">
		            			<select class="form-control" name="status" id="status">
		            				<option value="Delivered">Delivered</option>
		            				<option value="NotDelivered">Not yet delivered</option>
		            			</select>
		            		</div>
		            	</div>
		            	
		            </div>
		            <div class="modal-footer">
						<!-- <text type="hidden" name="seminarID" value="${bean.seminarID}" -->
		            	<button type="submit" class="btn btn-default pull-left">Submit</button>
		            	<button type="button" class="btn btn-gray pull-left" data-dismiss="modal">Cancel</button>
		            </div>
		            <input type="hidden" name="requestType" value="createSeminar" />
		        </div>
				</form>
			</div>
		</div>
		<!-- SET_STATUS_MODAL -->
	</body>
	
	<script type="text/javascript">
		$(".infoModal").on(
			"show.bs.modal",
			function(event) {
				var url = $(event.relatedTarget);
				var trkID = url.data("trkid");
				var status = url.data("status");

				var modal = $(this);
				modal.find = $(this);
				modal.find("#status").val(status);

		})
		
		$(".statusModal").on(
			"show.bs.modal",
			function(event) {
				var url = $(event.relatedTarget);
				var trkID = url.data("trkid");
				var status = url.data("status");

				var modal = $(this);
				modal.find = $(this);
				modal.find("#status").val(status);

		})
	</script>
</html>