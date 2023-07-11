
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
    "median_listing_price",
    "median_lot_size",
    "median_sold_price",
    "median_price_per_sqft",
    "median_days_on_market"
})
@Generated("jsonschema2pojo")
public class Attributes {

    @JsonProperty("median_listing_price")
    private Integer medianListingPrice;
    @JsonProperty("median_lot_size")
    private Integer medianLotSize;
    @JsonProperty("median_sold_price")
    private Integer medianSoldPrice;
    @JsonProperty("median_price_per_sqft")
    private Integer medianPricePerSqft;
    @JsonProperty("median_days_on_market")
    private Integer medianDaysOnMarket;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("median_listing_price")
    public Integer getMedianListingPrice() {
        return medianListingPrice;
    }

    @JsonProperty("median_listing_price")
    public void setMedianListingPrice(Integer medianListingPrice) {
        this.medianListingPrice = medianListingPrice;
    }

    @JsonProperty("median_lot_size")
    public Integer getMedianLotSize() {
        return medianLotSize;
    }

    @JsonProperty("median_lot_size")
    public void setMedianLotSize(Integer medianLotSize) {
        this.medianLotSize = medianLotSize;
    }

    @JsonProperty("median_sold_price")
    public Integer getMedianSoldPrice() {
        return medianSoldPrice;
    }

    @JsonProperty("median_sold_price")
    public void setMedianSoldPrice(Integer medianSoldPrice) {
        this.medianSoldPrice = medianSoldPrice;
    }

    @JsonProperty("median_price_per_sqft")
    public Integer getMedianPricePerSqft() {
        return medianPricePerSqft;
    }

    @JsonProperty("median_price_per_sqft")
    public void setMedianPricePerSqft(Integer medianPricePerSqft) {
        this.medianPricePerSqft = medianPricePerSqft;
    }

    @JsonProperty("median_days_on_market")
    public Integer getMedianDaysOnMarket() {
        return medianDaysOnMarket;
    }

    @JsonProperty("median_days_on_market")
    public void setMedianDaysOnMarket(Integer medianDaysOnMarket) {
        this.medianDaysOnMarket = medianDaysOnMarket;
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
        sb.append(Attributes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("medianListingPrice");
        sb.append('=');
        sb.append(((this.medianListingPrice == null)?"<null>":this.medianListingPrice));
        sb.append(',');
        sb.append("medianLotSize");
        sb.append('=');
        sb.append(((this.medianLotSize == null)?"<null>":this.medianLotSize));
        sb.append(',');
        sb.append("medianSoldPrice");
        sb.append('=');
        sb.append(((this.medianSoldPrice == null)?"<null>":this.medianSoldPrice));
        sb.append(',');
        sb.append("medianPricePerSqft");
        sb.append('=');
        sb.append(((this.medianPricePerSqft == null)?"<null>":this.medianPricePerSqft));
        sb.append(',');
        sb.append("medianDaysOnMarket");
        sb.append('=');
        sb.append(((this.medianDaysOnMarket == null)?"<null>":this.medianDaysOnMarket));
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
        result = ((result* 31)+((this.medianDaysOnMarket == null)? 0 :this.medianDaysOnMarket.hashCode()));
        result = ((result* 31)+((this.medianSoldPrice == null)? 0 :this.medianSoldPrice.hashCode()));
        result = ((result* 31)+((this.medianPricePerSqft == null)? 0 :this.medianPricePerSqft.hashCode()));
        result = ((result* 31)+((this.medianLotSize == null)? 0 :this.medianLotSize.hashCode()));
        result = ((result* 31)+((this.medianListingPrice == null)? 0 :this.medianListingPrice.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attributes) == false) {
            return false;
        }
        Attributes rhs = ((Attributes) other);
        return (((((((this.medianDaysOnMarket == rhs.medianDaysOnMarket)||((this.medianDaysOnMarket!= null)&&this.medianDaysOnMarket.equals(rhs.medianDaysOnMarket)))&&((this.medianSoldPrice == rhs.medianSoldPrice)||((this.medianSoldPrice!= null)&&this.medianSoldPrice.equals(rhs.medianSoldPrice))))&&((this.medianPricePerSqft == rhs.medianPricePerSqft)||((this.medianPricePerSqft!= null)&&this.medianPricePerSqft.equals(rhs.medianPricePerSqft))))&&((this.medianLotSize == rhs.medianLotSize)||((this.medianLotSize!= null)&&this.medianLotSize.equals(rhs.medianLotSize))))&&((this.medianListingPrice == rhs.medianListingPrice)||((this.medianListingPrice!= null)&&this.medianListingPrice.equals(rhs.medianListingPrice))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
