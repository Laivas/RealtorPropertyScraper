
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
    "experimentKey",
    "featureKey",
    "isEnabled"
})
@Generated("jsonschema2pojo")
public class MediaRentalSrpGoogleAdsenseExperiment {

    @JsonProperty("experimentKey")
    private String experimentKey;
    @JsonProperty("featureKey")
    private String featureKey;
    @JsonProperty("isEnabled")
    private Boolean isEnabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("experimentKey")
    public String getExperimentKey() {
        return experimentKey;
    }

    @JsonProperty("experimentKey")
    public void setExperimentKey(String experimentKey) {
        this.experimentKey = experimentKey;
    }

    @JsonProperty("featureKey")
    public String getFeatureKey() {
        return featureKey;
    }

    @JsonProperty("featureKey")
    public void setFeatureKey(String featureKey) {
        this.featureKey = featureKey;
    }

    @JsonProperty("isEnabled")
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @JsonProperty("isEnabled")
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
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
        sb.append(MediaRentalSrpGoogleAdsenseExperiment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("experimentKey");
        sb.append('=');
        sb.append(((this.experimentKey == null)?"<null>":this.experimentKey));
        sb.append(',');
        sb.append("featureKey");
        sb.append('=');
        sb.append(((this.featureKey == null)?"<null>":this.featureKey));
        sb.append(',');
        sb.append("isEnabled");
        sb.append('=');
        sb.append(((this.isEnabled == null)?"<null>":this.isEnabled));
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
        result = ((result* 31)+((this.experimentKey == null)? 0 :this.experimentKey.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.featureKey == null)? 0 :this.featureKey.hashCode()));
        result = ((result* 31)+((this.isEnabled == null)? 0 :this.isEnabled.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MediaRentalSrpGoogleAdsenseExperiment) == false) {
            return false;
        }
        MediaRentalSrpGoogleAdsenseExperiment rhs = ((MediaRentalSrpGoogleAdsenseExperiment) other);
        return (((((this.experimentKey == rhs.experimentKey)||((this.experimentKey!= null)&&this.experimentKey.equals(rhs.experimentKey)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.featureKey == rhs.featureKey)||((this.featureKey!= null)&&this.featureKey.equals(rhs.featureKey))))&&((this.isEnabled == rhs.isEnabled)||((this.isEnabled!= null)&&this.isEnabled.equals(rhs.isEnabled))));
    }

}
