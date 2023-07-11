
package scrapperGenerated;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "radius",
    "nearbyAreas"
})
@Generated("jsonschema2pojo")
public class Expand {

    @JsonProperty("radius")
    private Integer radius;
    @JsonProperty("nearbyAreas")
    private List<Object> nearbyAreas = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("radius")
    public Integer getRadius() {
        return radius;
    }

    @JsonProperty("radius")
    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @JsonProperty("nearbyAreas")
    public List<Object> getNearbyAreas() {
        return nearbyAreas;
    }

    @JsonProperty("nearbyAreas")
    public void setNearbyAreas(List<Object> nearbyAreas) {
        this.nearbyAreas = nearbyAreas;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Expand.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("radius");
        sb.append('=');
        sb.append(((this.radius == null)?"<null>":this.radius));
        sb.append(',');
        sb.append("nearbyAreas");
        sb.append('=');
        sb.append(((this.nearbyAreas == null)?"<null>":this.nearbyAreas));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.radius == null)? 0 :this.radius.hashCode()));
        result = ((result* 31)+((this.nearbyAreas == null)? 0 :this.nearbyAreas.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Expand) == false) {
            return false;
        }
        Expand rhs = ((Expand) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.radius == rhs.radius)||((this.radius!= null)&&this.radius.equals(rhs.radius))))&&((this.nearbyAreas == rhs.nearbyAreas)||((this.nearbyAreas!= null)&&this.nearbyAreas.equals(rhs.nearbyAreas))));
    }

}
