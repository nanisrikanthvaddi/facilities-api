package com.acn.facilities.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * FacilitiesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-10-14T22:58:21.128797400+08:00[Asia/Singapore]")


public class FacilitiesResponse   {
  @JsonProperty("responseHeader")
  private ResponseHeaderInnerJSON responseHeader;

  @JsonProperty("facility")
  private FacilitiesInnerJSON facility;


  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  @JsonProperty("logo")
  private String logo;


  public FacilitiesResponse responseHeader(ResponseHeaderInnerJSON responseHeader) {
    this.responseHeader = responseHeader;
    return this;
  }

  /**
   * Get responseHeader
   * @return responseHeader
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResponseHeaderInnerJSON getResponseHeader() {
    return responseHeader;
  }

  public void setResponseHeader(ResponseHeaderInnerJSON responseHeader) {
    this.responseHeader = responseHeader;
  }

  public FacilitiesResponse facility(FacilitiesInnerJSON facility) {
    this.facility = facility;
    return this;
  }

  /**
   * Get facility
   * @return facility
  */
  @ApiModelProperty(value = "")

  @Valid

  public FacilitiesInnerJSON getFacility() {
    return facility;
  }

  public void setFacility(FacilitiesInnerJSON facility) {
    this.facility = facility;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacilitiesResponse facilitiesResponse = (FacilitiesResponse) o;
    return Objects.equals(this.responseHeader, facilitiesResponse.responseHeader) &&
        Objects.equals(this.facility, facilitiesResponse.facility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, facility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacilitiesResponse {\n");

    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

