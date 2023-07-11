
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
    "neighborhood",
    "city",
    "state_code",
    "geo_type",
    "slug_id",
    "geo_statistics"
})
@Generated("jsonschema2pojo")
public class Geo__2 {

    @JsonProperty("neighborhood")
    private String neighborhood;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("geo_type")
    private String geoType;
    @JsonProperty("slug_id")
    private String slugId;
    @JsonProperty("geo_statistics")
    private GeoStatistics__2 geoStatistics;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("neighborhood")
    public String getNeighborhood() {
        return neighborhood;
    }

    @JsonProperty("neighborhood")
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state_code")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("state_code")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
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
    public GeoStatistics__2 getGeoStatistics() {
        return geoStatistics;
    }

    @JsonProperty("geo_statistics")
    public void setGeoStatistics(GeoStatistics__2 geoStatistics) {
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
        sb.append(Geo__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("neighborhood");
        sb.append('=');
        sb.append(((this.neighborhood == null)?"<null>":this.neighborhood));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("stateCode");
        sb.append('=');
        sb.append(((this.stateCode == null)?"<null>":this.stateCode));
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
        result = ((result* 31)+((this.geoType == null)? 0 :this.geoType.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.stateCode == null)? 0 :this.stateCode.hashCode()));
        result = ((result* 31)+((this.neighborhood == null)? 0 :this.neighborhood.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Geo__2) == false) {
            return false;
        }
        Geo__2 rhs = ((Geo__2) other);
        return ((((((((this.geoStatistics == rhs.geoStatistics)||((this.geoStatistics!= null)&&this.geoStatistics.equals(rhs.geoStatistics)))&&((this.slugId == rhs.slugId)||((this.slugId!= null)&&this.slugId.equals(rhs.slugId))))&&((this.geoType == rhs.geoType)||((this.geoType!= null)&&this.geoType.equals(rhs.geoType))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.stateCode == rhs.stateCode)||((this.stateCode!= null)&&this.stateCode.equals(rhs.stateCode))))&&((this.neighborhood == rhs.neighborhood)||((this.neighborhood!= null)&&this.neighborhood.equals(rhs.neighborhood))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
