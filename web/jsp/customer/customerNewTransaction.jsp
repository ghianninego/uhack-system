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
				<h4>Add Medicines</h4>
				<div class="controls">
				<form role="form" autocomplete="off">
                    <div class="entry input-group">
                    	<div class="col-sm-8">
                        	<select class="form-control" name="fields[]">
                        		<option value="">ajdad</option>
                        		<option value="">ajdad</option>
                        		<option value="">ajdad</option>
                        	</select>
                        </div>
                        <div class="col-sm-3">
                        	<input class="form-control col-sm-2" type="number" min="0" name="qty"/>
                        </div>
                    	<span class="input-group-btn">
                            <button class="btn btn-primary btn-add" type="button">
                                <span class="glyphicon glyphicon-plus"></span>
                            </button>
                        </span>
                    </div>
                    <div class="someButton">
                    	<br>
                    	<button type="submit" class="btn btn-default">Submit</button>
                    </div>
                </form>
				</div>
				
			</div>
		</div>
		<!-- End of Content -->
	</body>
</html>