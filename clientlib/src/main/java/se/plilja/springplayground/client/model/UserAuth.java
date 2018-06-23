/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package se.plilja.springplayground.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * UserAuth
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T10:53:32.855+02:00")
public class UserAuth {
  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("fromDate")
  private LocalDate fromDate = null;

  @JsonProperty("function")
  private String function = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("modifiedAt")
  private OffsetDateTime modifiedAt = null;

  @JsonProperty("modifiedBy")
  private String modifiedBy = null;

  @JsonProperty("toDate")
  private LocalDate toDate = null;

  @JsonProperty("userId")
  private Long userId = null;

  public UserAuth createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserAuth createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public UserAuth fromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getFromDate() {
    return fromDate;
  }

  public void setFromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
  }

  public UserAuth function(String function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @ApiModelProperty(value = "")
  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public UserAuth id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserAuth modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Get modifiedAt
   * @return modifiedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public UserAuth modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @ApiModelProperty(value = "")
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public UserAuth toDate(LocalDate toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Get toDate
   * @return toDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getToDate() {
    return toDate;
  }

  public void setToDate(LocalDate toDate) {
    this.toDate = toDate;
  }

  public UserAuth userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuth userAuth = (UserAuth) o;
    return Objects.equals(this.createdAt, userAuth.createdAt) &&
        Objects.equals(this.createdBy, userAuth.createdBy) &&
        Objects.equals(this.fromDate, userAuth.fromDate) &&
        Objects.equals(this.function, userAuth.function) &&
        Objects.equals(this.id, userAuth.id) &&
        Objects.equals(this.modifiedAt, userAuth.modifiedAt) &&
        Objects.equals(this.modifiedBy, userAuth.modifiedBy) &&
        Objects.equals(this.toDate, userAuth.toDate) &&
        Objects.equals(this.userId, userAuth.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, fromDate, function, id, modifiedAt, modifiedBy, toDate, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuth {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

