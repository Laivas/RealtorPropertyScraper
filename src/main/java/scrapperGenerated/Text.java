
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
    "ques",
    "ans"
})
@Generated("jsonschema2pojo")
public class Text {

    @JsonProperty("ques")
    private String ques;
    @JsonProperty("ans")
    private String ans;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ques")
    public String getQues() {
        return ques;
    }

    @JsonProperty("ques")
    public void setQues(String ques) {
        this.ques = ques;
    }

    @JsonProperty("ans")
    public String getAns() {
        return ans;
    }

    @JsonProperty("ans")
    public void setAns(String ans) {
        this.ans = ans;
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
        sb.append(Text.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ques");
        sb.append('=');
        sb.append(((this.ques == null)?"<null>":this.ques));
        sb.append(',');
        sb.append("ans");
        sb.append('=');
        sb.append(((this.ans == null)?"<null>":this.ans));
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
        result = ((result* 31)+((this.ques == null)? 0 :this.ques.hashCode()));
        result = ((result* 31)+((this.ans == null)? 0 :this.ans.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Text) == false) {
            return false;
        }
        Text rhs = ((Text) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.ques == rhs.ques)||((this.ques!= null)&&this.ques.equals(rhs.ques))))&&((this.ans == rhs.ans)||((this.ans!= null)&&this.ans.equals(rhs.ans))));
    }

}
