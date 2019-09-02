package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAdministrativePlanRetrieveInputModelCollateralAssetAdministrativePlanInstanceAnalysis
 */
public class CRCollateralAssetAdministrativePlanRetrieveInputModelCollateralAssetAdministrativePlanInstanceAnalysis   {
  private String collateralAssetAdministrativePlanInstanceAnalysisReference = null;

  private String collateralAssetAdministrativePlanInstanceAnalysisReportType = null;

  private String collateralAssetAdministrativePlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return collateralAssetAdministrativePlanInstanceAnalysisReference
  **/

  public String getCollateralAssetAdministrativePlanInstanceAnalysisReference() {
    return collateralAssetAdministrativePlanInstanceAnalysisReference;
  }

  public void setCollateralAssetAdministrativePlanInstanceAnalysisReference(String collateralAssetAdministrativePlanInstanceAnalysisReference) {
    this.collateralAssetAdministrativePlanInstanceAnalysisReference = collateralAssetAdministrativePlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return collateralAssetAdministrativePlanInstanceAnalysisReportType
  **/

  public String getCollateralAssetAdministrativePlanInstanceAnalysisReportType() {
    return collateralAssetAdministrativePlanInstanceAnalysisReportType;
  }

  public void setCollateralAssetAdministrativePlanInstanceAnalysisReportType(String collateralAssetAdministrativePlanInstanceAnalysisReportType) {
    this.collateralAssetAdministrativePlanInstanceAnalysisReportType = collateralAssetAdministrativePlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return collateralAssetAdministrativePlanInstanceAnalysisParameters
  **/

  public String getCollateralAssetAdministrativePlanInstanceAnalysisParameters() {
    return collateralAssetAdministrativePlanInstanceAnalysisParameters;
  }

  public void setCollateralAssetAdministrativePlanInstanceAnalysisParameters(String collateralAssetAdministrativePlanInstanceAnalysisParameters) {
    this.collateralAssetAdministrativePlanInstanceAnalysisParameters = collateralAssetAdministrativePlanInstanceAnalysisParameters;
  }


}

