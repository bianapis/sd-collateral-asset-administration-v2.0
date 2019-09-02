package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAdministrativePlanRetrieveInputModelCollateralAssetAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRCollateralAssetAdministrativePlanRetrieveInputModelCollateralAssetAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAdministrativePlanRetrieveInputModel
 */
public class CRCollateralAssetAdministrativePlanRetrieveInputModel   {
  private Object collateralAssetAdministrativePlanRetrieveActionTaskRecord = null;

  private String collateralAssetAdministrativePlanRetrieveActionRequest = null;

  private CRCollateralAssetAdministrativePlanRetrieveInputModelCollateralAssetAdministrativePlanInstanceReportRecord collateralAssetAdministrativePlanInstanceReportRecord = null;

  private CRCollateralAssetAdministrativePlanRetrieveInputModelCollateralAssetAdministrativePlanInstanceAnalysis collateralAssetAdministrativePlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return collateralAssetAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getCollateralAssetAdministrativePlanRetrieveActionTaskRecord() {
    return collateralAssetAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setCollateralAssetAdministrativePlanRetrieveActionTaskRecord(Object collateralAssetAdministrativePlanRetrieveActionTaskRecord) {
    this.collateralAssetAdministrativePlanRetrieveActionTaskRecord = collateralAssetAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return collateralAssetAdministrativePlanRetrieveActionRequest
  **/

  public String getCollateralAssetAdministrativePlanRetrieveActionRequest() {
    return collateralAssetAdministrativePlanRetrieveActionRequest;
  }

  public void setCollateralAssetAdministrativePlanRetrieveActionRequest(String collateralAssetAdministrativePlanRetrieveActionRequest) {
    this.collateralAssetAdministrativePlanRetrieveActionRequest = collateralAssetAdministrativePlanRetrieveActionRequest;
  }


  /**
   * Get collateralAssetAdministrativePlanInstanceReportRecord
   * @return collateralAssetAdministrativePlanInstanceReportRecord
  **/

  public CRCollateralAssetAdministrativePlanRetrieveInputModelCollateralAssetAdministrativePlanInstanceReportRecord getCollateralAssetAdministrativePlanInstanceReportRecord() {
    return collateralAssetAdministrativePlanInstanceReportRecord;
  }

  public void setCollateralAssetAdministrativePlanInstanceReportRecord(CRCollateralAssetAdministrativePlanRetrieveInputModelCollateralAssetAdministrativePlanInstanceReportRecord collateralAssetAdministrativePlanInstanceReportRecord) {
    this.collateralAssetAdministrativePlanInstanceReportRecord = collateralAssetAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get collateralAssetAdministrativePlanInstanceAnalysis
   * @return collateralAssetAdministrativePlanInstanceAnalysis
  **/

  public CRCollateralAssetAdministrativePlanRetrieveInputModelCollateralAssetAdministrativePlanInstanceAnalysis getCollateralAssetAdministrativePlanInstanceAnalysis() {
    return collateralAssetAdministrativePlanInstanceAnalysis;
  }

  public void setCollateralAssetAdministrativePlanInstanceAnalysis(CRCollateralAssetAdministrativePlanRetrieveInputModelCollateralAssetAdministrativePlanInstanceAnalysis collateralAssetAdministrativePlanInstanceAnalysis) {
    this.collateralAssetAdministrativePlanInstanceAnalysis = collateralAssetAdministrativePlanInstanceAnalysis;
  }


}

