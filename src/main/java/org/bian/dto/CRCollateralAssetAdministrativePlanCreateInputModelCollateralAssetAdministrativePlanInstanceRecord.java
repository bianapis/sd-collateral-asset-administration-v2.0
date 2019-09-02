package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAdministrativePlanCreateInputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAdministrativePlanCreateInputModelCollateralAssetAdministrativePlanInstanceRecord
 */
public class CRCollateralAssetAdministrativePlanCreateInputModelCollateralAssetAdministrativePlanInstanceRecord   {
  private CRCollateralAssetAdministrativePlanCreateInputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord collateralAssetRecord = null;


  /**
   * Get collateralAssetRecord
   * @return collateralAssetRecord
  **/

  public CRCollateralAssetAdministrativePlanCreateInputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord getCollateralAssetRecord() {
    return collateralAssetRecord;
  }

  public void setCollateralAssetRecord(CRCollateralAssetAdministrativePlanCreateInputModelCollateralAssetAdministrativePlanInstanceRecordCollateralAssetRecord collateralAssetRecord) {
    this.collateralAssetRecord = collateralAssetRecord;
  }


}

