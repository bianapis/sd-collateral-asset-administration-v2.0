package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord;
import org.bian.dto.BQMaintenanceRetrieveOutputModelMaintenanceInstanceAnalysis;
import org.bian.dto.BQMaintenanceRetrieveOutputModelMaintenanceInstanceRecord;
import org.bian.dto.BQMaintenanceRetrieveOutputModelMaintenanceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMaintenanceRetrieveOutputModel
 */
public class BQMaintenanceRetrieveOutputModel   {
  private BQMaintenanceRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord = null;

  private BQMaintenanceRetrieveOutputModelMaintenanceInstanceRecord maintenanceInstanceRecord = null;

  private String maintenanceRetrieveActionTaskReference = null;

  private Object maintenanceRetrieveActionTaskRecord = null;

  private String maintenanceRetrieveActionResponse = null;

  private BQMaintenanceRetrieveOutputModelMaintenanceInstanceReport maintenanceInstanceReport = null;

  private BQMaintenanceRetrieveOutputModelMaintenanceInstanceAnalysis maintenanceInstanceAnalysis = null;


  /**
   * Get collateralAssetAdministrativePlanInstanceRecord
   * @return collateralAssetAdministrativePlanInstanceRecord
  **/

  public BQMaintenanceRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord getCollateralAssetAdministrativePlanInstanceRecord() {
    return collateralAssetAdministrativePlanInstanceRecord;
  }

  public void setCollateralAssetAdministrativePlanInstanceRecord(BQMaintenanceRetrieveOutputModelCollateralAssetAdministrativePlanInstanceRecord collateralAssetAdministrativePlanInstanceRecord) {
    this.collateralAssetAdministrativePlanInstanceRecord = collateralAssetAdministrativePlanInstanceRecord;
  }


  /**
   * Get maintenanceInstanceRecord
   * @return maintenanceInstanceRecord
  **/

  public BQMaintenanceRetrieveOutputModelMaintenanceInstanceRecord getMaintenanceInstanceRecord() {
    return maintenanceInstanceRecord;
  }

  public void setMaintenanceInstanceRecord(BQMaintenanceRetrieveOutputModelMaintenanceInstanceRecord maintenanceInstanceRecord) {
    this.maintenanceInstanceRecord = maintenanceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Maintenance instance retrieve service call 
   * @return maintenanceRetrieveActionTaskReference
  **/

  public String getMaintenanceRetrieveActionTaskReference() {
    return maintenanceRetrieveActionTaskReference;
  }

  public void setMaintenanceRetrieveActionTaskReference(String maintenanceRetrieveActionTaskReference) {
    this.maintenanceRetrieveActionTaskReference = maintenanceRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return maintenanceRetrieveActionTaskRecord
  **/

  public Object getMaintenanceRetrieveActionTaskRecord() {
    return maintenanceRetrieveActionTaskRecord;
  }

  public void setMaintenanceRetrieveActionTaskRecord(Object maintenanceRetrieveActionTaskRecord) {
    this.maintenanceRetrieveActionTaskRecord = maintenanceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return maintenanceRetrieveActionResponse
  **/

  public String getMaintenanceRetrieveActionResponse() {
    return maintenanceRetrieveActionResponse;
  }

  public void setMaintenanceRetrieveActionResponse(String maintenanceRetrieveActionResponse) {
    this.maintenanceRetrieveActionResponse = maintenanceRetrieveActionResponse;
  }


  /**
   * Get maintenanceInstanceReport
   * @return maintenanceInstanceReport
  **/

  public BQMaintenanceRetrieveOutputModelMaintenanceInstanceReport getMaintenanceInstanceReport() {
    return maintenanceInstanceReport;
  }

  public void setMaintenanceInstanceReport(BQMaintenanceRetrieveOutputModelMaintenanceInstanceReport maintenanceInstanceReport) {
    this.maintenanceInstanceReport = maintenanceInstanceReport;
  }


  /**
   * Get maintenanceInstanceAnalysis
   * @return maintenanceInstanceAnalysis
  **/

  public BQMaintenanceRetrieveOutputModelMaintenanceInstanceAnalysis getMaintenanceInstanceAnalysis() {
    return maintenanceInstanceAnalysis;
  }

  public void setMaintenanceInstanceAnalysis(BQMaintenanceRetrieveOutputModelMaintenanceInstanceAnalysis maintenanceInstanceAnalysis) {
    this.maintenanceInstanceAnalysis = maintenanceInstanceAnalysis;
  }


}

