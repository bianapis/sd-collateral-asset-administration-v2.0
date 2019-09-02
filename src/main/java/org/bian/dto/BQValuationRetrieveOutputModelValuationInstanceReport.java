package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQValuationRetrieveOutputModelValuationInstanceReport
 */
public class BQValuationRetrieveOutputModelValuationInstanceReport   {
  private Object valuationInstanceReportRecord = null;

  private String valuationInstanceReportType = null;

  private String valuationInstanceReportParameters = null;

  private Object valuationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return valuationInstanceReportRecord
  **/

  public Object getValuationInstanceReportRecord() {
    return valuationInstanceReportRecord;
  }

  public void setValuationInstanceReportRecord(Object valuationInstanceReportRecord) {
    this.valuationInstanceReportRecord = valuationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return valuationInstanceReportType
  **/

  public String getValuationInstanceReportType() {
    return valuationInstanceReportType;
  }

  public void setValuationInstanceReportType(String valuationInstanceReportType) {
    this.valuationInstanceReportType = valuationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return valuationInstanceReportParameters
  **/

  public String getValuationInstanceReportParameters() {
    return valuationInstanceReportParameters;
  }

  public void setValuationInstanceReportParameters(String valuationInstanceReportParameters) {
    this.valuationInstanceReportParameters = valuationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return valuationInstanceReport
  **/

  public Object getValuationInstanceReport() {
    return valuationInstanceReport;
  }

  public void setValuationInstanceReport(Object valuationInstanceReport) {
    this.valuationInstanceReport = valuationInstanceReport;
  }


}

