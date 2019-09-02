package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQValuationRetrieveInputModelValuationInstanceAnalysis;
import org.bian.dto.BQValuationRetrieveInputModelValuationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQValuationRetrieveInputModel
 */
public class BQValuationRetrieveInputModel   {
  private Object valuationRetrieveActionTaskRecord = null;

  private String valuationRetrieveActionRequest = null;

  private BQValuationRetrieveInputModelValuationInstanceReport valuationInstanceReport = null;

  private BQValuationRetrieveInputModelValuationInstanceAnalysis valuationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return valuationRetrieveActionRequest
  **/

  public String getValuationRetrieveActionRequest() {
    return valuationRetrieveActionRequest;
  }

  public void setValuationRetrieveActionRequest(String valuationRetrieveActionRequest) {
    this.valuationRetrieveActionRequest = valuationRetrieveActionRequest;
  }


  /**
   * Get valuationInstanceReport
   * @return valuationInstanceReport
  **/

  public BQValuationRetrieveInputModelValuationInstanceReport getValuationInstanceReport() {
    return valuationInstanceReport;
  }

  public void setValuationInstanceReport(BQValuationRetrieveInputModelValuationInstanceReport valuationInstanceReport) {
    this.valuationInstanceReport = valuationInstanceReport;
  }


  /**
   * Get valuationInstanceAnalysis
   * @return valuationInstanceAnalysis
  **/

  public BQValuationRetrieveInputModelValuationInstanceAnalysis getValuationInstanceAnalysis() {
    return valuationInstanceAnalysis;
  }

  public void setValuationInstanceAnalysis(BQValuationRetrieveInputModelValuationInstanceAnalysis valuationInstanceAnalysis) {
    this.valuationInstanceAnalysis = valuationInstanceAnalysis;
  }


}

