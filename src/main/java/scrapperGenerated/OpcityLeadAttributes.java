
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
    "cashback_enabled",
    "flip_the_market_enabled"
})
@Generated("jsonschema2pojo")
public class OpcityLeadAttributes {

    @JsonProperty("cashback_enabled")
    private Boolean cashbackEnabled;
    @JsonProperty("flip_the_market_enabled")
    private Boolean flipTheMarketEnabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("cashback_enabled")
    public Boolean getCashbackEnabled() {
        return cashbackEnabled;
    }

    @JsonProperty("cashback_enabled")
    public void setCashbackEnabled(Boolean cashbackEnabled) {
        this.cashbackEnabled = cashbackEnabled;
    }

    @JsonProperty("flip_the_market_enabled")
    public Boolean getFlipTheMarketEnabled() {
        return flipTheMarketEnabled;
    }

    @JsonProperty("flip_the_market_enabled")
    public void setFlipTheMarketEnabled(Boolean flipTheMarketEnabled) {
        this.flipTheMarketEnabled = flipTheMarketEnabled;
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
        sb.append(OpcityLeadAttributes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cashbackEnabled");
        sb.append('=');
        sb.append(((this.cashbackEnabled == null)?"<null>":this.cashbackEnabled));
        sb.append(',');
        sb.append("flipTheMarketEnabled");
        sb.append('=');
        sb.append(((this.flipTheMarketEnabled == null)?"<null>":this.flipTheMarketEnabled));
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
        result = ((result* 31)+((this.cashbackEnabled == null)? 0 :this.cashbackEnabled.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.flipTheMarketEnabled == null)? 0 :this.flipTheMarketEnabled.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpcityLeadAttributes) == false) {
            return false;
        }
        OpcityLeadAttributes rhs = ((OpcityLeadAttributes) other);
        return ((((this.cashbackEnabled == rhs.cashbackEnabled)||((this.cashbackEnabled!= null)&&this.cashbackEnabled.equals(rhs.cashbackEnabled)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.flipTheMarketEnabled == rhs.flipTheMarketEnabled)||((this.flipTheMarketEnabled!= null)&&this.flipTheMarketEnabled.equals(rhs.flipTheMarketEnabled))));
    }

}
