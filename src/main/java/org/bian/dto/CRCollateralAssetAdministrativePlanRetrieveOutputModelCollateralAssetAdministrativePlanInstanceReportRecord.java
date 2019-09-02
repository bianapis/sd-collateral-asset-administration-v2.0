package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceReportRecord
 */
public class CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceReportRecord   {
  private String collateralAssetAdministrativePlanInstanceReportData = null;

  private String collateralAssetAdministrativePlanInstanceReportType = null;

  private Object collateralAssetAdministrativePlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return collateralAssetAdministrativePlanInstanceReportData
  **/

  public String getCollateralAssetAdministrativePlanInstanceReportData() {
    return collateralAssetAdministrativePlanInstanceReportData;
  }

  public void setCollateralAssetAdministrativePlanInstanceReportData(String collateralAssetAdministrativePlanInstanceReportData) {
    this.collateralAssetAdministrativePlanInstanceReportData = collateralAssetAdministrativePlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return collateralAssetAdministrativePlanInstanceReport
  **/

  public Object getCollateralAssetAdministrativePlanInstanceReport() {
    return collateralAssetAdministrativePlanInstanceReport;
  }

  public void setCollateralAssetAdministrativePlanInstanceReport(Object collateralAssetAdministrativePlanInstanceReport) {
    this.collateralAssetAdministrativePlanInstanceReport = collateralAssetAdministrativePlanInstanceReport;
  }


}

