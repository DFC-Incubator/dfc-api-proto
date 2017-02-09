package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-02-09T20:10:39.884Z")
public class PathComponent   {
  
  private String parthPart = null;

  /**
   * part of a path
   **/
  
  @JsonProperty("parthPart")
  public String getParthPart() {
    return parthPart;
  }
  public void setParthPart(String parthPart) {
    this.parthPart = parthPart;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathComponent pathComponent = (PathComponent) o;
    return Objects.equals(parthPart, pathComponent.parthPart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parthPart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathComponent {\n");
    
    sb.append("    parthPart: ").append(toIndentedString(parthPart)).append("\n");
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

