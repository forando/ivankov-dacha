package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@Entity
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class Outdoor implements DachaEntity  {
  @Id
  private Long id = null;
  @Index
  private Long timeStamp = null;
  private Float tempSouth = null;
  private Float tempNorth = null;
  private Integer preassure = null;
  private Integer humidity = null;
  private Integer windSpeed = null;
  private Integer light = null;
  private Boolean rain = null;


  /**
   * Unique identifier.
   **/
  public Outdoor id(Long id) {
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
  public Outdoor timeStamp(Long timeStamp) {
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
   * Temperature (in celcius) on the south side of the house.
   **/
  public Outdoor tempSouth(Float tempSouth) {
    this.tempSouth = tempSouth;
    return this;
  }


  @ApiModelProperty(value = "Temperature (in celcius) on the south side of the house.")
  @JsonProperty("temp_south")
  public Float getTempSouth() {
    return tempSouth;
  }
  public void setTempSouth(Float tempSouth) {
    this.tempSouth = tempSouth;
  }


  /**
   * Temperature (in celcius) on the south side of the house.
   **/
  public Outdoor tempNorth(Float tempNorth) {
    this.tempNorth = tempNorth;
    return this;
  }


  @ApiModelProperty(value = "Temperature (in celcius) on the south side of the house.")
  @JsonProperty("temp_north")
  public Float getTempNorth() {
    return tempNorth;
  }
  public void setTempNorth(Float tempNorth) {
    this.tempNorth = tempNorth;
  }


  /**
   * Atmospheric preassure in mm of water column.
   **/
  public Outdoor preassure(Integer preassure) {
    this.preassure = preassure;
    return this;
  }


  @ApiModelProperty(value = "Atmospheric preassure in mm of water column.")
  @JsonProperty("preassure")
  public Integer getPreassure() {
    return preassure;
  }
  public void setPreassure(Integer preassure) {
    this.preassure = preassure;
  }


  /**
   * Outdoor humidity (from 0 to 100%).
   **/
  public Outdoor humidity(Integer humidity) {
    this.humidity = humidity;
    return this;
  }


  @ApiModelProperty(value = "Outdoor humidity (from 0 to 100%).")
  @JsonProperty("humidity")
  public Integer getHumidity() {
    return humidity;
  }
  public void setHumidity(Integer humidity) {
    this.humidity = humidity;
  }


  /**
   * The speed of a wind m/s.
   **/
  public Outdoor windSpeed(Integer windSpeed) {
    this.windSpeed = windSpeed;
    return this;
  }


  @ApiModelProperty(value = "The speed of a wind m/s.")
  @JsonProperty("wind_speed")
  public Integer getWindSpeed() {
    return windSpeed;
  }
  public void setWindSpeed(Integer windSpeed) {
    this.windSpeed = windSpeed;
  }


  /**
   * Outdoor illumination in lumins.
   **/
  public Outdoor light(Integer light) {
    this.light = light;
    return this;
  }


  @ApiModelProperty(value = "Outdoor illumination in lumins.")
  @JsonProperty("light")
  public Integer getLight() {
    return light;
  }
  public void setLight(Integer light) {
    this.light = light;
  }


  /**
   * Indicates wehter it's raining or not.
   **/
  public Outdoor rain(Boolean rain) {
    this.rain = rain;
    return this;
  }


  @ApiModelProperty(value = "Indicates wehter it's raining or not.")
  @JsonProperty("rain")
  public Boolean getRain() {
    return rain;
  }
  public void setRain(Boolean rain) {
    this.rain = rain;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outdoor outdoor = (Outdoor) o;
    return Objects.equals(id, outdoor.id) &&
            Objects.equals(timeStamp, outdoor.timeStamp) &&
            Objects.equals(tempSouth, outdoor.tempSouth) &&
            Objects.equals(tempNorth, outdoor.tempNorth) &&
            Objects.equals(preassure, outdoor.preassure) &&
            Objects.equals(humidity, outdoor.humidity) &&
            Objects.equals(windSpeed, outdoor.windSpeed) &&
            Objects.equals(light, outdoor.light) &&
            Objects.equals(rain, outdoor.rain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timeStamp, tempSouth, tempNorth, preassure, humidity, windSpeed, light, rain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outdoor {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    tempSouth: ").append(toIndentedString(tempSouth)).append("\n");
    sb.append("    tempNorth: ").append(toIndentedString(tempNorth)).append("\n");
    sb.append("    preassure: ").append(toIndentedString(preassure)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    windSpeed: ").append(toIndentedString(windSpeed)).append("\n");
    sb.append("    light: ").append(toIndentedString(light)).append("\n");
    sb.append("    rain: ").append(toIndentedString(rain)).append("\n");
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

