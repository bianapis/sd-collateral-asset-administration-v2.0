/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Administer;

@BianRestController
public class CollateralAssetAdministrationApiController {

	@Autowired
	CollateralAssetAdministrationApiService service;
	
	@Administer.Activate
	public BianResponse<SDCollateralAssetAdministrationActivateOutputModel> activate(@RequestBody BianRequest<SDCollateralAssetAdministrationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Administer.Configure
	public BianResponse<SDCollateralAssetAdministrationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCollateralAssetAdministrationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Administer.Create
	public BianResponse<CRCollateralAssetAdministrativePlanCreateOutputModel> create(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCollateralAssetAdministrativePlanCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.create(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenance")
	@Administer.Create
	public BianResponse<BQMaintenanceCreateOutputModel> createMaintenance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQMaintenanceCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createMaintenance(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("valuation")
	@Administer.Create
	public BianResponse<BQValuationCreateOutputModel> createValuation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQValuationCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createValuation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenance")
	@Administer.Exchange
	public BianResponse<BQMaintenanceExchangeOutputModel> exchangeMaintenance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMaintenanceExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeMaintenance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Feedback
	public BianResponse<SDCollateralAssetAdministrationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCollateralAssetAdministrationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenance")
	@Administer.Retrieve
	public BianResponse<BQMaintenanceRetrieveOutputModel> retrieveMaintenance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMaintenance(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("maintenance")
	@Administer.Request
	public BianResponse<BQMaintenanceRequestOutputModel> requestMaintenance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMaintenanceRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestMaintenance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("valuation")
	@Administer.Retrieve
	public BianResponse<BQValuationRetrieveOutputModel> retrieveValuation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveValuation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("valuation")
	@Administer.Request
	public BianResponse<BQValuationRequestOutputModel> requestValuation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQValuationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestValuation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Retrieve
	public BianResponse<CRCollateralAssetAdministrativePlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Administer.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Administer.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Administer.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Administer.RetrieveSD
	public BianResponse<SDCollateralAssetAdministrationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Administer.Update
	public BianResponse<CRCollateralAssetAdministrativePlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCollateralAssetAdministrativePlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenance")
	@Administer.Update
	public BianResponse<BQMaintenanceUpdateOutputModel> updateMaintenance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMaintenanceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateMaintenance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("valuation")
	@Administer.Update
	public BianResponse<BQValuationUpdateOutputModel> updateValuation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQValuationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateValuation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
