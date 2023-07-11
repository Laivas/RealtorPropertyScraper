
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
    "parents",
    "geo_statistics",
    "recommended_cities",
    "recommended_neighborhoods",
    "recommended_counties",
    "recommended_zips"
})
@Generated("jsonschema2pojo")
public class GeoStats {

    @JsonProperty("parents")
    private List<Parent> parents = new ArrayList<Parent>();
    @JsonProperty("geo_statistics")
    private GeoStatistics geoStatistics;
    @JsonProperty("recommended_cities")
    private RecommendedCities recommendedCities;
    @JsonProperty("recommended_neighborhoods")
    private RecommendedNeighborhoods recommendedNeighborhoods;
    @JsonProperty("recommended_counties")
    private RecommendedCounties recommendedCounties;
    @JsonProperty("recommended_zips")
    private RecommendedZips recommendedZips;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("parents")
    public List<Parent> getParents() {
        return parents;
    }

    @JsonProperty("parents")
    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    @JsonProperty("geo_statistics")
    public GeoStatistics getGeoStatistics() {
        return geoStatistics;
    }

    @JsonProperty("geo_statistics")
    public void setGeoStatistics(GeoStatistics geoStatistics) {
        this.geoStatistics = geoStatistics;
    }

    @JsonProperty("recommended_cities")
    public RecommendedCities getRecommendedCities() {
        return recommendedCities;
    }

    @JsonProperty("recommended_cities")
    public void setRecommendedCities(RecommendedCities recommendedCities) {
        this.recommendedCities = recommendedCities;
    }

    @JsonProperty("recommended_neighborhoods")
    public RecommendedNeighborhoods getRecommendedNeighborhoods() {
        return recommendedNeighborhoods;
    }

    @JsonProperty("recommended_neighborhoods")
    public void setRecommendedNeighborhoods(RecommendedNeighborhoods recommendedNeighborhoods) {
        this.recommendedNeighborhoods = recommendedNeighborhoods;
    }

    @JsonProperty("recommended_counties")
    public RecommendedCounties getRecommendedCounties() {
        return recommendedCounties;
    }

    @JsonProperty("recommended_counties")
    public void setRecommendedCounties(RecommendedCounties recommendedCounties) {
        this.recommendedCounties = recommendedCounties;
    }

    @JsonProperty("recommended_zips")
    public RecommendedZips getRecommendedZips() {
        return recommendedZips;
    }

    @JsonProperty("recommended_zips")
    public void setRecommendedZips(RecommendedZips recommendedZips) {
        this.recommendedZips = recommendedZips;
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
        sb.append(GeoStats.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("parents");
        sb.append('=');
        sb.append(((this.parents == null)?"<null>":this.parents));
        sb.append(',');
        sb.append("geoStatistics");
        sb.append('=');
        sb.append(((this.geoStatistics == null)?"<null>":this.geoStatistics));
        sb.append(',');
        sb.append("recommendedCities");
        sb.append('=');
        sb.append(((this.recommendedCities == null)?"<null>":this.recommendedCities));
        sb.append(',');
        sb.append("recommendedNeighborhoods");
        sb.append('=');
        sb.append(((this.recommendedNeighborhoods == null)?"<null>":this.recommendedNeighborhoods));
        sb.append(',');
        sb.append("recommendedCounties");
        sb.append('=');
        sb.append(((this.recommendedCounties == null)?"<null>":this.recommendedCounties));
        sb.append(',');
        sb.append("recommendedZips");
        sb.append('=');
        sb.append(((this.recommendedZips == null)?"<null>":this.recommendedZips));
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
        result = ((result* 31)+((this.recommendedCities == null)? 0 :this.recommendedCities.hashCode()));
        result = ((result* 31)+((this.recommendedNeighborhoods == null)? 0 :this.recommendedNeighborhoods.hashCode()));
        result = ((result* 31)+((this.recommendedCounties == null)? 0 :this.recommendedCounties.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.parents == null)? 0 :this.parents.hashCode()));
        result = ((result* 31)+((this.recommendedZips == null)? 0 :this.recommendedZips.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoStats) == false) {
            return false;
        }
        GeoStats rhs = ((GeoStats) other);
        return ((((((((this.geoStatistics == rhs.geoStatistics)||((this.geoStatistics!= null)&&this.geoStatistics.equals(rhs.geoStatistics)))&&((this.recommendedCities == rhs.recommendedCities)||((this.recommendedCities!= null)&&this.recommendedCities.equals(rhs.recommendedCities))))&&((this.recommendedNeighborhoods == rhs.recommendedNeighborhoods)||((this.recommendedNeighborhoods!= null)&&this.recommendedNeighborhoods.equals(rhs.recommendedNeighborhoods))))&&((this.recommendedCounties == rhs.recommendedCounties)||((this.recommendedCounties!= null)&&this.recommendedCounties.equals(rhs.recommendedCounties))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.parents == rhs.parents)||((this.parents!= null)&&this.parents.equals(rhs.parents))))&&((this.recommendedZips == rhs.recommendedZips)||((this.recommendedZips!= null)&&this.recommendedZips.equals(rhs.recommendedZips))));
    }

}
