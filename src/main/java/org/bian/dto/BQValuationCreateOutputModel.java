package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQValuationCreateOutputModelValuationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQValuationCreateOutputModel
 */
public class BQValuationCreateOutputModel   {
  private String valuationInstanceReference = null;

  private String valuationCreateActionReference = null;

  private Object valuationCreateActionRecord = null;

  private String valuationInstanceStatus = null;

  private BQValuationCreateOutputModelValuationInstanceRecord valuationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Valuation instance 
   * @return valuationInstanceReference
  **/

  public String getValuationInstanceReference() {
    return valuationInstanceReference;
  }

  public void setValuationInstanceReference(String valuationInstanceReference) {
    this.valuationInstanceReference = valuationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return valuationCreateActionReference
  **/

  public String getValuationCreateActionReference() {
    return valuationCreateActionReference;
  }

  public void setValuationCreateActionReference(String valuationCreateActionReference) {
    this.valuationCreateActionReference = valuationCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return valuationCreateActionRecord
  **/

  public Object getValuationCreateActionRecord() {
    return valuationCreateActionRecord;
  }

  public void setValuationCreateActionRecord(Object valuationCreateActionRecord) {
    this.valuationCreateActionRecord = valuationCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Valuation instance (e.g. initialised, pending, active) 
   * @return valuationInstanceStatus
  **/

  public String getValuationInstanceStatus() {
    return valuationInstanceStatus;
  }

  public void setValuationInstanceStatus(String valuationInstanceStatus) {
    this.valuationInstanceStatus = valuationInstanceStatus;
  }


  /**
   * Get valuationInstanceRecord
   * @return valuationInstanceRecord
  **/

  public BQValuationCreateOutputModelValuationInstanceRecord getValuationInstanceRecord() {
    return valuationInstanceRecord;
  }

  public void setValuationInstanceRecord(BQValuationCreateOutputModelValuationInstanceRecord valuationInstanceRecord) {
    this.valuationInstanceRecord = valuationInstanceRecord;
  }


}

