package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@Entity
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class Basement implements DachaEntity  {
  @Id
  private Long id = null;
  @Index
  private Long timeStamp = null;
  private Float temp = null;
  private Integer humidity = null;


  /**
   * Unique identifier.
   **/
  public Basement id(Long id) {
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
  public Basement timeStamp(Long timeStamp) {
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
   * Temperature (in celcius) in the basement.
   **/
  public Basement temp(Float temp) {
    this.temp = temp;
    return this;
  }


  @ApiModelProperty(value = "Temperature (in celcius) in the basement.")
  @JsonProperty("temp")
  public Float getTemp() {
    return temp;
  }
  public void setTemp(Float temp) {
    this.temp = temp;
  }


  /**
   * Humidity (0 to 100%) in the basement.
   **/
  public Basement humidity(Integer humidity) {
    this.humidity = humidity;
    return this;
  }


  @ApiModelProperty(value = "Humidity (0 to 100%) in the basement.")
  @JsonProperty("humidity")
  public Integer getHumidity() {
    return humidity;
  }
  public void setHumidity(Integer humidity) {
    this.humidity = humidity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Basement basement = (Basement) o;
    return Objects.equals(id, basement.id) &&
            Objects.equals(timeStamp, basement.timeStamp) &&
            Objects.equals(temp, basement.temp) &&
            Objects.equals(humidity, basement.humidity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timeStamp, temp, humidity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Basement {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
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

