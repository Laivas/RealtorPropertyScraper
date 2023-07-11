
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
    "specialFeatures",
    "popularSearches",
    "schools",
    "propertyTypes",
    "topRealEstateMarkets",
    "howToBuyVideos"
})
@Generated("jsonschema2pojo")
public class WidgetsData {

    @JsonProperty("specialFeatures")
    private List<SpecialFeature> specialFeatures = new ArrayList<SpecialFeature>();
    @JsonProperty("popularSearches")
    private PopularSearches popularSearches;
    @JsonProperty("schools")
    private Schools schools;
    @JsonProperty("propertyTypes")
    private PropertyTypes propertyTypes;
    @JsonProperty("topRealEstateMarkets")
    private TopRealEstateMarkets topRealEstateMarkets;
    @JsonProperty("howToBuyVideos")
    private HowToBuyVideos howToBuyVideos;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("specialFeatures")
    public List<SpecialFeature> getSpecialFeatures() {
        return specialFeatures;
    }

    @JsonProperty("specialFeatures")
    public void setSpecialFeatures(List<SpecialFeature> specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    @JsonProperty("popularSearches")
    public PopularSearches getPopularSearches() {
        return popularSearches;
    }

    @JsonProperty("popularSearches")
    public void setPopularSearches(PopularSearches popularSearches) {
        this.popularSearches = popularSearches;
    }

    @JsonProperty("schools")
    public Schools getSchools() {
        return schools;
    }

    @JsonProperty("schools")
    public void setSchools(Schools schools) {
        this.schools = schools;
    }

    @JsonProperty("propertyTypes")
    public PropertyTypes getPropertyTypes() {
        return propertyTypes;
    }

    @JsonProperty("propertyTypes")
    public void setPropertyTypes(PropertyTypes propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    @JsonProperty("topRealEstateMarkets")
    public TopRealEstateMarkets getTopRealEstateMarkets() {
        return topRealEstateMarkets;
    }

    @JsonProperty("topRealEstateMarkets")
    public void setTopRealEstateMarkets(TopRealEstateMarkets topRealEstateMarkets) {
        this.topRealEstateMarkets = topRealEstateMarkets;
    }

    @JsonProperty("howToBuyVideos")
    public HowToBuyVideos getHowToBuyVideos() {
        return howToBuyVideos;
    }

    @JsonProperty("howToBuyVideos")
    public void setHowToBuyVideos(HowToBuyVideos howToBuyVideos) {
        this.howToBuyVideos = howToBuyVideos;
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
        sb.append(WidgetsData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("specialFeatures");
        sb.append('=');
        sb.append(((this.specialFeatures == null)?"<null>":this.specialFeatures));
        sb.append(',');
        sb.append("popularSearches");
        sb.append('=');
        sb.append(((this.popularSearches == null)?"<null>":this.popularSearches));
        sb.append(',');
        sb.append("schools");
        sb.append('=');
        sb.append(((this.schools == null)?"<null>":this.schools));
        sb.append(',');
        sb.append("propertyTypes");
        sb.append('=');
        sb.append(((this.propertyTypes == null)?"<null>":this.propertyTypes));
        sb.append(',');
        sb.append("topRealEstateMarkets");
        sb.append('=');
        sb.append(((this.topRealEstateMarkets == null)?"<null>":this.topRealEstateMarkets));
        sb.append(',');
        sb.append("howToBuyVideos");
        sb.append('=');
        sb.append(((this.howToBuyVideos == null)?"<null>":this.howToBuyVideos));
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
        result = ((result* 31)+((this.propertyTypes == null)? 0 :this.propertyTypes.hashCode()));
        result = ((result* 31)+((this.specialFeatures == null)? 0 :this.specialFeatures.hashCode()));
        result = ((result* 31)+((this.topRealEstateMarkets == null)? 0 :this.topRealEstateMarkets.hashCode()));
        result = ((result* 31)+((this.howToBuyVideos == null)? 0 :this.howToBuyVideos.hashCode()));
        result = ((result* 31)+((this.schools == null)? 0 :this.schools.hashCode()));
        result = ((result* 31)+((this.popularSearches == null)? 0 :this.popularSearches.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WidgetsData) == false) {
            return false;
        }
        WidgetsData rhs = ((WidgetsData) other);
        return ((((((((this.propertyTypes == rhs.propertyTypes)||((this.propertyTypes!= null)&&this.propertyTypes.equals(rhs.propertyTypes)))&&((this.specialFeatures == rhs.specialFeatures)||((this.specialFeatures!= null)&&this.specialFeatures.equals(rhs.specialFeatures))))&&((this.topRealEstateMarkets == rhs.topRealEstateMarkets)||((this.topRealEstateMarkets!= null)&&this.topRealEstateMarkets.equals(rhs.topRealEstateMarkets))))&&((this.howToBuyVideos == rhs.howToBuyVideos)||((this.howToBuyVideos!= null)&&this.howToBuyVideos.equals(rhs.howToBuyVideos))))&&((this.schools == rhs.schools)||((this.schools!= null)&&this.schools.equals(rhs.schools))))&&((this.popularSearches == rhs.popularSearches)||((this.popularSearches!= null)&&this.popularSearches.equals(rhs.popularSearches))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
