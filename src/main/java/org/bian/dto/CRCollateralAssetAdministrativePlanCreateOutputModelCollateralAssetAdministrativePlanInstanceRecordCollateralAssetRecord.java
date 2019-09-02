package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAdministrativePlanCreateOutputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord
 */
public class CRCollateralAssetAdministrativePlanCreateOutputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord   {
  private String collateralAssetDocumentReference = null;

  private String collateralAssetValuationHistory = null;

  private String collateralAssetStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to supporting documentation 
   * @return collateralAssetDocumentReference
  **/

  public String getCollateralAssetDocumentReference() {
    return collateralAssetDocumentReference;
  }

  public void setCollateralAssetDocumentReference(String collateralAssetDocumentReference) {
    this.collateralAssetDocumentReference = collateralAssetDocumentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Historical and current valuation, including loan to value ratios/qualifiers 
   * @return collateralAssetValuationHistory
  **/

  public String getCollateralAssetValuationHistory() {
    return collateralAssetValuationHistory;
  }

  public void setCollateralAssetValuationHistory(String collateralAssetValuationHistory) {
    this.collateralAssetValuationHistory = collateralAssetValuationHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A general status indicator for the asset (can cover multiple properties as necessary) 
   * @return collateralAssetStatus
  **/

  public String getCollateralAssetStatus() {
    return collateralAssetStatus;
  }

  public void setCollateralAssetStatus(String collateralAssetStatus) {
    this.collateralAssetStatus = collateralAssetStatus;
  }


}

