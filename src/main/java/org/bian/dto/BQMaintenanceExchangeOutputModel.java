package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceExchangeOutputModel
 */
public class BQMaintenanceExchangeOutputModel   {
  private String maintenanceExchangeActionTaskReference = null;

  private Object maintenanceExchangeActionTaskRecord = null;

  private String maintenanceExchangeActionResponse = null;

  private String maintenanceInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Maintenance instance exchange service call 
   * @return maintenanceExchangeActionTaskReference
  **/

  public String getMaintenanceExchangeActionTaskReference() {
    return maintenanceExchangeActionTaskReference;
  }

  public void setMaintenanceExchangeActionTaskReference(String maintenanceExchangeActionTaskReference) {
    this.maintenanceExchangeActionTaskReference = maintenanceExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return maintenanceExchangeActionTaskRecord
  **/

  public Object getMaintenanceExchangeActionTaskRecord() {
    return maintenanceExchangeActionTaskRecord;
  }

  public void setMaintenanceExchangeActionTaskRecord(Object maintenanceExchangeActionTaskRecord) {
    this.maintenanceExchangeActionTaskRecord = maintenanceExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return maintenanceExchangeActionResponse
  **/

  public String getMaintenanceExchangeActionResponse() {
    return maintenanceExchangeActionResponse;
  }

  public void setMaintenanceExchangeActionResponse(String maintenanceExchangeActionResponse) {
    this.maintenanceExchangeActionResponse = maintenanceExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Maintenance instance (e.g. accepted, rejected, verified) 
   * @return maintenanceInstanceStatus
  **/

  public String getMaintenanceInstanceStatus() {
    return maintenanceInstanceStatus;
  }

  public void setMaintenanceInstanceStatus(String maintenanceInstanceStatus) {
    this.maintenanceInstanceStatus = maintenanceInstanceStatus;
  }


}

