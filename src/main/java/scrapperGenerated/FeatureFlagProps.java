
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
    "initialProps",
    "cacheEntries"
})
@Generated("jsonschema2pojo")
public class FeatureFlagProps {

    @JsonProperty("initialProps")
    private InitialProps initialProps;
    @JsonProperty("cacheEntries")
    private CacheEntries cacheEntries;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("initialProps")
    public InitialProps getInitialProps() {
        return initialProps;
    }

    @JsonProperty("initialProps")
    public void setInitialProps(InitialProps initialProps) {
        this.initialProps = initialProps;
    }

    @JsonProperty("cacheEntries")
    public CacheEntries getCacheEntries() {
        return cacheEntries;
    }

    @JsonProperty("cacheEntries")
    public void setCacheEntries(CacheEntries cacheEntries) {
        this.cacheEntries = cacheEntries;
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
        sb.append(FeatureFlagProps.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("initialProps");
        sb.append('=');
        sb.append(((this.initialProps == null)?"<null>":this.initialProps));
        sb.append(',');
        sb.append("cacheEntries");
        sb.append('=');
        sb.append(((this.cacheEntries == null)?"<null>":this.cacheEntries));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cacheEntries == null)? 0 :this.cacheEntries.hashCode()));
        result = ((result* 31)+((this.initialProps == null)? 0 :this.initialProps.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeatureFlagProps) == false) {
            return false;
        }
        FeatureFlagProps rhs = ((FeatureFlagProps) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.cacheEntries == rhs.cacheEntries)||((this.cacheEntries!= null)&&this.cacheEntries.equals(rhs.cacheEntries))))&&((this.initialProps == rhs.initialProps)||((this.initialProps!= null)&&this.initialProps.equals(rhs.initialProps))));
    }

}
