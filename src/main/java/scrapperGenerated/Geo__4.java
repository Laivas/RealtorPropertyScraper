
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
    "postal_code",
    "geo_type",
    "slug_id",
    "geo_statistics"
})
@Generated("jsonschema2pojo")
public class Geo__4 {

    @JsonProperty("postal_code")
    private String postalCode;
    @JsonProperty("geo_type")
    private String geoType;
    @JsonProperty("slug_id")
    private String slugId;
    @JsonProperty("geo_statistics")
    private GeoStatistics__4 geoStatistics;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("geo_type")
    public String getGeoType() {
        return geoType;
    }

    @JsonProperty("geo_type")
    public void setGeoType(String geoType) {
        this.geoType = geoType;
    }

    @JsonProperty("slug_id")
    public String getSlugId() {
        return slugId;
    }

    @JsonProperty("slug_id")
    public void setSlugId(String slugId) {
        this.slugId = slugId;
    }

    @JsonProperty("geo_statistics")
    public GeoStatistics__4 getGeoStatistics() {
        return geoStatistics;
    }

    @JsonProperty("geo_statistics")
    public void setGeoStatistics(GeoStatistics__4 geoStatistics) {
        this.geoStatistics = geoStatistics;
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
        sb.append(Geo__4 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("geoType");
        sb.append('=');
        sb.append(((this.geoType == null)?"<null>":this.geoType));
        sb.append(',');
        sb.append("slugId");
        sb.append('=');
        sb.append(((this.slugId == null)?"<null>":this.slugId));
        sb.append(',');
        sb.append("geoStatistics");
        sb.append('=');
        sb.append(((this.geoStatistics == null)?"<null>":this.geoStatistics));
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
        result = ((result* 31)+((this.geoStatistics == null)? 0 :this.geoStatistics.hashCode()));
        result = ((result* 31)+((this.slugId == null)? 0 :this.slugId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.geoType == null)? 0 :this.geoType.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Geo__4) == false) {
            return false;
        }
        Geo__4 rhs = ((Geo__4) other);
        return ((((((this.geoStatistics == rhs.geoStatistics)||((this.geoStatistics!= null)&&this.geoStatistics.equals(rhs.geoStatistics)))&&((this.slugId == rhs.slugId)||((this.slugId!= null)&&this.slugId.equals(rhs.slugId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.geoType == rhs.geoType)||((this.geoType!= null)&&this.geoType.equals(rhs.geoType))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))));
    }

}
