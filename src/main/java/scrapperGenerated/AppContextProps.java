
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
    "userAgent",
    "featureFlagProps"
})
@Generated("jsonschema2pojo")
public class AppContextProps {

    @JsonProperty("userAgent")
    private String userAgent;
    @JsonProperty("featureFlagProps")
    private FeatureFlagProps featureFlagProps;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("userAgent")
    public String getUserAgent() {
        return userAgent;
    }

    @JsonProperty("userAgent")
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @JsonProperty("featureFlagProps")
    public FeatureFlagProps getFeatureFlagProps() {
        return featureFlagProps;
    }

    @JsonProperty("featureFlagProps")
    public void setFeatureFlagProps(FeatureFlagProps featureFlagProps) {
        this.featureFlagProps = featureFlagProps;
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
        sb.append(AppContextProps.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("userAgent");
        sb.append('=');
        sb.append(((this.userAgent == null)?"<null>":this.userAgent));
        sb.append(',');
        sb.append("featureFlagProps");
        sb.append('=');
        sb.append(((this.featureFlagProps == null)?"<null>":this.featureFlagProps));
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
        result = ((result* 31)+((this.userAgent == null)? 0 :this.userAgent.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.featureFlagProps == null)? 0 :this.featureFlagProps.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppContextProps) == false) {
            return false;
        }
        AppContextProps rhs = ((AppContextProps) other);
        return ((((this.userAgent == rhs.userAgent)||((this.userAgent!= null)&&this.userAgent.equals(rhs.userAgent)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.featureFlagProps == rhs.featureFlagProps)||((this.featureFlagProps!= null)&&this.featureFlagProps.equals(rhs.featureFlagProps))));
    }

}
