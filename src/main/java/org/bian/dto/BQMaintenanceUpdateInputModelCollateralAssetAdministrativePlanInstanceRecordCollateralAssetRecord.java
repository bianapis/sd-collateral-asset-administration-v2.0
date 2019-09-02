package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceUpdateInputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord
 */
public class BQMaintenanceUpdateInputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord   {
  private String collateralAssetMaintenanceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule planned and actual for undertaking asset maintenance checks) 
   * @return collateralAssetMaintenanceSchedule
  **/

  public String getCollateralAssetMaintenanceSchedule() {
    return collateralAssetMaintenanceSchedule;
  }

  public void setCollateralAssetMaintenanceSchedule(String collateralAssetMaintenanceSchedule) {
    this.collateralAssetMaintenanceSchedule = collateralAssetMaintenanceSchedule;
  }


}

