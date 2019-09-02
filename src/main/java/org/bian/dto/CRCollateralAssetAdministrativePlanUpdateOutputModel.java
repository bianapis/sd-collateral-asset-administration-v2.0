package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAdministrativePlanUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAdministrativePlanUpdateOutputModel
 */
public class CRCollateralAssetAdministrativePlanUpdateOutputModel   {
  private CRCollateralAssetAdministrativePlanUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord = null;

  private String collateralAssetAdministrativePlanUpdateActionTaskReference = null;

  private Object collateralAssetAdministrativePlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return collateralAssetAdministrativePlanUpdateActionTaskReference
  **/

  public String getCollateralAssetAdministrativePlanUpdateActionTaskReference() {
    return collateralAssetAdministrativePlanUpdateActionTaskReference;
  }

  public void setCollateralAssetAdministrativePlanUpdateActionTaskReference(String collateralAssetAdministrativePlanUpdateActionTaskReference) {
    this.collateralAssetAdministrativePlanUpdateActionTaskReference = collateralAssetAdministrativePlanUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

