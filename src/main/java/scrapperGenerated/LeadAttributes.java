
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
    "show_contact_an_agent",
    "opcity_lead_attributes",
    "lead_type",
    "ready_connect_mortgage"
})
@Generated("jsonschema2pojo")
public class LeadAttributes {

    @JsonProperty("show_contact_an_agent")
    private Boolean showContactAnAgent;
    @JsonProperty("opcity_lead_attributes")
    private OpcityLeadAttributes opcityLeadAttributes;
    @JsonProperty("lead_type")
    private String leadType;
    @JsonProperty("ready_connect_mortgage")
    private ReadyConnectMortgage readyConnectMortgage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("show_contact_an_agent")
    public Boolean getShowContactAnAgent() {
        return showContactAnAgent;
    }

    @JsonProperty("show_contact_an_agent")
    public void setShowContactAnAgent(Boolean showContactAnAgent) {
        this.showContactAnAgent = showContactAnAgent;
    }

    @JsonProperty("opcity_lead_attributes")
    public OpcityLeadAttributes getOpcityLeadAttributes() {
        return opcityLeadAttributes;
    }

    @JsonProperty("opcity_lead_attributes")
    public void setOpcityLeadAttributes(OpcityLeadAttributes opcityLeadAttributes) {
        this.opcityLeadAttributes = opcityLeadAttributes;
    }

    @JsonProperty("lead_type")
    public String getLeadType() {
        return leadType;
    }

    @JsonProperty("lead_type")
    public void setLeadType(String leadType) {
        this.leadType = leadType;
    }

    @JsonProperty("ready_connect_mortgage")
    public ReadyConnectMortgage getReadyConnectMortgage() {
        return readyConnectMortgage;
    }

    @JsonProperty("ready_connect_mortgage")
    public void setReadyConnectMortgage(ReadyConnectMortgage readyConnectMortgage) {
        this.readyConnectMortgage = readyConnectMortgage;
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
        sb.append(LeadAttributes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("showContactAnAgent");
        sb.append('=');
        sb.append(((this.showContactAnAgent == null)?"<null>":this.showContactAnAgent));
        sb.append(',');
        sb.append("opcityLeadAttributes");
        sb.append('=');
        sb.append(((this.opcityLeadAttributes == null)?"<null>":this.opcityLeadAttributes));
        sb.append(',');
        sb.append("leadType");
        sb.append('=');
        sb.append(((this.leadType == null)?"<null>":this.leadType));
        sb.append(',');
        sb.append("readyConnectMortgage");
        sb.append('=');
        sb.append(((this.readyConnectMortgage == null)?"<null>":this.readyConnectMortgage));
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
        result = ((result* 31)+((this.readyConnectMortgage == null)? 0 :this.readyConnectMortgage.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.leadType == null)? 0 :this.leadType.hashCode()));
        result = ((result* 31)+((this.showContactAnAgent == null)? 0 :this.showContactAnAgent.hashCode()));
        result = ((result* 31)+((this.opcityLeadAttributes == null)? 0 :this.opcityLeadAttributes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LeadAttributes) == false) {
            return false;
        }
        LeadAttributes rhs = ((LeadAttributes) other);
        return ((((((this.readyConnectMortgage == rhs.readyConnectMortgage)||((this.readyConnectMortgage!= null)&&this.readyConnectMortgage.equals(rhs.readyConnectMortgage)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.leadType == rhs.leadType)||((this.leadType!= null)&&this.leadType.equals(rhs.leadType))))&&((this.showContactAnAgent == rhs.showContactAnAgent)||((this.showContactAnAgent!= null)&&this.showContactAnAgent.equals(rhs.showContactAnAgent))))&&((this.opcityLeadAttributes == rhs.opcityLeadAttributes)||((this.opcityLeadAttributes!= null)&&this.opcityLeadAttributes.equals(rhs.opcityLeadAttributes))));
    }

}
