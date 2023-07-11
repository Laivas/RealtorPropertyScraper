
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
    "bath",
    "bed",
    "featureTags",
    "propertyType",
    "listingStatus",
    "pets",
    "homeSize",
    "expand",
    "price",
    "homeAge",
    "daysOnRealtor",
    "lotSize",
    "keyword",
    "hoa",
    "commute",
    "showPending",
    "threeDimensionalTours",
    "moveInDate",
    "builder"
})
@Generated("jsonschema2pojo")
public class Filters {

    @JsonProperty("bath")
    private Bath bath;
    @JsonProperty("bed")
    private Bed bed;
    @JsonProperty("featureTags")
    private FeatureTags featureTags;
    @JsonProperty("propertyType")
    private PropertyType propertyType;
    @JsonProperty("listingStatus")
    private ListingStatus listingStatus;
    @JsonProperty("pets")
    private Pets pets;
    @JsonProperty("homeSize")
    private HomeSize homeSize;
    @JsonProperty("expand")
    private Expand expand;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("homeAge")
    private HomeAge homeAge;
    @JsonProperty("daysOnRealtor")
    private DaysOnRealtor daysOnRealtor;
    @JsonProperty("lotSize")
    private LotSize lotSize;
    @JsonProperty("keyword")
    private Keyword keyword;
    @JsonProperty("hoa")
    private Hoa hoa;
    @JsonProperty("commute")
    private Commute commute;
    @JsonProperty("showPending")
    private Boolean showPending;
    @JsonProperty("threeDimensionalTours")
    private Boolean threeDimensionalTours;
    @JsonProperty("moveInDate")
    private MoveInDate moveInDate;
    @JsonProperty("builder")
    private Builder builder;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("bath")
    public Bath getBath() {
        return bath;
    }

    @JsonProperty("bath")
    public void setBath(Bath bath) {
        this.bath = bath;
    }

    @JsonProperty("bed")
    public Bed getBed() {
        return bed;
    }

    @JsonProperty("bed")
    public void setBed(Bed bed) {
        this.bed = bed;
    }

    @JsonProperty("featureTags")
    public FeatureTags getFeatureTags() {
        return featureTags;
    }

    @JsonProperty("featureTags")
    public void setFeatureTags(FeatureTags featureTags) {
        this.featureTags = featureTags;
    }

    @JsonProperty("propertyType")
    public PropertyType getPropertyType() {
        return propertyType;
    }

    @JsonProperty("propertyType")
    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    @JsonProperty("listingStatus")
    public ListingStatus getListingStatus() {
        return listingStatus;
    }

    @JsonProperty("listingStatus")
    public void setListingStatus(ListingStatus listingStatus) {
        this.listingStatus = listingStatus;
    }

    @JsonProperty("pets")
    public Pets getPets() {
        return pets;
    }

    @JsonProperty("pets")
    public void setPets(Pets pets) {
        this.pets = pets;
    }

    @JsonProperty("homeSize")
    public HomeSize getHomeSize() {
        return homeSize;
    }

    @JsonProperty("homeSize")
    public void setHomeSize(HomeSize homeSize) {
        this.homeSize = homeSize;
    }

    @JsonProperty("expand")
    public Expand getExpand() {
        return expand;
    }

