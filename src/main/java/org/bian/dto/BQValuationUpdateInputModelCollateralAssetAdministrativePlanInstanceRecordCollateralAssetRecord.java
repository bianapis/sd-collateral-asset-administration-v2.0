package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQValuationUpdateInputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord
 */
public class BQValuationUpdateInputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord   {
  private String collateralAssetValuationSchedule = null;


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


}

