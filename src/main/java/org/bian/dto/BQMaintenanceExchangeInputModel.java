package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceExchangeInputModelMaintenanceExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQMaintenanceExchangeInputModel
 */
public class BQMaintenanceExchangeInputModel   {
  private String collateralAssetAdministrativePlanInstanceReference = null;

  private String maintenanceInstanceReference = null;

  private Object maintenanceExchangeActionTaskRecord = null;

  private BQMaintenanceExchangeInputModelMaintenanceExchangeActionRequest maintenanceExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Collateral Asset Administrative Plan instance 
   * @return collateralAssetAdministrativePlanInstanceReference
  **/

  public String getCollateralAssetAdministrativePlanInstanceReference() {
    return collateralAssetAdministrativePlanInstanceReference;
  }

  public void setCollateralAssetAdministrativePlanInstanceReference(String collateralAssetAdministrativePlanInstanceReference) {
    this.collateralAssetAdministrativePlanInstanceReference = collateralAssetAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Maintenance instance 
   * @return maintenanceInstanceReference
  **/

  public String getMaintenanceInstanceReference() {
    return maintenanceInstanceReference;
  }

  public void setMaintenanceInstanceReference(String maintenanceInstanceReference) {
    this.maintenanceInstanceReference = maintenanceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return maintenanceExchangeActionTaskRecord
  **/

  public Object getMaintenanceExchangeActionTaskRecord() {
    return maintenanceExchangeActionTaskRecord;
  }

  public void setMaintenanceExchangeActionTaskRecord(Object maintenanceExchangeActionTaskRecord) {
    this.maintenanceExchangeActionTaskRecord = maintenanceExchangeActionTaskRecord;
  }


  /**
   * Get maintenanceExchangeActionRequest
   * @return maintenanceExchangeActionRequest
  **/

  public BQMaintenanceExchangeInputModelMaintenanceExchangeActionRequest getMaintenanceExchangeActionRequest() {
    return maintenanceExchangeActionRequest;
  }

  public void setMaintenanceExchangeActionRequest(BQMaintenanceExchangeInputModelMaintenanceExchangeActionRequest maintenanceExchangeActionRequest) {
    this.maintenanceExchangeActionRequest = maintenanceExchangeActionRequest;
  }


}

