
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
    "address",
    "time",
    "traffic",
    "transportation_type"
})
@Generated("jsonschema2pojo")
public class Commute {

    @JsonProperty("address")
    private String address;
    @JsonProperty("time")
    private Integer time;
    @JsonProperty("traffic")
    private Boolean traffic;
    @JsonProperty("transportation_type")
    private String transportationType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("time")
    public Integer getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Integer time) {
        this.time = time;
    }

    @JsonProperty("traffic")
    public Boolean getTraffic() {
        return traffic;
    }

    @JsonProperty("traffic")
    public void setTraffic(Boolean traffic) {
        this.traffic = traffic;
    }

    @JsonProperty("transportation_type")
    public String getTransportationType() {
        return transportationType;
    }

    @JsonProperty("transportation_type")
    public void setTransportationType(String transportationType) {
        this.transportationType = transportationType;
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
        sb.append(Commute.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("traffic");
        sb.append('=');
        sb.append(((this.traffic == null)?"<null>":this.traffic));
        sb.append(',');
        sb.append("transportationType");
        sb.append('=');
        sb.append(((this.transportationType == null)?"<null>":this.transportationType));
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
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.transportationType == null)? 0 :this.transportationType.hashCode()));
        result = ((result* 31)+((this.traffic == null)? 0 :this.traffic.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Commute) == false) {
            return false;
        }
        Commute rhs = ((Commute) other);
        return ((((((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address)))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.transportationType == rhs.transportationType)||((this.transportationType!= null)&&this.transportationType.equals(rhs.transportationType))))&&((this.traffic == rhs.traffic)||((this.traffic!= null)&&this.traffic.equals(rhs.traffic))));
    }

}
