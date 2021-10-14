package com.acn.facilities.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ResponseHeaderInnerJSON
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-10-14T22:58:21.128797400+08:00[Asia/Singapore]")

public class ResponseHeaderInnerJSON   {
  @JsonProperty("MessageId")
  private String messageId;

  @JsonProperty("Timestamp")
  private String timestamp;

  @JsonProperty("requestorId")
  private String requestorId;

  @JsonProperty("status")
  private Integer status;

  public ResponseHeaderInnerJSON messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * Get messageId
   * @return messageId
  */
  @ApiModelProperty(value = "")


  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public ResponseHeaderInnerJSON timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @ApiModelProperty(value = "")


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public ResponseHeaderInnerJSON requestorId(String requestorId) {
    this.requestorId = requestorId;
    return this;
  }

  /**
   * Get requestorId
   * @return requestorId
  */
  @ApiModelProperty(value = "")


  public String getRequestorId() {
    return requestorId;
  }

  public void setRequestorId(String requestorId) {
    this.requestorId = requestorId;
  }

  public ResponseHeaderInnerJSON status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHeaderInnerJSON responseHeaderInnerJSON = (ResponseHeaderInnerJSON) o;
    return Objects.equals(this.messageId, responseHeaderInnerJSON.messageId) &&
        Objects.equals(this.timestamp, responseHeaderInnerJSON.timestamp) &&
        Objects.equals(this.requestorId, responseHeaderInnerJSON.requestorId) &&
        Objects.equals(this.status, responseHeaderInnerJSON.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, timestamp, requestorId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHeaderInnerJSON {\n");

    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    requestorId: ").append(toIndentedString(requestorId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

