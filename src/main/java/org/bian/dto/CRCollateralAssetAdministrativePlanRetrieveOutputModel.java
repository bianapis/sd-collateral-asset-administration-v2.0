package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord;
import org.bian.dto.CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAdministrativePlanRetrieveOutputModel
 */
public class CRCollateralAssetAdministrativePlanRetrieveOutputModel   {
  private CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord = null;

  private String collateralAssetAdministrativePlanRetrieveActionTaskReference = null;

  private Object collateralAssetAdministrativePlanRetrieveActionTaskRecord = null;

  private String collateralAssetAdministrativePlanRetrieveActionResponse = null;

  private CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceReportRecord collateralAssetAdministrativePlanInstanceReportRecord = null;

  private CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceAnalysis collateralAssetAdministrativePlanInstanceAnalysis = null;


  /**
   * Get collateralAssetAdministrativePlanInstanceRecord
   * @return collateralAssetAdministrativePlanInstanceRecord
  **/

  public CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord getCollateralAssetAdministrativePlanInstanceRecord() {
    return collateralAssetAdministrativePlanInstanceRecord;
  }

  public void setCollateralAssetAdministrativePlanInstanceRecord(CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord) {
    this.collateralAssetAdministrativePlanInstanceRecord = collateralAssetAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Collateral Asset Administrative Plan instance retrieve service call 
   * @return collateralAssetAdministrativePlanRetrieveActionTaskReference
  **/

  public String getCollateralAssetAdministrativePlanRetrieveActionTaskReference() {
    return collateralAssetAdministrativePlanRetrieveActionTaskReference;
  }

  public void setCollateralAssetAdministrativePlanRetrieveActionTaskReference(String collateralAssetAdministrativePlanRetrieveActionTaskReference) {
    this.collateralAssetAdministrativePlanRetrieveActionTaskReference = collateralAssetAdministrativePlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return collateralAssetAdministrativePlanRetrieveActionResponse
  **/

  public String getCollateralAssetAdministrativePlanRetrieveActionResponse() {
    return collateralAssetAdministrativePlanRetrieveActionResponse;
  }

  public void setCollateralAssetAdministrativePlanRetrieveActionResponse(String collateralAssetAdministrativePlanRetrieveActionResponse) {
    this.collateralAssetAdministrativePlanRetrieveActionResponse = collateralAssetAdministrativePlanRetrieveActionResponse;
  }


  /**
   * Get collateralAssetAdministrativePlanInstanceReportRecord
   * @return collateralAssetAdministrativePlanInstanceReportRecord
  **/

  public CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceReportRecord getCollateralAssetAdministrativePlanInstanceReportRecord() {
    return collateralAssetAdministrativePlanInstanceReportRecord;
  }

  public void setCollateralAssetAdministrativePlanInstanceReportRecord(CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceReportRecord collateralAssetAdministrativePlanInstanceReportRecord) {
    this.collateralAssetAdministrativePlanInstanceReportRecord = collateralAssetAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get collateralAssetAdministrativePlanInstanceAnalysis
   * @return collateralAssetAdministrativePlanInstanceAnalysis
  **/

  public CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceAnalysis getCollateralAssetAdministrativePlanInstanceAnalysis() {
    return collateralAssetAdministrativePlanInstanceAnalysis;
  }

  public void setCollateralAssetAdministrativePlanInstanceAnalysis(CRCollateralAssetAdministrativePlanRetrieveOutputModelCollateralAssetAdministrativePlanInstanceAnalysis collateralAssetAdministrativePlanInstanceAnalysis) {
    this.collateralAssetAdministrativePlanInstanceAnalysis = collateralAssetAdministrativePlanInstanceAnalysis;
  }


}

