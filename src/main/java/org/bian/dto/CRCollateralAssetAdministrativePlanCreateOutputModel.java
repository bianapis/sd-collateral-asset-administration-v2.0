package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAdministrativePlanCreateOutputModelCollateralAssetAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAdministrativePlanCreateOutputModel
 */
public class CRCollateralAssetAdministrativePlanCreateOutputModel   {
  private String collateralAssetAdministrativePlanInstanceReference = null;

  private String collateralAssetAdministrativePlanCreateActionReference = null;

  private Object collateralAssetAdministrativePlanCreateActionRecord = null;

  private String collateralAssetAdministrativePlanInstanceStatus = null;

  private CRCollateralAssetAdministrativePlanCreateOutputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Collateral Asset Administrative Plan instance 
   * @return collateralAssetAdministrativePlanInstanceReference
  **/

  public String getCollateralAssetAdministrativePlanInstanceReference() {
    return collateralAssetAdministrativePlanInstanceReference;
  }

  public void setCollateralAssetAdministrativePlanInstanceReference(String collateralAssetAdministrativePlanInstanceReference) {
    this.collateralAssetAdministrativePlanInstanceReference = collateralAssetAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return collateralAssetAdministrativePlanCreateActionReference
  **/

  public String getCollateralAssetAdministrativePlanCreateActionReference() {
    return collateralAssetAdministrativePlanCreateActionReference;
  }

  public void setCollateralAssetAdministrativePlanCreateActionReference(String collateralAssetAdministrativePlanCreateActionReference) {
    this.collateralAssetAdministrativePlanCreateActionReference = collateralAssetAdministrativePlanCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return collateralAssetAdministrativePlanCreateActionRecord
  **/

  public Object getCollateralAssetAdministrativePlanCreateActionRecord() {
    return collateralAssetAdministrativePlanCreateActionRecord;
  }

  public void setCollateralAssetAdministrativePlanCreateActionRecord(Object collateralAssetAdministrativePlanCreateActionRecord) {
    this.collateralAssetAdministrativePlanCreateActionRecord = collateralAssetAdministrativePlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Collateral Asset Administrative Plan instance (e.g. initialised, pending, active) 
   * @return collateralAssetAdministrativePlanInstanceStatus
  **/

  public String getCollateralAssetAdministrativePlanInstanceStatus() {
    return collateralAssetAdministrativePlanInstanceStatus;
  }

  public void setCollateralAssetAdministrativePlanInstanceStatus(String collateralAssetAdministrativePlanInstanceStatus) {
    this.collateralAssetAdministrativePlanInstanceStatus = collateralAssetAdministrativePlanInstanceStatus;
  }


  /**
   * Get collateralAssetAdministrativePlanInstanceRecord
   * @return collateralAssetAdministrativePlanInstanceRecord
  **/

  public CRCollateralAssetAdministrativePlanCreateOutputModelCollateralAssetAdministrativePlanInstanceRecord getCollateralAssetAdministrativePlanInstanceRecord() {
    return collateralAssetAdministrativePlanInstanceRecord;
  }

  public void setCollateralAssetAdministrativePlanInstanceRecord(CRCollateralAssetAdministrativePlanCreateOutputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord) {
    this.collateralAssetAdministrativePlanInstanceRecord = collateralAssetAdministrativePlanInstanceRecord;
  }


}