    @JsonProperty("expand")
    public void setExpand(Expand expand) {
        this.expand = expand;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("homeAge")
    public HomeAge getHomeAge() {
        return homeAge;
    }

    @JsonProperty("homeAge")
    public void setHomeAge(HomeAge homeAge) {
        this.homeAge = homeAge;
    }

    @JsonProperty("daysOnRealtor")
    public DaysOnRealtor getDaysOnRealtor() {
        return daysOnRealtor;
    }

    @JsonProperty("daysOnRealtor")
    public void setDaysOnRealtor(DaysOnRealtor daysOnRealtor) {
        this.daysOnRealtor = daysOnRealtor;
    }

    @JsonProperty("lotSize")
    public LotSize getLotSize() {
        return lotSize;
    }

    @JsonProperty("lotSize")
    public void setLotSize(LotSize lotSize) {
        this.lotSize = lotSize;
    }

    @JsonProperty("keyword")
    public Keyword getKeyword() {
        return keyword;
    }

    @JsonProperty("keyword")
    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    @JsonProperty("hoa")
    public Hoa getHoa() {
        return hoa;
    }

    @JsonProperty("hoa")
    public void setHoa(Hoa hoa) {
        this.hoa = hoa;
    }

    @JsonProperty("commute")
    public Commute getCommute() {
        return commute;
    }

    @JsonProperty("commute")
    public void setCommute(Commute commute) {
        this.commute = commute;
    }

    @JsonProperty("showPending")
    public Boolean getShowPending() {
        return showPending;
    }

    @JsonProperty("showPending")
    public void setShowPending(Boolean showPending) {
        this.showPending = showPending;
    }

    @JsonProperty("threeDimensionalTours")
    public Boolean getThreeDimensionalTours() {
        return threeDimensionalTours;
    }

    @JsonProperty("threeDimensionalTours")
    public void setThreeDimensionalTours(Boolean threeDimensionalTours) {
        this.threeDimensionalTours = threeDimensionalTours;
    }

    @JsonProperty("moveInDate")
    public MoveInDate getMoveInDate() {
        return moveInDate;
    }

    @JsonProperty("moveInDate")
    public void setMoveInDate(MoveInDate moveInDate) {
        this.moveInDate = moveInDate;
    }

    @JsonProperty("builder")
    public Builder getBuilder() {
        return builder;
    }

    @JsonProperty("builder")
    public void setBuilder(Builder builder) {
        this.builder = builder;
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
        sb.append(Filters.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bath");
        sb.append('=');
        sb.append(((this.bath == null)?"<null>":this.bath));
        sb.append(',');
        sb.append("bed");
        sb.append('=');
        sb.append(((this.bed == null)?"<null>":this.bed));
        sb.append(',');
        sb.append("featureTags");
        sb.append('=');
        sb.append(((this.featureTags == null)?"<null>":this.featureTags));
        sb.append(',');
        sb.append("propertyType");
        sb.append('=');
        sb.append(((this.propertyType == null)?"<null>":this.propertyType));
        sb.append(',');
        sb.append("listingStatus");
        sb.append('=');
        sb.append(((this.listingStatus == null)?"<null>":this.listingStatus));
        sb.append(',');
        sb.append("pets");
        sb.append('=');
        sb.append(((this.pets == null)?"<null>":this.pets));
        sb.append(',');
        sb.append("homeSize");
        sb.append('=');
        sb.append(((this.homeSize == null)?"<null>":this.homeSize));
        sb.append(',');
        sb.append("expand");
        sb.append('=');
        sb.append(((this.expand == null)?"<null>":this.expand));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("homeAge");
        sb.append('=');
        sb.append(((this.homeAge == null)?"<null>":this.homeAge));
        sb.append(',');
        sb.append("daysOnRealtor");
        sb.append('=');
        sb.append(((this.daysOnRealtor == null)?"<null>":this.daysOnRealtor));
        sb.append(',');
        sb.append("lotSize");
        sb.append('=');
        sb.append(((this.lotSize == null)?"<null>":this.lotSize));
        sb.append(',');
        sb.append("keyword");
        sb.append('=');
        sb.append(((this.keyword == null)?"<null>":this.keyword));
        sb.append(',');
        sb.append("hoa");
        sb.append('=');
        sb.append(((this.hoa == null)?"<null>":this.hoa));
        sb.append(',');
        sb.append("commute");
        sb.append('=');
        sb.append(((this.commute == null)?"<null>":this.commute));
        sb.append(',');
        sb.append("showPending");
        sb.append('=');
        sb.append(((this.showPending == null)?"<null>":this.showPending));
        sb.append(',');
        sb.append("threeDimensionalTours");
        sb.append('=');
        sb.append(((this.threeDimensionalTours == null)?"<null>":this.threeDimensionalTours));
        sb.append(',');
        sb.append("moveInDate");
        sb.append('=');
        sb.append(((this.moveInDate == null)?"<null>":this.moveInDate));
        sb.append(',');
        sb.append("builder");
        sb.append('=');
        sb.append(((this.builder == null)?"<null>":this.builder));
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
        result = ((result* 31)+((this.bed == null)? 0 :this.bed.hashCode()));
        result = ((result* 31)+((this.pets == null)? 0 :this.pets.hashCode()));
        result = ((result* 31)+((this.homeAge == null)? 0 :this.homeAge.hashCode()));
        result = ((result* 31)+((this.homeSize == null)? 0 :this.homeSize.hashCode()));
        result = ((result* 31)+((this.lotSize == null)? 0 :this.lotSize.hashCode()));
        result = ((result* 31)+((this.featureTags == null)? 0 :this.featureTags.hashCode()));
        result = ((result* 31)+((this.showPending == null)? 0 :this.showPending.hashCode()));
        result = ((result* 31)+((this.threeDimensionalTours == null)? 0 :this.threeDimensionalTours.hashCode()));
        result = ((result* 31)+((this.expand == null)? 0 :this.expand.hashCode()));
        result = ((result* 31)+((this.daysOnRealtor == null)? 0 :this.daysOnRealtor.hashCode()));
        result = ((result* 31)+((this.moveInDate == null)? 0 :this.moveInDate.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.propertyType == null)? 0 :this.propertyType.hashCode()));
        result = ((result* 31)+((this.listingStatus == null)? 0 :this.listingStatus.hashCode()));
        result = ((result* 31)+((this.builder == null)? 0 :this.builder.hashCode()));
        result = ((result* 31)+((this.hoa == null)? 0 :this.hoa.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyword == null)? 0 :this.keyword.hashCode()));
        result = ((result* 31)+((this.commute == null)? 0 :this.commute.hashCode()));
        result = ((result* 31)+((this.bath == null)? 0 :this.bath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Filters) == false) {
            return false;
        }
        Filters rhs = ((Filters) other);
        return (((((((((((((((((((((this.bed == rhs.bed)||((this.bed!= null)&&this.bed.equals(rhs.bed)))&&((this.pets == rhs.pets)||((this.pets!= null)&&this.pets.equals(rhs.pets))))&&((this.homeAge == rhs.homeAge)||((this.homeAge!= null)&&this.homeAge.equals(rhs.homeAge))))&&((this.homeSize == rhs.homeSize)||((this.homeSize!= null)&&this.homeSize.equals(rhs.homeSize))))&&((this.lotSize == rhs.lotSize)||((this.lotSize!= null)&&this.lotSize.equals(rhs.lotSize))))&&((this.featureTags == rhs.featureTags)||((this.featureTags!= null)&&this.featureTags.equals(rhs.featureTags))))&&((this.showPending == rhs.showPending)||((this.showPending!= null)&&this.showPending.equals(rhs.showPending))))&&((this.threeDimensionalTours == rhs.threeDimensionalTours)||((this.threeDimensionalTours!= null)&&this.threeDimensionalTours.equals(rhs.threeDimensionalTours))))&&((this.expand == rhs.expand)||((this.expand!= null)&&this.expand.equals(rhs.expand))))&&((this.daysOnRealtor == rhs.daysOnRealtor)||((this.daysOnRealtor!= null)&&this.daysOnRealtor.equals(rhs.daysOnRealtor))))&&((this.moveInDate == rhs.moveInDate)||((this.moveInDate!= null)&&this.moveInDate.equals(rhs.moveInDate))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.propertyType == rhs.propertyType)||((this.propertyType!= null)&&this.propertyType.equals(rhs.propertyType))))&&((this.listingStatus == rhs.listingStatus)||((this.listingStatus!= null)&&this.listingStatus.equals(rhs.listingStatus))))&&((this.builder == rhs.builder)||((this.builder!= null)&&this.builder.equals(rhs.builder))))&&((this.hoa == rhs.hoa)||((this.hoa!= null)&&this.hoa.equals(rhs.hoa))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyword == rhs.keyword)||((this.keyword!= null)&&this.keyword.equals(rhs.keyword))))&&((this.commute == rhs.commute)||((this.commute!= null)&&this.commute.equals(rhs.commute))))&&((this.bath == rhs.bath)||((this.bath!= null)&&this.bath.equals(rhs.bath))));
    }

}
