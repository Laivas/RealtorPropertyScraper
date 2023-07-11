
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
    "sqft",
    "lot_sqft",
    "baths_max",
    "baths_min",
    "beds_min",
    "beds_max",
    "sqft_min",
    "sqft_max",
    "type",
    "sub_type",
    "sold_price",
    "sold_date"
})
@Generated("jsonschema2pojo")
public class Description {

    @JsonProperty("beds")
    private Object beds;
    @JsonProperty("baths_consolidated")
    private Object bathsConsolidated;
    @JsonProperty("sqft")
    private Object sqft;
    @JsonProperty("lot_sqft")
    private Integer lotSqft;
    @JsonProperty("baths_max")
    private Object bathsMax;
    @JsonProperty("baths_min")
    private Object bathsMin;
    @JsonProperty("beds_min")
    private Object bedsMin;
    @JsonProperty("beds_max")
    private Object bedsMax;
    @JsonProperty("sqft_min")
    private Object sqftMin;
    @JsonProperty("sqft_max")
    private Object sqftMax;
    @JsonProperty("type")
    private String type;
    @JsonProperty("sub_type")
    private Object subType;
    @JsonProperty("sold_price")
    private Object soldPrice;
    @JsonProperty("sold_date")
    private Object soldDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("beds")
    public Object getBeds() {
        return beds;
    }

    @JsonProperty("beds")
    public void setBeds(Object beds) {
        this.beds = beds;
    }

    @JsonProperty("baths_consolidated")
    public Object getBathsConsolidated() {
        return bathsConsolidated;
    }

    @JsonProperty("baths_consolidated")
    public void setBathsConsolidated(Object bathsConsolidated) {
        this.bathsConsolidated = bathsConsolidated;
    }

    @JsonProperty("sqft")
    public Object getSqft() {
        return sqft;
    }

    @JsonProperty("sqft")
    public void setSqft(Object sqft) {
        this.sqft = sqft;
    }

    @JsonProperty("lot_sqft")
    public Integer getLotSqft() {
        return lotSqft;
    }

    @JsonProperty("lot_sqft")
    public void setLotSqft(Integer lotSqft) {
        this.lotSqft = lotSqft;
    }

    @JsonProperty("baths_max")
    public Object getBathsMax() {
        return bathsMax;
    }

    @JsonProperty("baths_max")
    public void setBathsMax(Object bathsMax) {
        this.bathsMax = bathsMax;
    }

    @JsonProperty("baths_min")
    public Object getBathsMin() {
        return bathsMin;
    }

    @JsonProperty("baths_min")
    public void setBathsMin(Object bathsMin) {
        this.bathsMin = bathsMin;
    }

    @JsonProperty("beds_min")
    public Object getBedsMin() {
        return bedsMin;
    }

    @JsonProperty("beds_min")
    public void setBedsMin(Object bedsMin) {
        this.bedsMin = bedsMin;
    }

    @JsonProperty("beds_max")
    public Object getBedsMax() {
        return bedsMax;
    }

    @JsonProperty("beds_max")
    public void setBedsMax(Object bedsMax) {
        this.bedsMax = bedsMax;
    }

    @JsonProperty("sqft_min")
    public Object getSqftMin() {
        return sqftMin;
    }

    @JsonProperty("sqft_min")
    public void setSqftMin(Object sqftMin) {
        this.sqftMin = sqftMin;
    }

    @JsonProperty("sqft_max")
    public Object getSqftMax() {
        return sqftMax;
    }

