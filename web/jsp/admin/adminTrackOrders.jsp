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
		
		<title>Universal Hospital Archive Card - Track Orders</title>
	</head>
	
	<body>
		<!-- Sidebar -->
		<%@include file="../sidebar.jsp" %>
		<!-- End of Sidebar -->
				
		<!-- Content -->
		<div class="content">
			<div class="moduleTitle">
				<h1>TRACK CURRENT ORDERS</h1>
			</div>
			<div class="tableContent">
				<div class="table-responsive">
					<table id="myTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
						<thead>
							<tr>
								<th>Trk #</th>
								<th>Customer</th>
								<th>Address</th>
								<th></th>
							</tr>
						</thead>
						
						<tbody>
							<tr>
								<td>001</td>
								<td>Gggggg</td>
								<td>xzcxzxczcxz</td>
								<td>
									<button type="button" class="btn btn-link" data-toggle="modal" data-target="#assignModal">assign courier</button> | 
									<button type="button" class="btn btn-link" data-toggle="modal" data-target="#cancelModal">cancel order</button>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!-- End of Content -->
	</body>
	
	<!-- ASSIGN_MODAL -->
		<div class="modal fade" id="assignModal" tabindex="-1" role="dialog" aria-labelledby="gridSystemModalLabel">
			<div class="modal-dialog modal-md" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						<h4 class="modal-title" id="gridSystemModalLabel">Assign A Courier</h4>
					</div>
				<form class="form-horizontal" action="" method="post">
            		<div class="modal-body">
            
            			<!-- Name -->
            			<div class="form-group">
            				<label for="Name" class="col-sm-3 control-label">Courier Name</label>
            				<div class="col-sm-5">
            					<select class="form-control" id="assign" name="assign">
            						<option value="1">wapakels</option>
            					</select>
            				</div>
            			</div>
            		</div>
            		<div class="modal-footer">
						<!-- <text type="hidden" name="seminarID" value="${bean.seminarID}" -->
            			<button type="submit" class="btn btn-default pull-left">Submit</button>
            			<button type="button" class="btn btn-gray pull-left" data-dismiss="modal">Cancel</button>
            		</div>
        		</div>
				</form>
			</div>
		</div>
		<!-- ASSIGN_MODAL -->
		
		<!-- CANCEL_MODAL -->
		<div class="modal fade" id="cancelModal" tabindex="-1" role="dialog" aria-labelledby="gridSystemModalLabel">
			<div class="modal-dialog modal-md" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						<h4 class="modal-title" id="gridSystemModalLabel">Are you sure you want to cancel this user's order?</h4>
					</div>
				<form class="form-horizontal" action="" method="post">
		            <div class="modal-body">
		            		<button type="submit" class="btn btn-default pull-left">Yes</button>
		            		<button type="button" class="btn btn-gray pull-left" data-dismiss="modal">Cancel</button>
		            	<br><br>
		            </div>
		        </div>
				</form>
			</div>
		</div>
		<!-- CANCEL_MODAL -->
</html>