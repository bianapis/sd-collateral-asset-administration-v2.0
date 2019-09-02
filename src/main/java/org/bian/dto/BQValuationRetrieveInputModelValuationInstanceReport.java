package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQValuationRetrieveInputModelValuationInstanceReport
 */
public class BQValuationRetrieveInputModelValuationInstanceReport   {
  private String valuationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return valuationInstanceReportReference
  **/

  public String getValuationInstanceReportReference() {
    return valuationInstanceReportReference;
  }

  public void setValuationInstanceReportReference(String valuationInstanceReportReference) {
    this.valuationInstanceReportReference = valuationInstanceReportReference;
  }


}

