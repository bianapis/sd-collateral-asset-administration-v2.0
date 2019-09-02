package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceCreateOutputModelMaintenanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceCreateOutputModel
 */
public class BQMaintenanceCreateOutputModel   {
  private String maintenanceInstanceReference = null;

  private String maintenanceCreateActionReference = null;

  private Object maintenanceCreateActionRecord = null;

  private String maintenanceInstanceStatus = null;

  private BQMaintenanceCreateOutputModelMaintenanceInstanceRecord maintenanceInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Maintenance instance 
   * @return maintenanceInstanceReference
  **/

  public String getMaintenanceInstanceReference() {
    return maintenanceInstanceReference;
  }

  public void setMaintenanceInstanceReference(String maintenanceInstanceReference) {
    this.maintenanceInstanceReference = maintenanceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return maintenanceCreateActionReference
  **/

  public String getMaintenanceCreateActionReference() {
    return maintenanceCreateActionReference;
  }

  public void setMaintenanceCreateActionReference(String maintenanceCreateActionReference) {
    this.maintenanceCreateActionReference = maintenanceCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return maintenanceCreateActionRecord
  **/

  public Object getMaintenanceCreateActionRecord() {
    return maintenanceCreateActionRecord;
  }

  public void setMaintenanceCreateActionRecord(Object maintenanceCreateActionRecord) {
    this.maintenanceCreateActionRecord = maintenanceCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Maintenance instance (e.g. initialised, pending, active) 
   * @return maintenanceInstanceStatus
  **/

  public String getMaintenanceInstanceStatus() {
    return maintenanceInstanceStatus;
  }

  public void setMaintenanceInstanceStatus(String maintenanceInstanceStatus) {
    this.maintenanceInstanceStatus = maintenanceInstanceStatus;
  }


  /**
   * Get maintenanceInstanceRecord
   * @return maintenanceInstanceRecord
  **/

  public BQMaintenanceCreateOutputModelMaintenanceInstanceRecord getMaintenanceInstanceRecord() {
    return maintenanceInstanceRecord;
  }

  public void setMaintenanceInstanceRecord(BQMaintenanceCreateOutputModelMaintenanceInstanceRecord maintenanceInstanceRecord) {
    this.maintenanceInstanceRecord = maintenanceInstanceRecord;
  }


}

