<!-- UPDATE_PATIENT_MODAL -->
<div class="modal fade" id="updatePatientModal" tabindex="-1" role="dialog" aria-labelledby="gridSystemModalLabel">
	<div class="modal-dialog modal-md" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="gridSystemModalLabel">Update Patient's Statistics</h4>
			</div>
		<form class="form-horizontal" action="" method="post">
            <div class="modal-body">
            
            	<!-- Height -->
            	<div class="form-group">
            		<label for="Height" class="col-sm-3 control-label">Height</label>
            		<div class="col-sm-5">
            			<input type="number" class="form-control" id="height" name="height" min="1" placeholder="Height" /> <!-- put ${bean.seminarName} in the placeholder -->
            		</div>
            	</div>
            	
            	<!-- Weight -->
            	<div class="form-group">
            		<label for="Weight" class="col-sm-3 control-label">Weight</label>
            		<div class="col-sm-5">
            			<input type="number" class="form-control" name="weight" id="weight" min="1" placeholder="Weight" /> <!-- put ${bean.seminarDescription} in the placeholder -->
            		</div>
            	</div>
            	
            	<!-- Allergies -->
            	<div class="form-group">
            		<label for="Allergies" class="col-sm-3 control-label">Allergies</label>
            		<div class="col-sm-8">
            			<textarea class="form-control" name="allergies" id="weight" rows=5></textarea> <!-- put ${bean.seminarDescription} in the placeholder -->
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
<!-- UPDATE_PATIENT_MODAL -->

<!-- VIEWMORE_MODAL -->
<div class="modal fade" id="viewMoreModal" tabindex="-1" role="dialog" aria-labelledby="gridSystemModalLabel">
	<div class="modal-dialog modal-md" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="gridSystemModalLabel">More Details</h4>
			</div>
		<form class="form-horizontal" action="" method="post">
            <div class="modal-body">
            
            	<!-- Diagnosis -->
            	<div class="form-group">
            		<div class="col-sm-10 col-sm-offset-1">
            			<textarea class="form-control" name="diagnosis" id="diagnosis" rows=7></textarea> <!-- put ${bean.seminarDescription} in the placeholder -->
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
<!-- VIEWMORE_MODAL -->

