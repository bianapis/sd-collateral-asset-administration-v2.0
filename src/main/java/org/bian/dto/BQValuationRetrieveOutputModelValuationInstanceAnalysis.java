package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQValuationRetrieveOutputModelValuationInstanceAnalysis
 */
public class BQValuationRetrieveOutputModelValuationInstanceAnalysis   {
  private Object valuationInstanceAnalysisRecord = null;

  private String valuationInstanceAnalysisReportType = null;

  private String valuationInstanceAnalysisParameters = null;

  private Object valuationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return valuationInstanceAnalysisRecord
  **/

  public Object getValuationInstanceAnalysisRecord() {
    return valuationInstanceAnalysisRecord;
  }

  public void setValuationInstanceAnalysisRecord(Object valuationInstanceAnalysisRecord) {
    this.valuationInstanceAnalysisRecord = valuationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return valuationInstanceAnalysisReportType
  **/

  public String getValuationInstanceAnalysisReportType() {
    return valuationInstanceAnalysisReportType;
  }

  public void setValuationInstanceAnalysisReportType(String valuationInstanceAnalysisReportType) {
    this.valuationInstanceAnalysisReportType = valuationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return valuationInstanceAnalysisParameters
  **/

  public String getValuationInstanceAnalysisParameters() {
    return valuationInstanceAnalysisParameters;
  }

  public void setValuationInstanceAnalysisParameters(String valuationInstanceAnalysisParameters) {
    this.valuationInstanceAnalysisParameters = valuationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return valuationInstanceAnalysisReport
  **/

  public Object getValuationInstanceAnalysisReport() {
    return valuationInstanceAnalysisReport;
  }

  public void setValuationInstanceAnalysisReport(Object valuationInstanceAnalysisReport) {
    this.valuationInstanceAnalysisReport = valuationInstanceAnalysisReport;
  }


}

