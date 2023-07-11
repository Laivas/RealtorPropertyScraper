
package scrapperGenerated;

import java.util.LinkedHashMap;
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
    "beds",
    "baths_consolidated",
    "sqft"
})
@Generated("jsonschema2pojo")
public class Description__1 {

    @JsonProperty("beds")
    private Integer beds;
    @JsonProperty("baths_consolidated")
    private String bathsConsolidated;
    @JsonProperty("sqft")
    private Integer sqft;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("beds")
    public Integer getBeds() {
        return beds;
    }

    @JsonProperty("beds")
    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    @JsonProperty("baths_consolidated")
    public String getBathsConsolidated() {
        return bathsConsolidated;
    }

    @JsonProperty("baths_consolidated")
    public void setBathsConsolidated(String bathsConsolidated) {
        this.bathsConsolidated = bathsConsolidated;
    }

    @JsonProperty("sqft")
    public Integer getSqft() {
        return sqft;
    }

    @JsonProperty("sqft")
    public void setSqft(Integer sqft) {
        this.sqft = sqft;
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
        sb.append(Description__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("beds");
        sb.append('=');
        sb.append(((this.beds == null)?"<null>":this.beds));
        sb.append(',');
        sb.append("bathsConsolidated");
        sb.append('=');
        sb.append(((this.bathsConsolidated == null)?"<null>":this.bathsConsolidated));
        sb.append(',');
        sb.append("sqft");
        sb.append('=');
        sb.append(((this.sqft == null)?"<null>":this.sqft));
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
        result = ((result* 31)+((this.sqft == null)? 0 :this.sqft.hashCode()));
        result = ((result* 31)+((this.bathsConsolidated == null)? 0 :this.bathsConsolidated.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.beds == null)? 0 :this.beds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Description__1) == false) {
            return false;
        }
        Description__1 rhs = ((Description__1) other);
        return (((((this.sqft == rhs.sqft)||((this.sqft!= null)&&this.sqft.equals(rhs.sqft)))&&((this.bathsConsolidated == rhs.bathsConsolidated)||((this.bathsConsolidated!= null)&&this.bathsConsolidated.equals(rhs.bathsConsolidated))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.beds == rhs.beds)||((this.beds!= null)&&this.beds.equals(rhs.beds))));
    }

}
