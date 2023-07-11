
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
    "is_pending",
    "is_foreclosure",
    "is_contingent",
    "is_new_construction",
    "is_new_listing",
    "is_price_reduced",
    "is_plan"
})
@Generated("jsonschema2pojo")
public class Flags__1 {

    @JsonProperty("is_pending")
    private Object isPending;
    @JsonProperty("is_foreclosure")
    private Object isForeclosure;
    @JsonProperty("is_contingent")
    private Object isContingent;
    @JsonProperty("is_new_construction")
    private Object isNewConstruction;
    @JsonProperty("is_new_listing")
    private Boolean isNewListing;
    @JsonProperty("is_price_reduced")
    private Object isPriceReduced;
    @JsonProperty("is_plan")
    private Object isPlan;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("is_pending")
    public Object getIsPending() {
        return isPending;
    }

    @JsonProperty("is_pending")
    public void setIsPending(Object isPending) {
        this.isPending = isPending;
    }

    @JsonProperty("is_foreclosure")
    public Object getIsForeclosure() {
        return isForeclosure;
    }

    @JsonProperty("is_foreclosure")
    public void setIsForeclosure(Object isForeclosure) {
        this.isForeclosure = isForeclosure;
    }

    @JsonProperty("is_contingent")
    public Object getIsContingent() {
        return isContingent;
    }

    @JsonProperty("is_contingent")
    public void setIsContingent(Object isContingent) {
        this.isContingent = isContingent;
    }

    @JsonProperty("is_new_construction")
    public Object getIsNewConstruction() {
        return isNewConstruction;
    }

    @JsonProperty("is_new_construction")
    public void setIsNewConstruction(Object isNewConstruction) {
        this.isNewConstruction = isNewConstruction;
    }

    @JsonProperty("is_new_listing")
    public Boolean getIsNewListing() {
        return isNewListing;
    }

    @JsonProperty("is_new_listing")
    public void setIsNewListing(Boolean isNewListing) {
        this.isNewListing = isNewListing;
    }

    @JsonProperty("is_price_reduced")
    public Object getIsPriceReduced() {
        return isPriceReduced;
    }

    @JsonProperty("is_price_reduced")
    public void setIsPriceReduced(Object isPriceReduced) {
        this.isPriceReduced = isPriceReduced;
    }

    @JsonProperty("is_plan")
    public Object getIsPlan() {
        return isPlan;
    }

    @JsonProperty("is_plan")
    public void setIsPlan(Object isPlan) {
        this.isPlan = isPlan;
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
        sb.append(Flags__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isPending");
        sb.append('=');
        sb.append(((this.isPending == null)?"<null>":this.isPending));
        sb.append(',');
        sb.append("isForeclosure");
        sb.append('=');
        sb.append(((this.isForeclosure == null)?"<null>":this.isForeclosure));
        sb.append(',');
        sb.append("isContingent");
        sb.append('=');
        sb.append(((this.isContingent == null)?"<null>":this.isContingent));
        sb.append(',');
        sb.append("isNewConstruction");
        sb.append('=');
        sb.append(((this.isNewConstruction == null)?"<null>":this.isNewConstruction));
        sb.append(',');
        sb.append("isNewListing");
        sb.append('=');
        sb.append(((this.isNewListing == null)?"<null>":this.isNewListing));
        sb.append(',');
        sb.append("isPriceReduced");
        sb.append('=');
        sb.append(((this.isPriceReduced == null)?"<null>":this.isPriceReduced));
        sb.append(',');
        sb.append("isPlan");
        sb.append('=');
        sb.append(((this.isPlan == null)?"<null>":this.isPlan));
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
        result = ((result* 31)+((this.isPriceReduced == null)? 0 :this.isPriceReduced.hashCode()));
        result = ((result* 31)+((this.isPlan == null)? 0 :this.isPlan.hashCode()));
        result = ((result* 31)+((this.isForeclosure == null)? 0 :this.isForeclosure.hashCode()));
        result = ((result* 31)+((this.isContingent == null)? 0 :this.isContingent.hashCode()));
        result = ((result* 31)+((this.isNewListing == null)? 0 :this.isNewListing.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.isPending == null)? 0 :this.isPending.hashCode()));
        result = ((result* 31)+((this.isNewConstruction == null)? 0 :this.isNewConstruction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Flags__1) == false) {
            return false;
        }
        Flags__1 rhs = ((Flags__1) other);
        return (((((((((this.isPriceReduced == rhs.isPriceReduced)||((this.isPriceReduced!= null)&&this.isPriceReduced.equals(rhs.isPriceReduced)))&&((this.isPlan == rhs.isPlan)||((this.isPlan!= null)&&this.isPlan.equals(rhs.isPlan))))&&((this.isForeclosure == rhs.isForeclosure)||((this.isForeclosure!= null)&&this.isForeclosure.equals(rhs.isForeclosure))))&&((this.isContingent == rhs.isContingent)||((this.isContingent!= null)&&this.isContingent.equals(rhs.isContingent))))&&((this.isNewListing == rhs.isNewListing)||((this.isNewListing!= null)&&this.isNewListing.equals(rhs.isNewListing))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.isPending == rhs.isPending)||((this.isPending!= null)&&this.isPending.equals(rhs.isPending))))&&((this.isNewConstruction == rhs.isNewConstruction)||((this.isNewConstruction!= null)&&this.isNewConstruction.equals(rhs.isNewConstruction))));
    }

}
