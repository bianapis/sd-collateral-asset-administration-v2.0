package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceRequestInputModelMaintenanceInstanceRecord
 */
public class BQMaintenanceRequestInputModelMaintenanceInstanceRecord   {
  private String collateralAssetMaintenanceTaskType = null;

  private String collateralAssetMaintenanceServiceProviderReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of action or check performed to oversee maintenance (e.g. insurance coverage, upkeep review) 
   * @return collateralAssetMaintenanceTaskType
  **/

  public String getCollateralAssetMaintenanceTaskType() {
    return collateralAssetMaintenanceTaskType;
  }

  public void setCollateralAssetMaintenanceTaskType(String collateralAssetMaintenanceTaskType) {
    this.collateralAssetMaintenanceTaskType = collateralAssetMaintenanceTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to 3rd party maintenance service provider (e.g. insurer, custodian) 
   * @return collateralAssetMaintenanceServiceProviderReference
  **/

  public String getCollateralAssetMaintenanceServiceProviderReference() {
    return collateralAssetMaintenanceServiceProviderReference;
  }

  public void setCollateralAssetMaintenanceServiceProviderReference(String collateralAssetMaintenanceServiceProviderReference) {
    this.collateralAssetMaintenanceServiceProviderReference = collateralAssetMaintenanceServiceProviderReference;
  }


}

