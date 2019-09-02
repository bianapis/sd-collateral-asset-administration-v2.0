package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQValuationUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord;
import org.bian.dto.BQValuationUpdateInputModelValuationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQValuationUpdateOutputModel
 */
public class BQValuationUpdateOutputModel   {
  private BQValuationUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord = null;

  private BQValuationUpdateInputModelValuationInstanceRecord valuationInstanceRecord = null;

  private String valuationUpdateActionTaskReference = null;

  private Object valuationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get collateralAssetAdministrativePlanInstanceRecord
   * @return collateralAssetAdministrativePlanInstanceRecord
  **/

  public BQValuationUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord getCollateralAssetAdministrativePlanInstanceRecord() {
    return collateralAssetAdministrativePlanInstanceRecord;
  }

  public void setCollateralAssetAdministrativePlanInstanceRecord(BQValuationUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord) {
    this.collateralAssetAdministrativePlanInstanceRecord = collateralAssetAdministrativePlanInstanceRecord;
  }


  /**
   * Get valuationInstanceRecord
   * @return valuationInstanceRecord
  **/

  public BQValuationUpdateInputModelValuationInstanceRecord getValuationInstanceRecord() {
    return valuationInstanceRecord;
  }

  public void setValuationInstanceRecord(BQValuationUpdateInputModelValuationInstanceRecord valuationInstanceRecord) {
    this.valuationInstanceRecord = valuationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return valuationUpdateActionTaskReference
  **/

  public String getValuationUpdateActionTaskReference() {
    return valuationUpdateActionTaskReference;
  }

  public void setValuationUpdateActionTaskReference(String valuationUpdateActionTaskReference) {
    this.valuationUpdateActionTaskReference = valuationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return valuationUpdateActionTaskRecord
  **/

  public Object getValuationUpdateActionTaskRecord() {
    return valuationUpdateActionTaskRecord;
  }

  public void setValuationUpdateActionTaskRecord(Object valuationUpdateActionTaskRecord) {
    this.valuationUpdateActionTaskRecord = valuationUpdateActionTaskRecord;
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

