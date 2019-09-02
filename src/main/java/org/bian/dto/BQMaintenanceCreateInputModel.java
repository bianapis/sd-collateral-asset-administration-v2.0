package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceCreateInputModelCollateralAssetAdministrativePlanInstanceRecord;
import org.bian.dto.BQMaintenanceCreateInputModelMaintenanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceCreateInputModel
 */
public class BQMaintenanceCreateInputModel   {
  private BQMaintenanceCreateInputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord = null;

  private String collateralAssetAdministrativePlanInstanceReference = null;

  private Object maintenanceCreateActionRecord = null;

  private BQMaintenanceCreateInputModelMaintenanceInstanceRecord maintenanceInstanceRecord = null;


  /**
   * Get collateralAssetAdministrativePlanInstanceRecord
   * @return collateralAssetAdministrativePlanInstanceRecord
  **/

  public BQMaintenanceCreateInputModelCollateralAssetAdministrativePlanInstanceRecord getCollateralAssetAdministrativePlanInstanceRecord() {
    return collateralAssetAdministrativePlanInstanceRecord;
  }

  public void setCollateralAssetAdministrativePlanInstanceRecord(BQMaintenanceCreateInputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return maintenanceCreateActionRecord
  **/

  public Object getMaintenanceCreateActionRecord() {
    return maintenanceCreateActionRecord;
  }

  public void setMaintenanceCreateActionRecord(Object maintenanceCreateActionRecord) {
    this.maintenanceCreateActionRecord = maintenanceCreateActionRecord;
  }


  /**
   * Get maintenanceInstanceRecord
   * @return maintenanceInstanceRecord
  **/

  public BQMaintenanceCreateInputModelMaintenanceInstanceRecord getMaintenanceInstanceRecord() {
    return maintenanceInstanceRecord;
  }

  public void setMaintenanceInstanceRecord(BQMaintenanceCreateInputModelMaintenanceInstanceRecord maintenanceInstanceRecord) {
    this.maintenanceInstanceRecord = maintenanceInstanceRecord;
  }


}

