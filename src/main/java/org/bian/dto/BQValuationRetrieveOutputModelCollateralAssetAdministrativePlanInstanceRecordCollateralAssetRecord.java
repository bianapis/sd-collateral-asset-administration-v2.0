package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQValuationRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord
 */
public class BQValuationRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord   {
  private String collateralAssetType = null;

  private String collateralAssetProperties = null;

  private String collateralAssetDescription = null;

  private String collateralAssetTitle = null;

  private String collateralAssetOwnership = null;

  private String collateralAssetInterestedParties = null;

  private String collateralAssetLocation = null;

  private String collateralAssetJurisdiction = null;

  private String collateralAssetDocumentReference = null;

  private String collateralAssetDocumentType = null;

  private String collateralAssetInsuranceReference = null;

  private String collateralAssetPledgedDate = null;

  private String collateralAssetValuationHistory = null;

  private String collateralAssetValuationSchedule = null;

  private String collateralAssetStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of asset (e.g. building, machinery, inventory, financial instrument, art) 
   * @return collateralAssetType
  **/

  public String getCollateralAssetType() {
    return collateralAssetType;
  }

  public void setCollateralAssetType(String collateralAssetType) {
    this.collateralAssetType = collateralAssetType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Key properties of the asset that might influence administration and maintenance (e.g. rarity) 
   * @return collateralAssetProperties
  **/

  public String getCollateralAssetProperties() {
    return collateralAssetProperties;
  }

  public void setCollateralAssetProperties(String collateralAssetProperties) {
    this.collateralAssetProperties = collateralAssetProperties;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of significant details and properties of the asset 
   * @return collateralAssetDescription
  **/

  public String getCollateralAssetDescription() {
    return collateralAssetDescription;
  }

  public void setCollateralAssetDescription(String collateralAssetDescription) {
    this.collateralAssetDescription = collateralAssetDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of title 
   * @return collateralAssetTitle
  **/

  public String getCollateralAssetTitle() {
    return collateralAssetTitle;
  }

  public void setCollateralAssetTitle(String collateralAssetTitle) {
    this.collateralAssetTitle = collateralAssetTitle;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Breakdown of ownership where an asset has multiple owners with different entitlements 
   * @return collateralAssetOwnership
  **/

  public String getCollateralAssetOwnership() {
    return collateralAssetOwnership;
  }

  public void setCollateralAssetOwnership(String collateralAssetOwnership) {
    this.collateralAssetOwnership = collateralAssetOwnership;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Parties with same for of interest (e.g. custodian, insurer, user) 
   * @return collateralAssetInterestedParties
  **/

  public String getCollateralAssetInterestedParties() {
    return collateralAssetInterestedParties;
  }

  public void setCollateralAssetInterestedParties(String collateralAssetInterestedParties) {
    this.collateralAssetInterestedParties = collateralAssetInterestedParties;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The location the asset is stored 
   * @return collateralAssetLocation
  **/

  public String getCollateralAssetLocation() {
    return collateralAssetLocation;
  }

  public void setCollateralAssetLocation(String collateralAssetLocation) {
    this.collateralAssetLocation = collateralAssetLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The jurisdiction that governs title and access to the asset 
   * @return collateralAssetJurisdiction
  **/

  public String getCollateralAssetJurisdiction() {
    return collateralAssetJurisdiction;
  }

  public void setCollateralAssetJurisdiction(String collateralAssetJurisdiction) {
    this.collateralAssetJurisdiction = collateralAssetJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to supporting documentation 
   * @return collateralAssetDocumentReference
  **/

  public String getCollateralAssetDocumentReference() {
    return collateralAssetDocumentReference;
  }

  public void setCollateralAssetDocumentReference(String collateralAssetDocumentReference) {
    this.collateralAssetDocumentReference = collateralAssetDocumentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of document relating to the asset 
   * @return collateralAssetDocumentType
  **/

  public String getCollateralAssetDocumentType() {
    return collateralAssetDocumentType;
  }

  public void setCollateralAssetDocumentType(String collateralAssetDocumentType) {
    this.collateralAssetDocumentType = collateralAssetDocumentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Details of insurance arrangements covering the asset, including duration and renewal 
   * @return collateralAssetInsuranceReference
  **/

  public String getCollateralAssetInsuranceReference() {
    return collateralAssetInsuranceReference;
  }

  public void setCollateralAssetInsuranceReference(String collateralAssetInsuranceReference) {
    this.collateralAssetInsuranceReference = collateralAssetInsuranceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: When the asset was provided as collateral 
   * @return collateralAssetPledgedDate
  **/

  public String getCollateralAssetPledgedDate() {
    return collateralAssetPledgedDate;
  }

  public void setCollateralAssetPledgedDate(String collateralAssetPledgedDate) {
    this.collateralAssetPledgedDate = collateralAssetPledgedDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Historical and current valuation, including loan to value ratios/qualifiers 
   * @return collateralAssetValuationHistory
  **/

  public String getCollateralAssetValuationHistory() {
    return collateralAssetValuationHistory;
  }

  public void setCollateralAssetValuationHistory(String collateralAssetValuationHistory) {
    this.collateralAssetValuationHistory = collateralAssetValuationHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for maintaining an up to date valuation 
   * @return collateralAssetValuationSchedule
  **/

  public String getCollateralAssetValuationSchedule() {
    return collateralAssetValuationSchedule;
  }

  public void setCollateralAssetValuationSchedule(String collateralAssetValuationSchedule) {
    this.collateralAssetValuationSchedule = collateralAssetValuationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A general status indicator for the asset (can cover multiple properties as necessary) 
   * @return collateralAssetStatus
  **/

  public String getCollateralAssetStatus() {
    return collateralAssetStatus;
  }

  public void setCollateralAssetStatus(String collateralAssetStatus) {
    this.collateralAssetStatus = collateralAssetStatus;
  }


}

