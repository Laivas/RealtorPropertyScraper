
package scrapperGenerated;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "elementary",
    "middle",
    "high",
    "private",
    "district",
    "university"
})
@Generated("jsonschema2pojo")
public class Schools {

    @JsonProperty("elementary")
    private List<Elementary> elementary = new ArrayList<Elementary>();
    @JsonProperty("middle")
    private List<Middle> middle = new ArrayList<Middle>();
    @JsonProperty("high")
    private List<High> high = new ArrayList<High>();
    @JsonProperty("private")
    private List<Object> _private = new ArrayList<Object>();
    @JsonProperty("district")
    private List<District> district = new ArrayList<District>();
    @JsonProperty("university")
    private List<Object> university = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("elementary")
    public List<Elementary> getElementary() {
        return elementary;
    }

    @JsonProperty("elementary")
    public void setElementary(List<Elementary> elementary) {
        this.elementary = elementary;
    }

    @JsonProperty("middle")
    public List<Middle> getMiddle() {
        return middle;
    }

    @JsonProperty("middle")
    public void setMiddle(List<Middle> middle) {
        this.middle = middle;
    }

    @JsonProperty("high")
    public List<High> getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(List<High> high) {
        this.high = high;
    }

    @JsonProperty("private")
    public List<Object> getPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(List<Object> _private) {
        this._private = _private;
    }

    @JsonProperty("district")
    public List<District> getDistrict() {
        return district;
    }

    @JsonProperty("district")
    public void setDistrict(List<District> district) {
        this.district = district;
    }

    @JsonProperty("university")
    public List<Object> getUniversity() {
        return university;
    }

    @JsonProperty("university")
    public void setUniversity(List<Object> university) {
        this.university = university;
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
        sb.append(Schools.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("elementary");
        sb.append('=');
        sb.append(((this.elementary == null)?"<null>":this.elementary));
        sb.append(',');
        sb.append("middle");
        sb.append('=');
        sb.append(((this.middle == null)?"<null>":this.middle));
        sb.append(',');
        sb.append("high");
        sb.append('=');
        sb.append(((this.high == null)?"<null>":this.high));
        sb.append(',');
        sb.append("_private");
        sb.append('=');
        sb.append(((this._private == null)?"<null>":this._private));
        sb.append(',');
        sb.append("district");
        sb.append('=');
        sb.append(((this.district == null)?"<null>":this.district));
        sb.append(',');
        sb.append("university");
        sb.append('=');
        sb.append(((this.university == null)?"<null>":this.university));
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
        result = ((result* 31)+((this.high == null)? 0 :this.high.hashCode()));
        result = ((result* 31)+((this.middle == null)? 0 :this.middle.hashCode()));
        result = ((result* 31)+((this._private == null)? 0 :this._private.hashCode()));
        result = ((result* 31)+((this.university == null)? 0 :this.university.hashCode()));
        result = ((result* 31)+((this.district == null)? 0 :this.district.hashCode()));
        result = ((result* 31)+((this.elementary == null)? 0 :this.elementary.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Schools) == false) {
            return false;
        }
        Schools rhs = ((Schools) other);
        return ((((((((this.high == rhs.high)||((this.high!= null)&&this.high.equals(rhs.high)))&&((this.middle == rhs.middle)||((this.middle!= null)&&this.middle.equals(rhs.middle))))&&((this._private == rhs._private)||((this._private!= null)&&this._private.equals(rhs._private))))&&((this.university == rhs.university)||((this.university!= null)&&this.university.equals(rhs.university))))&&((this.district == rhs.district)||((this.district!= null)&&this.district.equals(rhs.district))))&&((this.elementary == rhs.elementary)||((this.elementary!= null)&&this.elementary.equals(rhs.elementary))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
