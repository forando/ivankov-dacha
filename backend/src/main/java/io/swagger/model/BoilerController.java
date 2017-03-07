package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@Entity
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class BoilerController  {
    @Id
    private Long id = 1L;
    private Boolean setOn = null;


    /**
     * Unique identifier.
     **/
    public BoilerController id(Long id) {
        return this;
    }


    @ApiModelProperty(value = "Unique identifier.")
    @JsonProperty("id")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        //dummy
    }


    /**
   * True if the boiler state must be ON and false - if OFF.
   **/
  public BoilerController setOn(Boolean setOn) {
    this.setOn = setOn;
    return this;
  }


  @ApiModelProperty(value = "True if the boiler state must be ON and false - if OFF.")
  @JsonProperty("set_on")
  public Boolean getSetOn() {
    return setOn;
  }
  public void setSetOn(Boolean setOn) {
    this.setOn = setOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoilerController boilerController = (BoilerController) o;
    return Objects.equals(setOn, boilerController.setOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoilerController {\n");

    sb.append("    setOn: ").append(toIndentedString(setOn)).append("\n");
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

