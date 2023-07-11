
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
    "builderList",
    "selectedBuilders",
    "searchedBuilders"
})
@Generated("jsonschema2pojo")
public class Builder {

    @JsonProperty("builderList")
    private List<Object> builderList = new ArrayList<Object>();
    @JsonProperty("selectedBuilders")
    private List<Object> selectedBuilders = new ArrayList<Object>();
    @JsonProperty("searchedBuilders")
    private List<Object> searchedBuilders = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("builderList")
    public List<Object> getBuilderList() {
        return builderList;
    }

    @JsonProperty("builderList")
    public void setBuilderList(List<Object> builderList) {
        this.builderList = builderList;
    }

    @JsonProperty("selectedBuilders")
    public List<Object> getSelectedBuilders() {
        return selectedBuilders;
    }

    @JsonProperty("selectedBuilders")
    public void setSelectedBuilders(List<Object> selectedBuilders) {
        this.selectedBuilders = selectedBuilders;
    }

    @JsonProperty("searchedBuilders")
    public List<Object> getSearchedBuilders() {
        return searchedBuilders;
    }

    @JsonProperty("searchedBuilders")
    public void setSearchedBuilders(List<Object> searchedBuilders) {
        this.searchedBuilders = searchedBuilders;
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
        sb.append(Builder.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("builderList");
        sb.append('=');
        sb.append(((this.builderList == null)?"<null>":this.builderList));
        sb.append(',');
        sb.append("selectedBuilders");
        sb.append('=');
        sb.append(((this.selectedBuilders == null)?"<null>":this.selectedBuilders));
        sb.append(',');
        sb.append("searchedBuilders");
        sb.append('=');
        sb.append(((this.searchedBuilders == null)?"<null>":this.searchedBuilders));
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
        result = ((result* 31)+((this.builderList == null)? 0 :this.builderList.hashCode()));
        result = ((result* 31)+((this.searchedBuilders == null)? 0 :this.searchedBuilders.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.selectedBuilders == null)? 0 :this.selectedBuilders.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Builder) == false) {
            return false;
        }
        Builder rhs = ((Builder) other);
        return (((((this.builderList == rhs.builderList)||((this.builderList!= null)&&this.builderList.equals(rhs.builderList)))&&((this.searchedBuilders == rhs.searchedBuilders)||((this.searchedBuilders!= null)&&this.searchedBuilders.equals(rhs.searchedBuilders))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.selectedBuilders == rhs.selectedBuilders)||((this.selectedBuilders!= null)&&this.selectedBuilders.equals(rhs.selectedBuilders))));
    }

}
