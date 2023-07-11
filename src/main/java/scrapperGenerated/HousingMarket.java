
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
    "listing_count",
    "median_listing_price",
    "median_rent_price",
    "median_price_per_sqft",
    "median_days_on_market",
    "median_sold_price",
    "month_to_month"
})
@Generated("jsonschema2pojo")
public class HousingMarket {

    @JsonProperty("by_prop_type")
    private List<ByPropType> byPropType = new ArrayList<ByPropType>();
    @JsonProperty("listing_count")
    private Integer listingCount;
    @JsonProperty("median_listing_price")
    private Integer medianListingPrice;
    @JsonProperty("median_rent_price")
    private Integer medianRentPrice;
    @JsonProperty("median_price_per_sqft")
    private Integer medianPricePerSqft;
    @JsonProperty("median_days_on_market")
    private Integer medianDaysOnMarket;
    @JsonProperty("median_sold_price")
    private Integer medianSoldPrice;
    @JsonProperty("month_to_month")
    private MonthToMonth monthToMonth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("by_prop_type")
    public List<ByPropType> getByPropType() {
        return byPropType;
    }

    @JsonProperty("by_prop_type")
    public void setByPropType(List<ByPropType> byPropType) {
        this.byPropType = byPropType;
    }

    @JsonProperty("listing_count")
    public Integer getListingCount() {
        return listingCount;
    }

    @JsonProperty("listing_count")
    public void setListingCount(Integer listingCount) {
        this.listingCount = listingCount;
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
    public Integer getMedianRentPrice() {
        return medianRentPrice;
    }

    @JsonProperty("median_rent_price")
    public void setMedianRentPrice(Integer medianRentPrice) {
        this.medianRentPrice = medianRentPrice;
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

    @JsonProperty("median_sold_price")
    public Integer getMedianSoldPrice() {
        return medianSoldPrice;
    }

    @JsonProperty("median_sold_price")
    public void setMedianSoldPrice(Integer medianSoldPrice) {
        this.medianSoldPrice = medianSoldPrice;
    }

    @JsonProperty("month_to_month")
    public MonthToMonth getMonthToMonth() {
        return monthToMonth;
    }

    @JsonProperty("month_to_month")
    public void setMonthToMonth(MonthToMonth monthToMonth) {
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
        sb.append(HousingMarket.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("byPropType");
        sb.append('=');
        sb.append(((this.byPropType == null)?"<null>":this.byPropType));
        sb.append(',');
        sb.append("listingCount");
        sb.append('=');
        sb.append(((this.listingCount == null)?"<null>":this.listingCount));
        sb.append(',');
        sb.append("medianListingPrice");
        sb.append('=');
        sb.append(((this.medianListingPrice == null)?"<null>":this.medianListingPrice));
        sb.append(',');
        sb.append("medianRentPrice");
        sb.append('=');
        sb.append(((this.medianRentPrice == null)?"<null>":this.medianRentPrice));
        sb.append(',');
        sb.append("medianPricePerSqft");
        sb.append('=');
        sb.append(((this.medianPricePerSqft == null)?"<null>":this.medianPricePerSqft));
        sb.append(',');
        sb.append("medianDaysOnMarket");
        sb.append('=');
        sb.append(((this.medianDaysOnMarket == null)?"<null>":this.medianDaysOnMarket));
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
        result = ((result* 31)+((this.byPropType == null)? 0 :this.byPropType.hashCode()));
        result = ((result* 31)+((this.listingCount == null)? 0 :this.listingCount.hashCode()));
        result = ((result* 31)+((this.medianDaysOnMarket == null)? 0 :this.medianDaysOnMarket.hashCode()));
        result = ((result* 31)+((this.medianSoldPrice == null)? 0 :this.medianSoldPrice.hashCode()));
        result = ((result* 31)+((this.medianPricePerSqft == null)? 0 :this.medianPricePerSqft.hashCode()));
        result = ((result* 31)+((this.medianListingPrice == null)? 0 :this.medianListingPrice.hashCode()));
        result = ((result* 31)+((this.medianRentPrice == null)? 0 :this.medianRentPrice.hashCode()));
        result = ((result* 31)+((this.monthToMonth == null)? 0 :this.monthToMonth.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HousingMarket) == false) {
            return false;
        }
        HousingMarket rhs = ((HousingMarket) other);
        return ((((((((((this.byPropType == rhs.byPropType)||((this.byPropType!= null)&&this.byPropType.equals(rhs.byPropType)))&&((this.listingCount == rhs.listingCount)||((this.listingCount!= null)&&this.listingCount.equals(rhs.listingCount))))&&((this.medianDaysOnMarket == rhs.medianDaysOnMarket)||((this.medianDaysOnMarket!= null)&&this.medianDaysOnMarket.equals(rhs.medianDaysOnMarket))))&&((this.medianSoldPrice == rhs.medianSoldPrice)||((this.medianSoldPrice!= null)&&this.medianSoldPrice.equals(rhs.medianSoldPrice))))&&((this.medianPricePerSqft == rhs.medianPricePerSqft)||((this.medianPricePerSqft!= null)&&this.medianPricePerSqft.equals(rhs.medianPricePerSqft))))&&((this.medianListingPrice == rhs.medianListingPrice)||((this.medianListingPrice!= null)&&this.medianListingPrice.equals(rhs.medianListingPrice))))&&((this.medianRentPrice == rhs.medianRentPrice)||((this.medianRentPrice!= null)&&this.medianRentPrice.equals(rhs.medianRentPrice))))&&((this.monthToMonth == rhs.monthToMonth)||((this.monthToMonth!= null)&&this.monthToMonth.equals(rhs.monthToMonth))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
