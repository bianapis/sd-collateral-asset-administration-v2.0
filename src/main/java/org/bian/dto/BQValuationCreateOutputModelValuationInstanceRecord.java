package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQValuationCreateOutputModelValuationInstanceRecord
 */
public class BQValuationCreateOutputModelValuationInstanceRecord   {
  private String collateralAssetValuation = null;

  private String collateralAssetValuationDate = null;


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

