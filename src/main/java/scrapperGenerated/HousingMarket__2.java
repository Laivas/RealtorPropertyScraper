
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
    "by_prop_type",
    "median_listing_price",
    "median_rent_price"
})
@Generated("jsonschema2pojo")
public class HousingMarket__2 {

    @JsonProperty("by_prop_type")
    private List<ByPropType__2> byPropType = new ArrayList<ByPropType__2>();
    @JsonProperty("median_listing_price")
    private Integer medianListingPrice;
    @JsonProperty("median_rent_price")
    private Object medianRentPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("by_prop_type")
    public List<ByPropType__2> getByPropType() {
        return byPropType;
    }

    @JsonProperty("by_prop_type")
    public void setByPropType(List<ByPropType__2> byPropType) {
        this.byPropType = byPropType;
    }

    @JsonProperty("median_listing_price")
    public Integer getMedianListingPrice() {
        return medianListingPrice;
    }

    @JsonProperty("median_listing_price")
    public void setMedianListingPrice(Integer medianListingPrice) {
        this.medianListingPrice = medianListingPrice;
    }

    @JsonProperty("median_rent_price")
    public Object getMedianRentPrice() {
        return medianRentPrice;
    }

    @JsonProperty("median_rent_price")
    public void setMedianRentPrice(Object medianRentPrice) {
        this.medianRentPrice = medianRentPrice;
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
        sb.append(HousingMarket__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("byPropType");
        sb.append('=');
        sb.append(((this.byPropType == null)?"<null>":this.byPropType));
        sb.append(',');
        sb.append("medianListingPrice");
        sb.append('=');
        sb.append(((this.medianListingPrice == null)?"<null>":this.medianListingPrice));
        sb.append(',');
        sb.append("medianRentPrice");
        sb.append('=');
        sb.append(((this.medianRentPrice == null)?"<null>":this.medianRentPrice));
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
        result = ((result* 31)+((this.byPropType == null)? 0 :this.byPropType.hashCode()));
        result = ((result* 31)+((this.medianListingPrice == null)? 0 :this.medianListingPrice.hashCode()));
        result = ((result* 31)+((this.medianRentPrice == null)? 0 :this.medianRentPrice.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HousingMarket__2) == false) {
            return false;
        }
        HousingMarket__2 rhs = ((HousingMarket__2) other);
        return (((((this.byPropType == rhs.byPropType)||((this.byPropType!= null)&&this.byPropType.equals(rhs.byPropType)))&&((this.medianListingPrice == rhs.medianListingPrice)||((this.medianListingPrice!= null)&&this.medianListingPrice.equals(rhs.medianListingPrice))))&&((this.medianRentPrice == rhs.medianRentPrice)||((this.medianRentPrice!= null)&&this.medianRentPrice.equals(rhs.medianRentPrice))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
