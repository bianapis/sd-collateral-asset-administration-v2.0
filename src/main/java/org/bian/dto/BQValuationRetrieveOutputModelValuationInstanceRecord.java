package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQValuationRetrieveOutputModelValuationInstanceRecord
 */
public class BQValuationRetrieveOutputModelValuationInstanceRecord   {
  private String collateralAssetValuationType = null;

  private String collateralAssetValuationServiceReference = null;

  private String collateralAssetLoantoValueRatio = null;

  private String collateralAssetValuation = null;

  private String collateralAssetValuationDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of valuation applied (e.g. mark to market, book value, agency) 
   * @return collateralAssetValuationType
  **/

  public String getCollateralAssetValuationType() {
    return collateralAssetValuationType;
  }

  public void setCollateralAssetValuationType(String collateralAssetValuationType) {
    this.collateralAssetValuationType = collateralAssetValuationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to 3rd party valuation service provider (e.g. property, art specialist) 
   * @return collateralAssetValuationServiceReference
  **/

  public String getCollateralAssetValuationServiceReference() {
    return collateralAssetValuationServiceReference;
  }

  public void setCollateralAssetValuationServiceReference(String collateralAssetValuationServiceReference) {
    this.collateralAssetValuationServiceReference = collateralAssetValuationServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The applied loan to value ratio used in determining collateral value 
   * @return collateralAssetLoantoValueRatio
  **/

  public String getCollateralAssetLoantoValueRatio() {
    return collateralAssetLoantoValueRatio;
  }

  public void setCollateralAssetLoantoValueRatio(String collateralAssetLoantoValueRatio) {
    this.collateralAssetLoantoValueRatio = collateralAssetLoantoValueRatio;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of a valuation 
   * @return collateralAssetValuation
  **/

  public String getCollateralAssetValuation() {
    return collateralAssetValuation;
  }

  public void setCollateralAssetValuation(String collateralAssetValuation) {
    this.collateralAssetValuation = collateralAssetValuation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date of a valuation 
   * @return collateralAssetValuationDate
  **/

  public String getCollateralAssetValuationDate() {
    return collateralAssetValuationDate;
  }

  public void setCollateralAssetValuationDate(String collateralAssetValuationDate) {
    this.collateralAssetValuationDate = collateralAssetValuationDate;
  }


}

