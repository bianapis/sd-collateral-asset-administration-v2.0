package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQValuationUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord;
import org.bian.dto.BQValuationUpdateInputModelValuationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQValuationUpdateInputModel
 */
public class BQValuationUpdateInputModel   {
  private BQValuationUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord = null;

  private String collateralAssetAdministrativePlanInstanceReference = null;

  private String valuationInstanceReference = null;

  private BQValuationUpdateInputModelValuationInstanceRecord valuationInstanceRecord = null;

  private Object valuationUpdateActionTaskRecord = null;

  private String valuationUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Collateral Asset Administrative Plan instance 
   * @return collateralAssetAdministrativePlanInstanceReference
  **/

  public String getCollateralAssetAdministrativePlanInstanceReference() {
    return collateralAssetAdministrativePlanInstanceReference;
  }

  public void setCollateralAssetAdministrativePlanInstanceReference(String collateralAssetAdministrativePlanInstanceReference) {
    this.collateralAssetAdministrativePlanInstanceReference = collateralAssetAdministrativePlanInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return valuationUpdateActionRequest
  **/

  public String getValuationUpdateActionRequest() {
    return valuationUpdateActionRequest;
  }

  public void setValuationUpdateActionRequest(String valuationUpdateActionRequest) {
    this.valuationUpdateActionRequest = valuationUpdateActionRequest;
  }


}

