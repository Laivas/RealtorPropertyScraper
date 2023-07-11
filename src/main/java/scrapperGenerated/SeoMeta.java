
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
    "title",
    "description",
    "canonical_url",
    "header_1",
    "deep_links"
})
@Generated("jsonschema2pojo")
public class SeoMeta {

    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("canonical_url")
    private String canonicalUrl;
    @JsonProperty("header_1")
    private String header1;
    @JsonProperty("deep_links")
    private DeepLinks deepLinks;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("canonical_url")
    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    @JsonProperty("canonical_url")
    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    @JsonProperty("header_1")
    public String getHeader1() {
        return header1;
    }

    @JsonProperty("header_1")
    public void setHeader1(String header1) {
        this.header1 = header1;
    }

    @JsonProperty("deep_links")
    public DeepLinks getDeepLinks() {
        return deepLinks;
    }

    @JsonProperty("deep_links")
    public void setDeepLinks(DeepLinks deepLinks) {
        this.deepLinks = deepLinks;
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
        sb.append(SeoMeta.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("canonicalUrl");
        sb.append('=');
        sb.append(((this.canonicalUrl == null)?"<null>":this.canonicalUrl));
        sb.append(',');
        sb.append("header1");
        sb.append('=');
        sb.append(((this.header1 == null)?"<null>":this.header1));
        sb.append(',');
        sb.append("deepLinks");
        sb.append('=');
        sb.append(((this.deepLinks == null)?"<null>":this.deepLinks));
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
        result = ((result* 31)+((this.header1 == null)? 0 :this.header1 .hashCode()));
        result = ((result* 31)+((this.canonicalUrl == null)? 0 :this.canonicalUrl.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.deepLinks == null)? 0 :this.deepLinks.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SeoMeta) == false) {
            return false;
        }
        SeoMeta rhs = ((SeoMeta) other);
        return (((((((this.header1 == rhs.header1)||((this.header1 != null)&&this.header1 .equals(rhs.header1)))&&((this.canonicalUrl == rhs.canonicalUrl)||((this.canonicalUrl!= null)&&this.canonicalUrl.equals(rhs.canonicalUrl))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.deepLinks == rhs.deepLinks)||((this.deepLinks!= null)&&this.deepLinks.equals(rhs.deepLinks))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
