/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CollateralAssetAdministrationApiService {

	SDCollateralAssetAdministrationActivateOutputModel activate(SDCollateralAssetAdministrationActivateInputModel request);
	
	SDCollateralAssetAdministrationConfigureOutputModel configure(String sdReferenceId, SDCollateralAssetAdministrationConfigureInputModel request);
	
	CRCollateralAssetAdministrativePlanCreateOutputModel create(String sdReferenceId, CRCollateralAssetAdministrativePlanCreateInputModel request);
	
	BQMaintenanceCreateOutputModel createMaintenance(String sdReferenceId, String crReferenceId, BQMaintenanceCreateInputModel request);
	
	BQValuationCreateOutputModel createValuation(String sdReferenceId, String crReferenceId, BQValuationCreateInputModel request);
	
	BQMaintenanceExchangeOutputModel exchangeMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceExchangeInputModel request);
	
	SDCollateralAssetAdministrationFeedbackOutputModel feedback(String sdReferenceId, SDCollateralAssetAdministrationFeedbackInputModel request);
	
	BQMaintenanceRetrieveOutputModel retrieveMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMaintenanceRequestOutputModel requestMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceRequestInputModel request);
	
	BQValuationRetrieveOutputModel retrieveValuation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQValuationRequestOutputModel requestValuation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQValuationRequestInputModel request);
	
	CRCollateralAssetAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCollateralAssetAdministrationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCollateralAssetAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCollateralAssetAdministrativePlanUpdateInputModel request);
	
	BQMaintenanceUpdateOutputModel updateMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceUpdateInputModel request);
	
	BQValuationUpdateOutputModel updateValuation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQValuationUpdateInputModel request);
	
}
