
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
    "property_id",
    "list_price",
    "description",
    "primary_photo",
    "permalink",
    "href",
    "flags",
    "location",
    "open_houses",
    "sentences_list"
})
@Generated("jsonschema2pojo")
public class SpecialFeature {

    @JsonProperty("property_id")
    private String propertyId;
    @JsonProperty("list_price")
    private Integer listPrice;
    @JsonProperty("description")
    private Description__1 description;
    @JsonProperty("primary_photo")
    private PrimaryPhoto__1 primaryPhoto;
    @JsonProperty("permalink")
    private String permalink;
    @JsonProperty("href")
    private String href;
    @JsonProperty("flags")
    private Flags__1 flags;
    @JsonProperty("location")
    private Location__1 location;
    @JsonProperty("open_houses")
    private Object openHouses;
    @JsonProperty("sentences_list")
    private List<Sentences> sentencesList = new ArrayList<Sentences>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("property_id")
    public String getPropertyId() {
        return propertyId;
    }

    @JsonProperty("property_id")
    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    @JsonProperty("list_price")
    public Integer getListPrice() {
        return listPrice;
    }

    @JsonProperty("list_price")
    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    @JsonProperty("description")
    public Description__1 getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Description__1 description) {
        this.description = description;
    }

    @JsonProperty("primary_photo")
    public PrimaryPhoto__1 getPrimaryPhoto() {
        return primaryPhoto;
    }

    @JsonProperty("primary_photo")
    public void setPrimaryPhoto(PrimaryPhoto__1 primaryPhoto) {
        this.primaryPhoto = primaryPhoto;
    }

    @JsonProperty("permalink")
    public String getPermalink() {
        return permalink;
    }

    @JsonProperty("permalink")
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("flags")
    public Flags__1 getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(Flags__1 flags) {
        this.flags = flags;
    }

    @JsonProperty("location")
    public Location__1 getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location__1 location) {
        this.location = location;
    }

    @JsonProperty("open_houses")
    public Object getOpenHouses() {
        return openHouses;
    }

    @JsonProperty("open_houses")
    public void setOpenHouses(Object openHouses) {
        this.openHouses = openHouses;
    }

    @JsonProperty("sentences_list")
    public List<Sentences> getSentencesList() {
        return sentencesList;
    }

    @JsonProperty("sentences_list")
    public void setSentencesList(List<Sentences> sentencesList) {
        this.sentencesList = sentencesList;
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
        sb.append(SpecialFeature.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("propertyId");
        sb.append('=');
        sb.append(((this.propertyId == null)?"<null>":this.propertyId));
        sb.append(',');
        sb.append("listPrice");
        sb.append('=');
        sb.append(((this.listPrice == null)?"<null>":this.listPrice));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("primaryPhoto");
        sb.append('=');
        sb.append(((this.primaryPhoto == null)?"<null>":this.primaryPhoto));
        sb.append(',');
        sb.append("permalink");
        sb.append('=');
        sb.append(((this.permalink == null)?"<null>":this.permalink));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("flags");
        sb.append('=');
        sb.append(((this.flags == null)?"<null>":this.flags));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("openHouses");
        sb.append('=');
        sb.append(((this.openHouses == null)?"<null>":this.openHouses));
        sb.append(',');
        sb.append("sentencesList");
        sb.append('=');
        sb.append(((this.sentencesList == null)?"<null>":this.sentencesList));
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
        result = ((result* 31)+((this.openHouses == null)? 0 :this.openHouses.hashCode()));
        result = ((result* 31)+((this.sentencesList == null)? 0 :this.sentencesList.hashCode()));
        result = ((result* 31)+((this.flags == null)? 0 :this.flags.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.permalink == null)? 0 :this.permalink.hashCode()));
        result = ((result* 31)+((this.propertyId == null)? 0 :this.propertyId.hashCode()));
        result = ((result* 31)+((this.primaryPhoto == null)? 0 :this.primaryPhoto.hashCode()));
        result = ((result* 31)+((this.listPrice == null)? 0 :this.listPrice.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpecialFeature) == false) {
            return false;
        }
        SpecialFeature rhs = ((SpecialFeature) other);
        return ((((((((((((this.openHouses == rhs.openHouses)||((this.openHouses!= null)&&this.openHouses.equals(rhs.openHouses)))&&((this.sentencesList == rhs.sentencesList)||((this.sentencesList!= null)&&this.sentencesList.equals(rhs.sentencesList))))&&((this.flags == rhs.flags)||((this.flags!= null)&&this.flags.equals(rhs.flags))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.permalink == rhs.permalink)||((this.permalink!= null)&&this.permalink.equals(rhs.permalink))))&&((this.propertyId == rhs.propertyId)||((this.propertyId!= null)&&this.propertyId.equals(rhs.propertyId))))&&((this.primaryPhoto == rhs.primaryPhoto)||((this.primaryPhoto!= null)&&this.primaryPhoto.equals(rhs.primaryPhoto))))&&((this.listPrice == rhs.listPrice)||((this.listPrice!= null)&&this.listPrice.equals(rhs.listPrice))));
    }

}
