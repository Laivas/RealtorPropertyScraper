
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
    "searchKey",
    "searchValue"
})
@Generated("jsonschema2pojo")
public class RecommendedFilterDatum {

    @JsonProperty("searchKey")
    private String searchKey;
    @JsonProperty("searchValue")
    private String searchValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("searchKey")
    public String getSearchKey() {
        return searchKey;
    }

    @JsonProperty("searchKey")
    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    @JsonProperty("searchValue")
    public String getSearchValue() {
        return searchValue;
    }

    @JsonProperty("searchValue")
    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
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
        sb.append(RecommendedFilterDatum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("searchKey");
        sb.append('=');
        sb.append(((this.searchKey == null)?"<null>":this.searchKey));
        sb.append(',');
        sb.append("searchValue");
        sb.append('=');
        sb.append(((this.searchValue == null)?"<null>":this.searchValue));
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
        result = ((result* 31)+((this.searchKey == null)? 0 :this.searchKey.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.searchValue == null)? 0 :this.searchValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecommendedFilterDatum) == false) {
            return false;
        }
        RecommendedFilterDatum rhs = ((RecommendedFilterDatum) other);
        return ((((this.searchKey == rhs.searchKey)||((this.searchKey!= null)&&this.searchKey.equals(rhs.searchKey)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.searchValue == rhs.searchValue)||((this.searchValue!= null)&&this.searchValue.equals(rhs.searchValue))));
    }

}
