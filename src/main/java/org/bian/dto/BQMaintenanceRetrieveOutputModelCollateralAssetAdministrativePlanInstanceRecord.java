package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord
 */
public class BQMaintenanceRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord   {
  private String collateralAssetReference = null;

  private BQMaintenanceRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord collateralAssetRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the collateral asset item 
   * @return collateralAssetReference
  **/

  public String getCollateralAssetReference() {
    return collateralAssetReference;
  }

  public void setCollateralAssetReference(String collateralAssetReference) {
    this.collateralAssetReference = collateralAssetReference;
  }


  /**
   * Get collateralAssetRecord
   * @return collateralAssetRecord
  **/

  public BQMaintenanceRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord getCollateralAssetRecord() {
    return collateralAssetRecord;
  }

  public void setCollateralAssetRecord(BQMaintenanceRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord collateralAssetRecord) {
    this.collateralAssetRecord = collateralAssetRecord;
  }


}

