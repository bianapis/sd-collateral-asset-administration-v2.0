package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord
 */
public class CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord   {
  private String collateralAssetReference = null;

  private CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord collateralAssetRecord = null;


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

  public CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord getCollateralAssetRecord() {
    return collateralAssetRecord;
  }

  public void setCollateralAssetRecord(CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord collateralAssetRecord) {
    this.collateralAssetRecord = collateralAssetRecord;
  }


}

