package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceUpdateInputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord
 */
public class BQMaintenanceUpdateInputModelCollateralAssetAdministrativePlanInstanceRecord   {
  private BQMaintenanceUpdateInputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord collateralAssetRecord = null;


  /**
   * Get collateralAssetRecord
   * @return collateralAssetRecord
  **/

  public BQMaintenanceUpdateInputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord getCollateralAssetRecord() {
    return collateralAssetRecord;
  }

  public void setCollateralAssetRecord(BQMaintenanceUpdateInputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord collateralAssetRecord) {
    this.collateralAssetRecord = collateralAssetRecord;
  }


}

