package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQValuationRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord;
import org.bian.dto.BQValuationRetrieveOutputModelValuationInstanceAnalysis;
import org.bian.dto.BQValuationRetrieveOutputModelValuationInstanceRecord;
import org.bian.dto.BQValuationRetrieveOutputModelValuationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQValuationRetrieveOutputModel
 */
public class BQValuationRetrieveOutputModel   {
  private BQValuationRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord = null;

  private BQValuationRetrieveOutputModelValuationInstanceRecord valuationInstanceRecord = null;

  private String valuationRetrieveActionTaskReference = null;

  private Object valuationRetrieveActionTaskRecord = null;

  private String valuationRetrieveActionResponse = null;

  private BQValuationRetrieveOutputModelValuationInstanceReport valuationInstanceReport = null;

  private BQValuationRetrieveOutputModelValuationInstanceAnalysis valuationInstanceAnalysis = null;


  /**
   * Get collateralAssetAdministrativePlanInstanceRecord
   * @return collateralAssetAdministrativePlanInstanceRecord
  **/

  public BQValuationRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord getCollateralAssetAdministrativePlanInstanceRecord() {
    return collateralAssetAdministrativePlanInstanceRecord;
  }

  public void setCollateralAssetAdministrativePlanInstanceRecord(BQValuationRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord) {
    this.collateralAssetAdministrativePlanInstanceRecord = collateralAssetAdministrativePlanInstanceRecord;
  }


  /**
   * Get valuationInstanceRecord
   * @return valuationInstanceRecord
  **/

  public BQValuationRetrieveOutputModelValuationInstanceRecord getValuationInstanceRecord() {
    return valuationInstanceRecord;
  }

  public void setValuationInstanceRecord(BQValuationRetrieveOutputModelValuationInstanceRecord valuationInstanceRecord) {
    this.valuationInstanceRecord = valuationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Valuation instance retrieve service call 
   * @return valuationRetrieveActionTaskReference
  **/

  public String getValuationRetrieveActionTaskReference() {
    return valuationRetrieveActionTaskReference;
  }

  public void setValuationRetrieveActionTaskReference(String valuationRetrieveActionTaskReference) {
    this.valuationRetrieveActionTaskReference = valuationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return valuationRetrieveActionTaskRecord
  **/

  public Object getValuationRetrieveActionTaskRecord() {
    return valuationRetrieveActionTaskRecord;
  }

  public void setValuationRetrieveActionTaskRecord(Object valuationRetrieveActionTaskRecord) {
    this.valuationRetrieveActionTaskRecord = valuationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return valuationRetrieveActionResponse
  **/

  public String getValuationRetrieveActionResponse() {
    return valuationRetrieveActionResponse;
  }

  public void setValuationRetrieveActionResponse(String valuationRetrieveActionResponse) {
    this.valuationRetrieveActionResponse = valuationRetrieveActionResponse;
  }


  /**
   * Get valuationInstanceReport
   * @return valuationInstanceReport
  **/

  public BQValuationRetrieveOutputModelValuationInstanceReport getValuationInstanceReport() {
    return valuationInstanceReport;
  }

  public void setValuationInstanceReport(BQValuationRetrieveOutputModelValuationInstanceReport valuationInstanceReport) {
    this.valuationInstanceReport = valuationInstanceReport;
  }


  /**
   * Get valuationInstanceAnalysis
   * @return valuationInstanceAnalysis
  **/

  public BQValuationRetrieveOutputModelValuationInstanceAnalysis getValuationInstanceAnalysis() {
    return valuationInstanceAnalysis;
  }

  public void setValuationInstanceAnalysis(BQValuationRetrieveOutputModelValuationInstanceAnalysis valuationInstanceAnalysis) {
    this.valuationInstanceAnalysis = valuationInstanceAnalysis;
  }


}

