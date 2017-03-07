package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@Entity
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class Indoor implements DachaEntity  {
  @Id
  private Long id = null;
  @Index
  private Long timeStamp = null;
  private Float tempLivingroom = null;
  private Float tempKitchen = null;


  /**
   * Unique identifier.
   **/
  public Indoor id(Long id) {
    this.id = id;
    return this;
  }


  @ApiModelProperty(value = "Unique identifier.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  @Override
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Date in miliseconds the data was fetched on.
   **/
  public Indoor timeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }


  @ApiModelProperty(required = true, value = "Date in miliseconds the data was fetched on.")
  @JsonProperty("time_stamp")
  public Long getTimeStamp() {
    return timeStamp;
  }
  public void setTimeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
  }


  /**
   * Temperature (in celcius) in the living room of the house.
   **/
  public Indoor tempLivingroom(Float tempLivingroom) {
    this.tempLivingroom = tempLivingroom;
    return this;
  }


  @ApiModelProperty(value = "Temperature (in celcius) in the living room of the house.")
  @JsonProperty("temp_livingroom")
  public Float getTempLivingroom() {
    return tempLivingroom;
  }
  public void setTempLivingroom(Float tempLivingroom) {
    this.tempLivingroom = tempLivingroom;
  }


  /**
   * Temperature (in celcius) in the kitchen room of the house.
   **/
  public Indoor tempKitchen(Float tempKitchen) {
    this.tempKitchen = tempKitchen;
    return this;
  }


  @ApiModelProperty(value = "Temperature (in celcius) in the kitchen room of the house.")
  @JsonProperty("temp_kitchen")
  public Float getTempKitchen() {
    return tempKitchen;
  }
  public void setTempKitchen(Float tempKitchen) {
    this.tempKitchen = tempKitchen;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Indoor indoor = (Indoor) o;
    return Objects.equals(id, indoor.id) &&
            Objects.equals(timeStamp, indoor.timeStamp) &&
            Objects.equals(tempLivingroom, indoor.tempLivingroom) &&
            Objects.equals(tempKitchen, indoor.tempKitchen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timeStamp, tempLivingroom, tempKitchen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Indoor {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    tempLivingroom: ").append(toIndentedString(tempLivingroom)).append("\n");
    sb.append("    tempKitchen: ").append(toIndentedString(tempKitchen)).append("\n");
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

