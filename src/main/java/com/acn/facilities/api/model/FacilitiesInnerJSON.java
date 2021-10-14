package com.acn.facilities.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FacilitiesInnerJSON
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-10-14T23:52:11.200360100+08:00[Asia/Singapore]")

@Entity(name="Facilities")
public class FacilitiesInnerJSON   {

  @Id
  @JsonProperty("hci")
  private String hci;

  @JsonProperty("uen")
  private String uen;

  @JsonProperty("name")
  private String name;

  @JsonProperty("address")
  private String address;

  @JsonProperty("phoneNum")
  private String  phoneNum;

  @JsonProperty("status")
  private String status;

  public FacilitiesInnerJSON hci(String hci) {
    this.hci = hci;
    return this;
  }

  /**
   * Get hci
   * @return hci
   */
  @ApiModelProperty(value = "hci")


  public String getHci() {
    return hci;
  }

  public void setHci(String hci) {
    this.hci = hci;
  }

  public FacilitiesInnerJSON uen(String uen) {
    this.uen = uen;
    return this;
  }

  /**
   * Get uen
   * @return uen
   */
  @ApiModelProperty(value = "uen")


  public String getUen() {
    return uen;
  }

  public void setUen(String uen) {
    this.uen = uen;
  }

  public FacilitiesInnerJSON name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @ApiModelProperty(value = "name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FacilitiesInnerJSON address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @ApiModelProperty(value = "address")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public FacilitiesInnerJSON phoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
    return this;
  }

  /**
   * Get phoneNum
   * @return phoneNum
   */
  @ApiModelProperty(value = "phoneNum")


  public String getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }

  public FacilitiesInnerJSON status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status
   * @return status
   */
  @ApiModelProperty(value = "status")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacilitiesInnerJSON facilitiesInnerJSON = (FacilitiesInnerJSON) o;
    return Objects.equals(this.hci, facilitiesInnerJSON.hci) &&
            Objects.equals(this.uen, facilitiesInnerJSON.uen) &&
            Objects.equals(this.name, facilitiesInnerJSON.name) &&
            Objects.equals(this.address, facilitiesInnerJSON.address) &&
            Objects.equals(this.phoneNum, facilitiesInnerJSON.phoneNum) &&
            Objects.equals(this.status, facilitiesInnerJSON.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hci, uen, name, address, phoneNum, status);
  }

  /*@Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacilitiesInnerJSON {\n");

    sb.append("    hci: ").append(toIndentedString(hci)).append("\n");
    sb.append("    uen: ").append(toIndentedString(uen)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneNum: ").append(toIndentedString(phoneNum)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }*/

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  /*private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }*/
}

