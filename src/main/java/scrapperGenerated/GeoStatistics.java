
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
    "housing_market",
    "market_trends"
})
@Generated("jsonschema2pojo")
public class GeoStatistics {

    @JsonProperty("housing_market")
    private HousingMarket housingMarket;
    @JsonProperty("market_trends")
    private MarketTrends marketTrends;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("housing_market")
    public HousingMarket getHousingMarket() {
        return housingMarket;
    }

    @JsonProperty("housing_market")
    public void setHousingMarket(HousingMarket housingMarket) {
        this.housingMarket = housingMarket;
    }

    @JsonProperty("market_trends")
    public MarketTrends getMarketTrends() {
        return marketTrends;
    }

    @JsonProperty("market_trends")
    public void setMarketTrends(MarketTrends marketTrends) {
        this.marketTrends = marketTrends;
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
        sb.append(GeoStatistics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("housingMarket");
        sb.append('=');
        sb.append(((this.housingMarket == null)?"<null>":this.housingMarket));
        sb.append(',');
        sb.append("marketTrends");
        sb.append('=');
        sb.append(((this.marketTrends == null)?"<null>":this.marketTrends));
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
        result = ((result* 31)+((this.housingMarket == null)? 0 :this.housingMarket.hashCode()));
        result = ((result* 31)+((this.marketTrends == null)? 0 :this.marketTrends.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoStatistics) == false) {
            return false;
        }
        GeoStatistics rhs = ((GeoStatistics) other);
        return ((((this.housingMarket == rhs.housingMarket)||((this.housingMarket!= null)&&this.housingMarket.equals(rhs.housingMarket)))&&((this.marketTrends == rhs.marketTrends)||((this.marketTrends!= null)&&this.marketTrends.equals(rhs.marketTrends))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
