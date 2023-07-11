
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
    "active_listing_count_percent_change",
    "median_days_on_market_percent_change",
    "median_listing_price_percent_change",
    "median_listing_price_sqft_percent_change"
})
@Generated("jsonschema2pojo")
public class MonthToMonth {

    @JsonProperty("active_listing_count_percent_change")
    private Double activeListingCountPercentChange;
    @JsonProperty("median_days_on_market_percent_change")
    private Double medianDaysOnMarketPercentChange;
    @JsonProperty("median_listing_price_percent_change")
    private Double medianListingPricePercentChange;
    @JsonProperty("median_listing_price_sqft_percent_change")
    private Double medianListingPriceSqftPercentChange;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("active_listing_count_percent_change")
    public Double getActiveListingCountPercentChange() {
        return activeListingCountPercentChange;
    }

    @JsonProperty("active_listing_count_percent_change")
    public void setActiveListingCountPercentChange(Double activeListingCountPercentChange) {
        this.activeListingCountPercentChange = activeListingCountPercentChange;
    }

    @JsonProperty("median_days_on_market_percent_change")
    public Double getMedianDaysOnMarketPercentChange() {
        return medianDaysOnMarketPercentChange;
    }

    @JsonProperty("median_days_on_market_percent_change")
    public void setMedianDaysOnMarketPercentChange(Double medianDaysOnMarketPercentChange) {
        this.medianDaysOnMarketPercentChange = medianDaysOnMarketPercentChange;
    }

    @JsonProperty("median_listing_price_percent_change")
    public Double getMedianListingPricePercentChange() {
        return medianListingPricePercentChange;
    }

    @JsonProperty("median_listing_price_percent_change")
    public void setMedianListingPricePercentChange(Double medianListingPricePercentChange) {
        this.medianListingPricePercentChange = medianListingPricePercentChange;
    }

    @JsonProperty("median_listing_price_sqft_percent_change")
    public Double getMedianListingPriceSqftPercentChange() {
        return medianListingPriceSqftPercentChange;
    }

    @JsonProperty("median_listing_price_sqft_percent_change")
    public void setMedianListingPriceSqftPercentChange(Double medianListingPriceSqftPercentChange) {
        this.medianListingPriceSqftPercentChange = medianListingPriceSqftPercentChange;
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
        sb.append(MonthToMonth.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activeListingCountPercentChange");
        sb.append('=');
        sb.append(((this.activeListingCountPercentChange == null)?"<null>":this.activeListingCountPercentChange));
        sb.append(',');
        sb.append("medianDaysOnMarketPercentChange");
        sb.append('=');
        sb.append(((this.medianDaysOnMarketPercentChange == null)?"<null>":this.medianDaysOnMarketPercentChange));
        sb.append(',');
        sb.append("medianListingPricePercentChange");
        sb.append('=');
        sb.append(((this.medianListingPricePercentChange == null)?"<null>":this.medianListingPricePercentChange));
        sb.append(',');
        sb.append("medianListingPriceSqftPercentChange");
        sb.append('=');
        sb.append(((this.medianListingPriceSqftPercentChange == null)?"<null>":this.medianListingPriceSqftPercentChange));
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
        result = ((result* 31)+((this.medianListingPricePercentChange == null)? 0 :this.medianListingPricePercentChange.hashCode()));
        result = ((result* 31)+((this.medianListingPriceSqftPercentChange == null)? 0 :this.medianListingPriceSqftPercentChange.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.activeListingCountPercentChange == null)? 0 :this.activeListingCountPercentChange.hashCode()));
        result = ((result* 31)+((this.medianDaysOnMarketPercentChange == null)? 0 :this.medianDaysOnMarketPercentChange.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MonthToMonth) == false) {
            return false;
        }
        MonthToMonth rhs = ((MonthToMonth) other);
        return ((((((this.medianListingPricePercentChange == rhs.medianListingPricePercentChange)||((this.medianListingPricePercentChange!= null)&&this.medianListingPricePercentChange.equals(rhs.medianListingPricePercentChange)))&&((this.medianListingPriceSqftPercentChange == rhs.medianListingPriceSqftPercentChange)||((this.medianListingPriceSqftPercentChange!= null)&&this.medianListingPriceSqftPercentChange.equals(rhs.medianListingPriceSqftPercentChange))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.activeListingCountPercentChange == rhs.activeListingCountPercentChange)||((this.activeListingCountPercentChange!= null)&&this.activeListingCountPercentChange.equals(rhs.activeListingCountPercentChange))))&&((this.medianDaysOnMarketPercentChange == rhs.medianDaysOnMarketPercentChange)||((this.medianDaysOnMarketPercentChange!= null)&&this.medianDaysOnMarketPercentChange.equals(rhs.medianDaysOnMarketPercentChange))));
    }

}
