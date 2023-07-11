
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
    "active_listing_count",
    "rental_listing_price",
    "listing_price_sqft",
    "listing_price",
    "age_days",
    "median_sold_price",
    "month_to_month"
})
@Generated("jsonschema2pojo")
public class MarketTrends {

    @JsonProperty("active_listing_count")
    private Integer activeListingCount;
    @JsonProperty("rental_listing_price")
    private Integer rentalListingPrice;
    @JsonProperty("listing_price_sqft")
    private Integer listingPriceSqft;
    @JsonProperty("listing_price")
    private Integer listingPrice;
    @JsonProperty("age_days")
    private Integer ageDays;
    @JsonProperty("median_sold_price")
    private Integer medianSoldPrice;
    @JsonProperty("month_to_month")
    private MonthToMonth__1 monthToMonth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("active_listing_count")
    public Integer getActiveListingCount() {
        return activeListingCount;
    }

    @JsonProperty("active_listing_count")
    public void setActiveListingCount(Integer activeListingCount) {
        this.activeListingCount = activeListingCount;
    }

    @JsonProperty("rental_listing_price")
    public Integer getRentalListingPrice() {
        return rentalListingPrice;
    }

    @JsonProperty("rental_listing_price")
    public void setRentalListingPrice(Integer rentalListingPrice) {
        this.rentalListingPrice = rentalListingPrice;
    }

    @JsonProperty("listing_price_sqft")
    public Integer getListingPriceSqft() {
        return listingPriceSqft;
    }

    @JsonProperty("listing_price_sqft")
    public void setListingPriceSqft(Integer listingPriceSqft) {
        this.listingPriceSqft = listingPriceSqft;
    }

    @JsonProperty("listing_price")
    public Integer getListingPrice() {
        return listingPrice;
    }

    @JsonProperty("listing_price")
    public void setListingPrice(Integer listingPrice) {
        this.listingPrice = listingPrice;
    }

    @JsonProperty("age_days")
    public Integer getAgeDays() {
        return ageDays;
    }

    @JsonProperty("age_days")
    public void setAgeDays(Integer ageDays) {
        this.ageDays = ageDays;
    }

    @JsonProperty("median_sold_price")
    public Integer getMedianSoldPrice() {
        return medianSoldPrice;
    }

    @JsonProperty("median_sold_price")
    public void setMedianSoldPrice(Integer medianSoldPrice) {
        this.medianSoldPrice = medianSoldPrice;
    }

    @JsonProperty("month_to_month")
    public MonthToMonth__1 getMonthToMonth() {
        return monthToMonth;
    }

    @JsonProperty("month_to_month")
    public void setMonthToMonth(MonthToMonth__1 monthToMonth) {
        this.monthToMonth = monthToMonth;
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
        sb.append(MarketTrends.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activeListingCount");
        sb.append('=');
        sb.append(((this.activeListingCount == null)?"<null>":this.activeListingCount));
        sb.append(',');
        sb.append("rentalListingPrice");
        sb.append('=');
        sb.append(((this.rentalListingPrice == null)?"<null>":this.rentalListingPrice));
        sb.append(',');
        sb.append("listingPriceSqft");
        sb.append('=');
        sb.append(((this.listingPriceSqft == null)?"<null>":this.listingPriceSqft));
        sb.append(',');
        sb.append("listingPrice");
        sb.append('=');
        sb.append(((this.listingPrice == null)?"<null>":this.listingPrice));
        sb.append(',');
        sb.append("ageDays");
        sb.append('=');
        sb.append(((this.ageDays == null)?"<null>":this.ageDays));
        sb.append(',');
        sb.append("medianSoldPrice");
        sb.append('=');
        sb.append(((this.medianSoldPrice == null)?"<null>":this.medianSoldPrice));
        sb.append(',');
        sb.append("monthToMonth");
        sb.append('=');
        sb.append(((this.monthToMonth == null)?"<null>":this.monthToMonth));
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
        result = ((result* 31)+((this.rentalListingPrice == null)? 0 :this.rentalListingPrice.hashCode()));
        result = ((result* 31)+((this.listingPrice == null)? 0 :this.listingPrice.hashCode()));
        result = ((result* 31)+((this.listingPriceSqft == null)? 0 :this.listingPriceSqft.hashCode()));
        result = ((result* 31)+((this.activeListingCount == null)? 0 :this.activeListingCount.hashCode()));
        result = ((result* 31)+((this.medianSoldPrice == null)? 0 :this.medianSoldPrice.hashCode()));
        result = ((result* 31)+((this.ageDays == null)? 0 :this.ageDays.hashCode()));
        result = ((result* 31)+((this.monthToMonth == null)? 0 :this.monthToMonth.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MarketTrends) == false) {
            return false;
        }
        MarketTrends rhs = ((MarketTrends) other);
        return (((((((((this.rentalListingPrice == rhs.rentalListingPrice)||((this.rentalListingPrice!= null)&&this.rentalListingPrice.equals(rhs.rentalListingPrice)))&&((this.listingPrice == rhs.listingPrice)||((this.listingPrice!= null)&&this.listingPrice.equals(rhs.listingPrice))))&&((this.listingPriceSqft == rhs.listingPriceSqft)||((this.listingPriceSqft!= null)&&this.listingPriceSqft.equals(rhs.listingPriceSqft))))&&((this.activeListingCount == rhs.activeListingCount)||((this.activeListingCount!= null)&&this.activeListingCount.equals(rhs.activeListingCount))))&&((this.medianSoldPrice == rhs.medianSoldPrice)||((this.medianSoldPrice!= null)&&this.medianSoldPrice.equals(rhs.medianSoldPrice))))&&((this.ageDays == rhs.ageDays)||((this.ageDays!= null)&&this.ageDays.equals(rhs.ageDays))))&&((this.monthToMonth == rhs.monthToMonth)||((this.monthToMonth!= null)&&this.monthToMonth.equals(rhs.monthToMonth))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
