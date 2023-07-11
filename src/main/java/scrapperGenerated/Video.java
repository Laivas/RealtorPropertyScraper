
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
    "id",
    "title",
    "video_url",
    "video_details_url_path",
    "seo_description",
    "secure_thumbnail_url"
})
@Generated("jsonschema2pojo")
public class Video {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("video_url")
    private String videoUrl;
    @JsonProperty("video_details_url_path")
    private String videoDetailsUrlPath;
    @JsonProperty("seo_description")
    private String seoDescription;
    @JsonProperty("secure_thumbnail_url")
    private String secureThumbnailUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("video_url")
    public String getVideoUrl() {
        return videoUrl;
    }

    @JsonProperty("video_url")
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @JsonProperty("video_details_url_path")
    public String getVideoDetailsUrlPath() {
        return videoDetailsUrlPath;
    }

    @JsonProperty("video_details_url_path")
    public void setVideoDetailsUrlPath(String videoDetailsUrlPath) {
        this.videoDetailsUrlPath = videoDetailsUrlPath;
    }

    @JsonProperty("seo_description")
    public String getSeoDescription() {
        return seoDescription;
    }

    @JsonProperty("seo_description")
    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    @JsonProperty("secure_thumbnail_url")
    public String getSecureThumbnailUrl() {
        return secureThumbnailUrl;
    }

    @JsonProperty("secure_thumbnail_url")
    public void setSecureThumbnailUrl(String secureThumbnailUrl) {
        this.secureThumbnailUrl = secureThumbnailUrl;
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
        sb.append(Video.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("videoUrl");
        sb.append('=');
        sb.append(((this.videoUrl == null)?"<null>":this.videoUrl));
        sb.append(',');
        sb.append("videoDetailsUrlPath");
        sb.append('=');
        sb.append(((this.videoDetailsUrlPath == null)?"<null>":this.videoDetailsUrlPath));
        sb.append(',');
        sb.append("seoDescription");
        sb.append('=');
        sb.append(((this.seoDescription == null)?"<null>":this.seoDescription));
        sb.append(',');
        sb.append("secureThumbnailUrl");
        sb.append('=');
        sb.append(((this.secureThumbnailUrl == null)?"<null>":this.secureThumbnailUrl));
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
        result = ((result* 31)+((this.secureThumbnailUrl == null)? 0 :this.secureThumbnailUrl.hashCode()));
        result = ((result* 31)+((this.videoUrl == null)? 0 :this.videoUrl.hashCode()));
        result = ((result* 31)+((this.seoDescription == null)? 0 :this.seoDescription.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.videoDetailsUrlPath == null)? 0 :this.videoDetailsUrlPath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Video) == false) {
            return false;
        }
        Video rhs = ((Video) other);
        return ((((((((this.secureThumbnailUrl == rhs.secureThumbnailUrl)||((this.secureThumbnailUrl!= null)&&this.secureThumbnailUrl.equals(rhs.secureThumbnailUrl)))&&((this.videoUrl == rhs.videoUrl)||((this.videoUrl!= null)&&this.videoUrl.equals(rhs.videoUrl))))&&((this.seoDescription == rhs.seoDescription)||((this.seoDescription!= null)&&this.seoDescription.equals(rhs.seoDescription))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.videoDetailsUrlPath == rhs.videoDetailsUrlPath)||((this.videoDetailsUrlPath!= null)&&this.videoDetailsUrlPath.equals(rhs.videoDetailsUrlPath))));
    }

}
