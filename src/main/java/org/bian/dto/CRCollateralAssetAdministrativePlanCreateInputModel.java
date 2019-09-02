package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAdministrativePlanCreateInputModelCollateralAssetAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAdministrativePlanCreateInputModel
 */
public class CRCollateralAssetAdministrativePlanCreateInputModel   {
  private String collateralAssetAdministrationServicingSessionReference = null;

  private Object collateralAssetAdministrativePlanCreateActionRecord = null;

  private String collateralAssetAdministrativePlanInstanceStatus = null;

  private CRCollateralAssetAdministrativePlanCreateInputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return collateralAssetAdministrationServicingSessionReference
  **/

  public String getCollateralAssetAdministrationServicingSessionReference() {
    return collateralAssetAdministrationServicingSessionReference;
  }

  public void setCollateralAssetAdministrationServicingSessionReference(String collateralAssetAdministrationServicingSessionReference) {
    this.collateralAssetAdministrationServicingSessionReference = collateralAssetAdministrationServicingSessionReference;
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

  public CRCollateralAssetAdministrativePlanCreateInputModelCollateralAssetAdministrativePlanInstanceRecord getCollateralAssetAdministrativePlanInstanceRecord() {
    return collateralAssetAdministrativePlanInstanceRecord;
  }

  public void setCollateralAssetAdministrativePlanInstanceRecord(CRCollateralAssetAdministrativePlanCreateInputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord) {
    this.collateralAssetAdministrativePlanInstanceRecord = collateralAssetAdministrativePlanInstanceRecord;
  }


}

