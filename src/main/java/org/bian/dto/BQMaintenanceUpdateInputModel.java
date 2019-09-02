package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord;
import org.bian.dto.BQMaintenanceUpdateInputModelMaintenanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceUpdateInputModel
 */
public class BQMaintenanceUpdateInputModel   {
  private BQMaintenanceUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord = null;

  private String collateralAssetAdministrativePlanInstanceReference = null;

  private String maintenanceInstanceReference = null;

  private BQMaintenanceUpdateInputModelMaintenanceInstanceRecord maintenanceInstanceRecord = null;

  private Object maintenanceUpdateActionTaskRecord = null;

  private String maintenanceUpdateActionRequest = null;


  /**
   * Get collateralAssetAdministrativePlanInstanceRecord
   * @return collateralAssetAdministrativePlanInstanceRecord
  **/

  public BQMaintenanceUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord getCollateralAssetAdministrativePlanInstanceRecord() {
    return collateralAssetAdministrativePlanInstanceRecord;
  }

  public void setCollateralAssetAdministrativePlanInstanceRecord(BQMaintenanceUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord) {
    this.collateralAssetAdministrativePlanInstanceRecord = collateralAssetAdministrativePlanInstanceRecord;
  }


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
   * Get maintenanceInstanceRecord
   * @return maintenanceInstanceRecord
  **/

  public BQMaintenanceUpdateInputModelMaintenanceInstanceRecord getMaintenanceInstanceRecord() {
    return maintenanceInstanceRecord;
  }

  public void setMaintenanceInstanceRecord(BQMaintenanceUpdateInputModelMaintenanceInstanceRecord maintenanceInstanceRecord) {
    this.maintenanceInstanceRecord = maintenanceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return maintenanceUpdateActionTaskRecord
  **/

  public Object getMaintenanceUpdateActionTaskRecord() {
    return maintenanceUpdateActionTaskRecord;
  }

  public void setMaintenanceUpdateActionTaskRecord(Object maintenanceUpdateActionTaskRecord) {
    this.maintenanceUpdateActionTaskRecord = maintenanceUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return maintenanceUpdateActionRequest
  **/

  public String getMaintenanceUpdateActionRequest() {
    return maintenanceUpdateActionRequest;
  }

  public void setMaintenanceUpdateActionRequest(String maintenanceUpdateActionRequest) {
    this.maintenanceUpdateActionRequest = maintenanceUpdateActionRequest;
  }


}

