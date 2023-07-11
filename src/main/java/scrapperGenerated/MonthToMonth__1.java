
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
    "active_rental_listing_count_percent_change"
})
@Generated("jsonschema2pojo")
public class MonthToMonth__1 {

    @JsonProperty("active_rental_listing_count_percent_change")
    private Double activeRentalListingCountPercentChange;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("active_rental_listing_count_percent_change")
    public Double getActiveRentalListingCountPercentChange() {
        return activeRentalListingCountPercentChange;
    }

    @JsonProperty("active_rental_listing_count_percent_change")
    public void setActiveRentalListingCountPercentChange(Double activeRentalListingCountPercentChange) {
        this.activeRentalListingCountPercentChange = activeRentalListingCountPercentChange;
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
        sb.append(MonthToMonth__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activeRentalListingCountPercentChange");
        sb.append('=');
        sb.append(((this.activeRentalListingCountPercentChange == null)?"<null>":this.activeRentalListingCountPercentChange));
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
        result = ((result* 31)+((this.activeRentalListingCountPercentChange == null)? 0 :this.activeRentalListingCountPercentChange.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MonthToMonth__1) == false) {
            return false;
        }
        MonthToMonth__1 rhs = ((MonthToMonth__1) other);
        return (((this.activeRentalListingCountPercentChange == rhs.activeRentalListingCountPercentChange)||((this.activeRentalListingCountPercentChange!= null)&&this.activeRentalListingCountPercentChange.equals(rhs.activeRentalListingCountPercentChange)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
