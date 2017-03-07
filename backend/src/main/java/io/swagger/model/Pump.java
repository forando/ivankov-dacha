package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@Entity
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class Pump  implements DachaEntity {
  @Id
  private Long id = null;
  @Index
  private Long timeStamp = null;
  private Boolean isOn = null;


  /**
   * Unique identifier.
   **/
  public Pump id(Long id) {
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
  public Pump timeStamp(Long timeStamp) {
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
   * True if the pump in ON and false - if it's OFF.
   **/
  public Pump isOn(Boolean isOn) {
    this.isOn = isOn;
    return this;
  }


  @ApiModelProperty(value = "True if the pump in ON and false - if it's OFF.")
  @JsonProperty("is_on")
  public Boolean getIsOn() {
    return isOn;
  }
  public void setIsOn(Boolean isOn) {
    this.isOn = isOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pump pump = (Pump) o;
    return Objects.equals(id, pump.id) &&
            Objects.equals(timeStamp, pump.timeStamp) &&
            Objects.equals(isOn, pump.isOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timeStamp, isOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pump {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    isOn: ").append(toIndentedString(isOn)).append("\n");
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

