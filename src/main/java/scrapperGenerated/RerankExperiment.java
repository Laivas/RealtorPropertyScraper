
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
    "variation",
    "rerankBucket"
})
@Generated("jsonschema2pojo")
public class RerankExperiment {

    @JsonProperty("experimentKey")
    private String experimentKey;
    @JsonProperty("featureKey")
    private String featureKey;
    @JsonProperty("variation")
    private String variation;
    @JsonProperty("rerankBucket")
    private RerankBucket rerankBucket;
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

    @JsonProperty("variation")
    public String getVariation() {
        return variation;
    }

    @JsonProperty("variation")
    public void setVariation(String variation) {
        this.variation = variation;
    }

    @JsonProperty("rerankBucket")
    public RerankBucket getRerankBucket() {
        return rerankBucket;
    }

    @JsonProperty("rerankBucket")
    public void setRerankBucket(RerankBucket rerankBucket) {
        this.rerankBucket = rerankBucket;
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
        sb.append(RerankExperiment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("experimentKey");
        sb.append('=');
        sb.append(((this.experimentKey == null)?"<null>":this.experimentKey));
        sb.append(',');
        sb.append("featureKey");
        sb.append('=');
        sb.append(((this.featureKey == null)?"<null>":this.featureKey));
        sb.append(',');
        sb.append("variation");
        sb.append('=');
        sb.append(((this.variation == null)?"<null>":this.variation));
        sb.append(',');
        sb.append("rerankBucket");
        sb.append('=');
        sb.append(((this.rerankBucket == null)?"<null>":this.rerankBucket));
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
        result = ((result* 31)+((this.rerankBucket == null)? 0 :this.rerankBucket.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.featureKey == null)? 0 :this.featureKey.hashCode()));
        result = ((result* 31)+((this.variation == null)? 0 :this.variation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RerankExperiment) == false) {
            return false;
        }
        RerankExperiment rhs = ((RerankExperiment) other);
        return ((((((this.experimentKey == rhs.experimentKey)||((this.experimentKey!= null)&&this.experimentKey.equals(rhs.experimentKey)))&&((this.rerankBucket == rhs.rerankBucket)||((this.rerankBucket!= null)&&this.rerankBucket.equals(rhs.rerankBucket))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.featureKey == rhs.featureKey)||((this.featureKey!= null)&&this.featureKey.equals(rhs.featureKey))))&&((this.variation == rhs.variation)||((this.variation!= null)&&this.variation.equals(rhs.variation))));
    }

}
