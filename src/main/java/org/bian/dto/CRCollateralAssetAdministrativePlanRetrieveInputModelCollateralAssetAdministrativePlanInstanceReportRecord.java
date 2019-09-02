package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAdministrativePlanRetrieveInputModelCollateralAssetAdministrativePlanInstanceReportRecord
 */
public class CRCollateralAssetAdministrativePlanRetrieveInputModelCollateralAssetAdministrativePlanInstanceReportRecord   {
  private String collateralAssetAdministrativePlanInstanceReportReference = null;

  private String collateralAssetAdministrativePlanInstanceReportType = null;

  private String collateralAssetAdministrativePlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return collateralAssetAdministrativePlanInstanceReportReference
  **/

  public String getCollateralAssetAdministrativePlanInstanceReportReference() {
    return collateralAssetAdministrativePlanInstanceReportReference;
  }

  public void setCollateralAssetAdministrativePlanInstanceReportReference(String collateralAssetAdministrativePlanInstanceReportReference) {
    this.collateralAssetAdministrativePlanInstanceReportReference = collateralAssetAdministrativePlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return collateralAssetAdministrativePlanInstanceReportType
  **/

  public String getCollateralAssetAdministrativePlanInstanceReportType() {
    return collateralAssetAdministrativePlanInstanceReportType;
  }

  public void setCollateralAssetAdministrativePlanInstanceReportType(String collateralAssetAdministrativePlanInstanceReportType) {
    this.collateralAssetAdministrativePlanInstanceReportType = collateralAssetAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return collateralAssetAdministrativePlanInstanceReportParameters
  **/

  public String getCollateralAssetAdministrativePlanInstanceReportParameters() {
    return collateralAssetAdministrativePlanInstanceReportParameters;
  }

  public void setCollateralAssetAdministrativePlanInstanceReportParameters(String collateralAssetAdministrativePlanInstanceReportParameters) {
    this.collateralAssetAdministrativePlanInstanceReportParameters = collateralAssetAdministrativePlanInstanceReportParameters;
  }


}

