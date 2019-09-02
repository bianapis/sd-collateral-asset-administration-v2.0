package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQValuationCreateOutputModelValuationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQValuationRequestOutputModel
 */
public class BQValuationRequestOutputModel   {
  private BQValuationCreateOutputModelValuationInstanceRecord valuationInstanceRecord = null;

  private String valuationRequestActionTaskReference = null;

  private Object valuationRequestActionTaskRecord = null;

  private String valuationRequestRecordReference = null;

  private Object requestResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Valuation instance request service call 
   * @return valuationRequestActionTaskReference
  **/

  public String getValuationRequestActionTaskReference() {
    return valuationRequestActionTaskReference;
  }

  public void setValuationRequestActionTaskReference(String valuationRequestActionTaskReference) {
    this.valuationRequestActionTaskReference = valuationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return valuationRequestActionTaskRecord
  **/

  public Object getValuationRequestActionTaskRecord() {
    return valuationRequestActionTaskRecord;
  }

  public void setValuationRequestActionTaskRecord(Object valuationRequestActionTaskRecord) {
    this.valuationRequestActionTaskRecord = valuationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Valuation service request record 
   * @return valuationRequestRecordReference
  **/

  public String getValuationRequestRecordReference() {
    return valuationRequestRecordReference;
  }

  public void setValuationRequestRecordReference(String valuationRequestRecordReference) {
    this.valuationRequestRecordReference = valuationRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

