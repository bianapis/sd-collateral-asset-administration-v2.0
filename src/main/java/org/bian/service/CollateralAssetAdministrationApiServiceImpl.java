/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CollateralAssetAdministrationApiServiceImpl implements CollateralAssetAdministrationApiService {

	public SDCollateralAssetAdministrationActivateOutputModel activate(SDCollateralAssetAdministrationActivateInputModel request){
		return JsonReader.read("activate-SDCollateralAssetAdministrationActivateOutputModel.json",new TypeReference<SDCollateralAssetAdministrationActivateOutputModel>(){});
	}
	
	public SDCollateralAssetAdministrationConfigureOutputModel configure(String sdReferenceId, SDCollateralAssetAdministrationConfigureInputModel request){
		return JsonReader.read("configure-SDCollateralAssetAdministrationConfigureOutputModel.json",new TypeReference<SDCollateralAssetAdministrationConfigureOutputModel>(){});
	}
	
	public CRCollateralAssetAdministrativePlanCreateOutputModel create(String sdReferenceId, CRCollateralAssetAdministrativePlanCreateInputModel request){
		return JsonReader.read("create-CRCollateralAssetAdministrativePlanCreateOutputModel.json",new TypeReference<CRCollateralAssetAdministrativePlanCreateOutputModel>(){});
	}
	
	public BQMaintenanceCreateOutputModel createMaintenance(String sdReferenceId, String crReferenceId, BQMaintenanceCreateInputModel request){
		return JsonReader.read("create-BQMaintenanceCreateOutputModel.json",new TypeReference<BQMaintenanceCreateOutputModel>(){});
	}
	
	public BQValuationCreateOutputModel createValuation(String sdReferenceId, String crReferenceId, BQValuationCreateInputModel request){
		return JsonReader.read("create-BQValuationCreateOutputModel.json",new TypeReference<BQValuationCreateOutputModel>(){});
	}
	
	public BQMaintenanceExchangeOutputModel exchangeMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceExchangeInputModel request){
		return JsonReader.read("exchange-BQMaintenanceExchangeOutputModel.json",new TypeReference<BQMaintenanceExchangeOutputModel>(){});
	}
	
	public SDCollateralAssetAdministrationFeedbackOutputModel feedback(String sdReferenceId, SDCollateralAssetAdministrationFeedbackInputModel request){
		return JsonReader.read("feedback-SDCollateralAssetAdministrationFeedbackOutputModel.json",new TypeReference<SDCollateralAssetAdministrationFeedbackOutputModel>(){});
	}
	
	public BQMaintenanceRetrieveOutputModel retrieveMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMaintenanceRetrieveOutputModel.json",new TypeReference<BQMaintenanceRetrieveOutputModel>(){});
	}
	
	public BQMaintenanceRequestOutputModel requestMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceRequestInputModel request){
		return JsonReader.read("request-BQMaintenanceRequestOutputModel.json",new TypeReference<BQMaintenanceRequestOutputModel>(){});
	}
	
	public BQValuationRetrieveOutputModel retrieveValuation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQValuationRetrieveOutputModel.json",new TypeReference<BQValuationRetrieveOutputModel>(){});
	}
	
	public BQValuationRequestOutputModel requestValuation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQValuationRequestInputModel request){
		return JsonReader.read("request-BQValuationRequestOutputModel.json",new TypeReference<BQValuationRequestOutputModel>(){});
	}
	
	public CRCollateralAssetAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCollateralAssetAdministrativePlanRetrieveOutputModel.json",new TypeReference<CRCollateralAssetAdministrativePlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCollateralAssetAdministrationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCollateralAssetAdministrationRetrieveOutputModel.json",new TypeReference<SDCollateralAssetAdministrationRetrieveOutputModel>(){});
	}
	
	public CRCollateralAssetAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCollateralAssetAdministrativePlanUpdateInputModel request){
		return JsonReader.read("update-CRCollateralAssetAdministrativePlanUpdateOutputModel.json",new TypeReference<CRCollateralAssetAdministrativePlanUpdateOutputModel>(){});
	}
	
	public BQMaintenanceUpdateOutputModel updateMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceUpdateInputModel request){
		return JsonReader.read("update-BQMaintenanceUpdateOutputModel.json",new TypeReference<BQMaintenanceUpdateOutputModel>(){});
	}
	
	public BQValuationUpdateOutputModel updateValuation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQValuationUpdateInputModel request){
		return JsonReader.read("update-BQValuationUpdateOutputModel.json",new TypeReference<BQValuationUpdateOutputModel>(){});
	}
	
}
