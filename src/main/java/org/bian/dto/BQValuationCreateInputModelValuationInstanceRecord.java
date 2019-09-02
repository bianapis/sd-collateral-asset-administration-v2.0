package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQValuationCreateInputModelValuationInstanceRecord
 */
public class BQValuationCreateInputModelValuationInstanceRecord   {
  private String collateralAssetValuationType = null;

  private String collateralAssetValuationServiceReference = null;

  private String collateralAssetLoantoValueRatio = null;


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


}

