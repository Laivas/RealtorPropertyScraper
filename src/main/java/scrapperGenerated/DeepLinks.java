
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
    "ios",
    "android"
})
@Generated("jsonschema2pojo")
public class DeepLinks {

    @JsonProperty("ios")
    private String ios;
    @JsonProperty("android")
    private String android;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ios")
    public String getIos() {
        return ios;
    }

    @JsonProperty("ios")
    public void setIos(String ios) {
        this.ios = ios;
    }

    @JsonProperty("android")
    public String getAndroid() {
        return android;
    }

    @JsonProperty("android")
    public void setAndroid(String android) {
        this.android = android;
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
        sb.append(DeepLinks.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ios");
        sb.append('=');
        sb.append(((this.ios == null)?"<null>":this.ios));
        sb.append(',');
        sb.append("android");
        sb.append('=');
        sb.append(((this.android == null)?"<null>":this.android));
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
        result = ((result* 31)+((this.ios == null)? 0 :this.ios.hashCode()));
        result = ((result* 31)+((this.android == null)? 0 :this.android.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeepLinks) == false) {
            return false;
        }
        DeepLinks rhs = ((DeepLinks) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.ios == rhs.ios)||((this.ios!= null)&&this.ios.equals(rhs.ios))))&&((this.android == rhs.android)||((this.android!= null)&&this.android.equals(rhs.android))));
    }

}
