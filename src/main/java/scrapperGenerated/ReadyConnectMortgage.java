
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
    "show_contact_a_lender",
    "show_veterans_united"
})
@Generated("jsonschema2pojo")
public class ReadyConnectMortgage {

    @JsonProperty("show_contact_a_lender")
    private Boolean showContactALender;
    @JsonProperty("show_veterans_united")
    private Boolean showVeteransUnited;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("show_contact_a_lender")
    public Boolean getShowContactALender() {
        return showContactALender;
    }

    @JsonProperty("show_contact_a_lender")
    public void setShowContactALender(Boolean showContactALender) {
        this.showContactALender = showContactALender;
    }

    @JsonProperty("show_veterans_united")
    public Boolean getShowVeteransUnited() {
        return showVeteransUnited;
    }

    @JsonProperty("show_veterans_united")
    public void setShowVeteransUnited(Boolean showVeteransUnited) {
        this.showVeteransUnited = showVeteransUnited;
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
        sb.append(ReadyConnectMortgage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("showContactALender");
        sb.append('=');
        sb.append(((this.showContactALender == null)?"<null>":this.showContactALender));
        sb.append(',');
        sb.append("showVeteransUnited");
        sb.append('=');
        sb.append(((this.showVeteransUnited == null)?"<null>":this.showVeteransUnited));
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
        result = ((result* 31)+((this.showVeteransUnited == null)? 0 :this.showVeteransUnited.hashCode()));
        result = ((result* 31)+((this.showContactALender == null)? 0 :this.showContactALender.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReadyConnectMortgage) == false) {
            return false;
        }
        ReadyConnectMortgage rhs = ((ReadyConnectMortgage) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.showVeteransUnited == rhs.showVeteransUnited)||((this.showVeteransUnited!= null)&&this.showVeteransUnited.equals(rhs.showVeteransUnited))))&&((this.showContactALender == rhs.showContactALender)||((this.showContactALender!= null)&&this.showContactALender.equals(rhs.showContactALender))));
    }

}
