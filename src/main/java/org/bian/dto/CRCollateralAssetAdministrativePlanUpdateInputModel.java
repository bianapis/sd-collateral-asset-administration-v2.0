package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAdministrativePlanUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAdministrativePlanUpdateInputModel
 */
public class CRCollateralAssetAdministrativePlanUpdateInputModel   {
  private String collateralAssetAdministrationServicingSessionReference = null;

  private String collateralAssetAdministrativePlanInstanceReference = null;

  private CRCollateralAssetAdministrativePlanUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord = null;

  private Object collateralAssetAdministrativePlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get collateralAssetAdministrativePlanInstanceRecord
   * @return collateralAssetAdministrativePlanInstanceRecord
  **/

  public CRCollateralAssetAdministrativePlanUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord getCollateralAssetAdministrativePlanInstanceRecord() {
    return collateralAssetAdministrativePlanInstanceRecord;
  }

  public void setCollateralAssetAdministrativePlanInstanceRecord(CRCollateralAssetAdministrativePlanUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord) {
    this.collateralAssetAdministrativePlanInstanceRecord = collateralAssetAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return collateralAssetAdministrativePlanUpdateActionTaskRecord
  **/

  public Object getCollateralAssetAdministrativePlanUpdateActionTaskRecord() {
    return collateralAssetAdministrativePlanUpdateActionTaskRecord;
  }

  public void setCollateralAssetAdministrativePlanUpdateActionTaskRecord(Object collateralAssetAdministrativePlanUpdateActionTaskRecord) {
    this.collateralAssetAdministrativePlanUpdateActionTaskRecord = collateralAssetAdministrativePlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