    @JsonProperty("sqft_max")
    public void setSqftMax(Object sqftMax) {
        this.sqftMax = sqftMax;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("sub_type")
    public Object getSubType() {
        return subType;
    }

    @JsonProperty("sub_type")
    public void setSubType(Object subType) {
        this.subType = subType;
    }

    @JsonProperty("sold_price")
    public Object getSoldPrice() {
        return soldPrice;
    }

    @JsonProperty("sold_price")
    public void setSoldPrice(Object soldPrice) {
        this.soldPrice = soldPrice;
    }

    @JsonProperty("sold_date")
    public Object getSoldDate() {
        return soldDate;
    }

    @JsonProperty("sold_date")
    public void setSoldDate(Object soldDate) {
        this.soldDate = soldDate;
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
        sb.append(Description.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("lotSqft");
        sb.append('=');
        sb.append(((this.lotSqft == null)?"<null>":this.lotSqft));
        sb.append(',');
        sb.append("bathsMax");
        sb.append('=');
        sb.append(((this.bathsMax == null)?"<null>":this.bathsMax));
        sb.append(',');
        sb.append("bathsMin");
        sb.append('=');
        sb.append(((this.bathsMin == null)?"<null>":this.bathsMin));
        sb.append(',');
        sb.append("bedsMin");
        sb.append('=');
        sb.append(((this.bedsMin == null)?"<null>":this.bedsMin));
        sb.append(',');
        sb.append("bedsMax");
        sb.append('=');
        sb.append(((this.bedsMax == null)?"<null>":this.bedsMax));
        sb.append(',');
        sb.append("sqftMin");
        sb.append('=');
        sb.append(((this.sqftMin == null)?"<null>":this.sqftMin));
        sb.append(',');
        sb.append("sqftMax");
        sb.append('=');
        sb.append(((this.sqftMax == null)?"<null>":this.sqftMax));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("subType");
        sb.append('=');
        sb.append(((this.subType == null)?"<null>":this.subType));
        sb.append(',');
        sb.append("soldPrice");
        sb.append('=');
        sb.append(((this.soldPrice == null)?"<null>":this.soldPrice));
        sb.append(',');
        sb.append("soldDate");
        sb.append('=');
        sb.append(((this.soldDate == null)?"<null>":this.soldDate));
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
        result = ((result* 31)+((this.bedsMax == null)? 0 :this.bedsMax.hashCode()));
        result = ((result* 31)+((this.bathsMin == null)? 0 :this.bathsMin.hashCode()));
        result = ((result* 31)+((this.soldDate == null)? 0 :this.soldDate.hashCode()));
        result = ((result* 31)+((this.lotSqft == null)? 0 :this.lotSqft.hashCode()));
        result = ((result* 31)+((this.sqftMax == null)? 0 :this.sqftMax.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.bedsMin == null)? 0 :this.bedsMin.hashCode()));
        result = ((result* 31)+((this.bathsMax == null)? 0 :this.bathsMax.hashCode()));
        result = ((result* 31)+((this.sqftMin == null)? 0 :this.sqftMin.hashCode()));
        result = ((result* 31)+((this.soldPrice == null)? 0 :this.soldPrice.hashCode()));
        result = ((result* 31)+((this.sqft == null)? 0 :this.sqft.hashCode()));
        result = ((result* 31)+((this.bathsConsolidated == null)? 0 :this.bathsConsolidated.hashCode()));
        result = ((result* 31)+((this.subType == null)? 0 :this.subType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.beds == null)? 0 :this.beds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Description) == false) {
            return false;
        }
        Description rhs = ((Description) other);
        return ((((((((((((((((this.bedsMax == rhs.bedsMax)||((this.bedsMax!= null)&&this.bedsMax.equals(rhs.bedsMax)))&&((this.bathsMin == rhs.bathsMin)||((this.bathsMin!= null)&&this.bathsMin.equals(rhs.bathsMin))))&&((this.soldDate == rhs.soldDate)||((this.soldDate!= null)&&this.soldDate.equals(rhs.soldDate))))&&((this.lotSqft == rhs.lotSqft)||((this.lotSqft!= null)&&this.lotSqft.equals(rhs.lotSqft))))&&((this.sqftMax == rhs.sqftMax)||((this.sqftMax!= null)&&this.sqftMax.equals(rhs.sqftMax))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.bedsMin == rhs.bedsMin)||((this.bedsMin!= null)&&this.bedsMin.equals(rhs.bedsMin))))&&((this.bathsMax == rhs.bathsMax)||((this.bathsMax!= null)&&this.bathsMax.equals(rhs.bathsMax))))&&((this.sqftMin == rhs.sqftMin)||((this.sqftMin!= null)&&this.sqftMin.equals(rhs.sqftMin))))&&((this.soldPrice == rhs.soldPrice)||((this.soldPrice!= null)&&this.soldPrice.equals(rhs.soldPrice))))&&((this.sqft == rhs.sqft)||((this.sqft!= null)&&this.sqft.equals(rhs.sqft))))&&((this.bathsConsolidated == rhs.bathsConsolidated)||((this.bathsConsolidated!= null)&&this.bathsConsolidated.equals(rhs.bathsConsolidated))))&&((this.subType == rhs.subType)||((this.subType!= null)&&this.subType.equals(rhs.subType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.beds == rhs.beds)||((this.beds!= null)&&this.beds.equals(rhs.beds))));
    }

}
