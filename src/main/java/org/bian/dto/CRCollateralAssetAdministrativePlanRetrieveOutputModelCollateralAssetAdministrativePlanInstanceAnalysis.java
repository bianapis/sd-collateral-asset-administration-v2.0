package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceAnalysis
 */
public class CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceAnalysis   {
  private String collateralAssetAdministrativePlanInstanceAnalysisData = null;

  private String collateralAssetAdministrativePlanInstanceAnalysisReportType = null;

  private Object collateralAssetAdministrativePlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return collateralAssetAdministrativePlanInstanceAnalysisData
  **/

  public String getCollateralAssetAdministrativePlanInstanceAnalysisData() {
    return collateralAssetAdministrativePlanInstanceAnalysisData;
  }

  public void setCollateralAssetAdministrativePlanInstanceAnalysisData(String collateralAssetAdministrativePlanInstanceAnalysisData) {
    this.collateralAssetAdministrativePlanInstanceAnalysisData = collateralAssetAdministrativePlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return collateralAssetAdministrativePlanInstanceAnalysisReport
  **/

  public Object getCollateralAssetAdministrativePlanInstanceAnalysisReport() {
    return collateralAssetAdministrativePlanInstanceAnalysisReport;
  }

  public void setCollateralAssetAdministrativePlanInstanceAnalysisReport(Object collateralAssetAdministrativePlanInstanceAnalysisReport) {
    this.collateralAssetAdministrativePlanInstanceAnalysisReport = collateralAssetAdministrativePlanInstanceAnalysisReport;
  }


}

