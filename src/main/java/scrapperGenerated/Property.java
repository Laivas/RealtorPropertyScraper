
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
    "search_promotions",
    "primary_photo",
    "rent_to_own",
    "listing_id",
    "matterport",
    "virtual_tours",
    "status",
    "products",
    "source",
    "lead_attributes",
    "community",
    "permalink",
    "price_reduced_amount",
    "description",
    "location",
    "open_houses",
    "branding",
    "flags",
    "list_date",
    "photos"
})
@Generated("jsonschema2pojo")
public class Property {

    @JsonProperty("property_id")
    private String propertyId;
    @JsonProperty("list_price")
    private Integer listPrice;
    @JsonProperty("search_promotions")
    private Object searchPromotions;
    @JsonProperty("primary_photo")
    private PrimaryPhoto primaryPhoto;
    @JsonProperty("rent_to_own")
    private Object rentToOwn;
    @JsonProperty("listing_id")
    private String listingId;
    @JsonProperty("matterport")
    private Boolean matterport;
    @JsonProperty("virtual_tours")
    private Object virtualTours;
    @JsonProperty("status")
    private String status;
    @JsonProperty("products")
    private Products products;
    @JsonProperty("source")
    private Source source;
    @JsonProperty("lead_attributes")
    private LeadAttributes leadAttributes;
    @JsonProperty("community")
    private Object community;
    @JsonProperty("permalink")
    private String permalink;
    @JsonProperty("price_reduced_amount")
    private Integer priceReducedAmount;
    @JsonProperty("description")
    private Description description;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("open_houses")
    private Object openHouses;
    @JsonProperty("branding")
    private List<Branding> branding = new ArrayList<Branding>();
    @JsonProperty("flags")
    private Flags flags;
    @JsonProperty("list_date")
    private String listDate;
    @JsonProperty("photos")
    private List<Photo> photos = new ArrayList<Photo>();
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

    @JsonProperty("search_promotions")
    public Object getSearchPromotions() {
        return searchPromotions;
    }

    @JsonProperty("search_promotions")
    public void setSearchPromotions(Object searchPromotions) {
        this.searchPromotions = searchPromotions;
    }

    @JsonProperty("primary_photo")
    public PrimaryPhoto getPrimaryPhoto() {
        return primaryPhoto;
    }

    @JsonProperty("primary_photo")
    public void setPrimaryPhoto(PrimaryPhoto primaryPhoto) {
        this.primaryPhoto = primaryPhoto;
    }

    @JsonProperty("rent_to_own")
    public Object getRentToOwn() {
        return rentToOwn;
    }

    @JsonProperty("rent_to_own")
    public void setRentToOwn(Object rentToOwn) {
        this.rentToOwn = rentToOwn;
    }

    @JsonProperty("listing_id")
    public String getListingId() {
        return listingId;
    }

    @JsonProperty("listing_id")
    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    @JsonProperty("matterport")
    public Boolean getMatterport() {
        return matterport;
    }

    @JsonProperty("matterport")
    public void setMatterport(Boolean matterport) {
        this.matterport = matterport;
    }

    @JsonProperty("virtual_tours")
    public Object getVirtualTours() {
        return virtualTours;
    }

    @JsonProperty("virtual_tours")
    public void setVirtualTours(Object virtualTours) {
        this.virtualTours = virtualTours;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("products")
    public Products getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(Products products) {
        this.products = products;
    }

    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    @JsonProperty("lead_attributes")
    public LeadAttributes getLeadAttributes() {
        return leadAttributes;
    }

    @JsonProperty("lead_attributes")
    public void setLeadAttributes(LeadAttributes leadAttributes) {
        this.leadAttributes = leadAttributes;
    }

    @JsonProperty("community")
    public Object getCommunity() {
        return community;
    }

    @JsonProperty("community")
    public void setCommunity(Object community) {
        this.community = community;
    }

    @JsonProperty("permalink")
    public String getPermalink() {
        return permalink;
    }

    @JsonProperty("permalink")
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    @JsonProperty("price_reduced_amount")
    public Integer getPriceReducedAmount() {
        return priceReducedAmount;
    }

    @JsonProperty("price_reduced_amount")
    public void setPriceReducedAmount(Integer priceReducedAmount) {
        this.priceReducedAmount = priceReducedAmount;
    }

    @JsonProperty("description")
    public Description getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Description description) {
        this.description = description;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
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

    @JsonProperty("branding")
    public List<Branding> getBranding() {
        return branding;
    }

    @JsonProperty("branding")
    public void setBranding(List<Branding> branding) {
        this.branding = branding;
    }

    @JsonProperty("flags")
    public Flags getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    @JsonProperty("list_date")
    public String getListDate() {
        return listDate;
    }

    @JsonProperty("list_date")
    public void setListDate(String listDate) {
        this.listDate = listDate;
    }

    @JsonProperty("photos")
    public List<Photo> getPhotos() {
        return photos;
    }

    @JsonProperty("photos")
    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
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
        sb.append(Property.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("propertyId");
        sb.append('=');
        sb.append(((this.propertyId == null)?"<null>":this.propertyId));
        sb.append(',');
        sb.append("listPrice");
        sb.append('=');
        sb.append(((this.listPrice == null)?"<null>":this.listPrice));
        sb.append(',');
        sb.append("searchPromotions");
        sb.append('=');
        sb.append(((this.searchPromotions == null)?"<null>":this.searchPromotions));
        sb.append(',');
        sb.append("primaryPhoto");
        sb.append('=');
        sb.append(((this.primaryPhoto == null)?"<null>":this.primaryPhoto));
        sb.append(',');
        sb.append("rentToOwn");
        sb.append('=');
        sb.append(((this.rentToOwn == null)?"<null>":this.rentToOwn));
        sb.append(',');
        sb.append("listingId");
        sb.append('=');
        sb.append(((this.listingId == null)?"<null>":this.listingId));
        sb.append(',');
        sb.append("matterport");
        sb.append('=');
        sb.append(((this.matterport == null)?"<null>":this.matterport));
        sb.append(',');
        sb.append("virtualTours");
        sb.append('=');
        sb.append(((this.virtualTours == null)?"<null>":this.virtualTours));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("products");
        sb.append('=');
        sb.append(((this.products == null)?"<null>":this.products));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("leadAttributes");
        sb.append('=');
        sb.append(((this.leadAttributes == null)?"<null>":this.leadAttributes));
        sb.append(',');
        sb.append("community");
        sb.append('=');
        sb.append(((this.community == null)?"<null>":this.community));
        sb.append(',');
        sb.append("permalink");
        sb.append('=');
        sb.append(((this.permalink == null)?"<null>":this.permalink));
        sb.append(',');
        sb.append("priceReducedAmount");
        sb.append('=');
        sb.append(((this.priceReducedAmount == null)?"<null>":this.priceReducedAmount));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("openHouses");
        sb.append('=');
        sb.append(((this.openHouses == null)?"<null>":this.openHouses));
        sb.append(',');
        sb.append("branding");
        sb.append('=');
        sb.append(((this.branding == null)?"<null>":this.branding));
        sb.append(',');
        sb.append("flags");
        sb.append('=');
        sb.append(((this.flags == null)?"<null>":this.flags));
        sb.append(',');
        sb.append("listDate");
        sb.append('=');
        sb.append(((this.listDate == null)?"<null>":this.listDate));
        sb.append(',');
        sb.append("photos");
        sb.append('=');
        sb.append(((this.photos == null)?"<null>":this.photos));
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
        result = ((result* 31)+((this.matterport == null)? 0 :this.matterport.hashCode()));
        result = ((result* 31)+((this.openHouses == null)? 0 :this.openHouses.hashCode()));
        result = ((result* 31)+((this.listDate == null)? 0 :this.listDate.hashCode()));
        result = ((result* 31)+((this.branding == null)? 0 :this.branding.hashCode()));
        result = ((result* 31)+((this.flags == null)? 0 :this.flags.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.listingId == null)? 0 :this.listingId.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.community == null)? 0 :this.community.hashCode()));
        result = ((result* 31)+((this.primaryPhoto == null)? 0 :this.primaryPhoto.hashCode()));
        result = ((result* 31)+((this.photos == null)? 0 :this.photos.hashCode()));
        result = ((result* 31)+((this.products == null)? 0 :this.products.hashCode()));
        result = ((result* 31)+((this.searchPromotions == null)? 0 :this.searchPromotions.hashCode()));
        result = ((result* 31)+((this.rentToOwn == null)? 0 :this.rentToOwn.hashCode()));
        result = ((result* 31)+((this.leadAttributes == null)? 0 :this.leadAttributes.hashCode()));
        result = ((result* 31)+((this.priceReducedAmount == null)? 0 :this.priceReducedAmount.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.virtualTours == null)? 0 :this.virtualTours.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.permalink == null)? 0 :this.permalink.hashCode()));
        result = ((result* 31)+((this.propertyId == null)? 0 :this.propertyId.hashCode()));
        result = ((result* 31)+((this.listPrice == null)? 0 :this.listPrice.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Property) == false) {
            return false;
        }
        Property rhs = ((Property) other);
        return ((((((((((((((((((((((((this.matterport == rhs.matterport)||((this.matterport!= null)&&this.matterport.equals(rhs.matterport)))&&((this.openHouses == rhs.openHouses)||((this.openHouses!= null)&&this.openHouses.equals(rhs.openHouses))))&&((this.listDate == rhs.listDate)||((this.listDate!= null)&&this.listDate.equals(rhs.listDate))))&&((this.branding == rhs.branding)||((this.branding!= null)&&this.branding.equals(rhs.branding))))&&((this.flags == rhs.flags)||((this.flags!= null)&&this.flags.equals(rhs.flags))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.listingId == rhs.listingId)||((this.listingId!= null)&&this.listingId.equals(rhs.listingId))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.community == rhs.community)||((this.community!= null)&&this.community.equals(rhs.community))))&&((this.primaryPhoto == rhs.primaryPhoto)||((this.primaryPhoto!= null)&&this.primaryPhoto.equals(rhs.primaryPhoto))))&&((this.photos == rhs.photos)||((this.photos!= null)&&this.photos.equals(rhs.photos))))&&((this.products == rhs.products)||((this.products!= null)&&this.products.equals(rhs.products))))&&((this.searchPromotions == rhs.searchPromotions)||((this.searchPromotions!= null)&&this.searchPromotions.equals(rhs.searchPromotions))))&&((this.rentToOwn == rhs.rentToOwn)||((this.rentToOwn!= null)&&this.rentToOwn.equals(rhs.rentToOwn))))&&((this.leadAttributes == rhs.leadAttributes)||((this.leadAttributes!= null)&&this.leadAttributes.equals(rhs.leadAttributes))))&&((this.priceReducedAmount == rhs.priceReducedAmount)||((this.priceReducedAmount!= null)&&this.priceReducedAmount.equals(rhs.priceReducedAmount))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.virtualTours == rhs.virtualTours)||((this.virtualTours!= null)&&this.virtualTours.equals(rhs.virtualTours))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.permalink == rhs.permalink)||((this.permalink!= null)&&this.permalink.equals(rhs.permalink))))&&((this.propertyId == rhs.propertyId)||((this.propertyId!= null)&&this.propertyId.equals(rhs.propertyId))))&&((this.listPrice == rhs.listPrice)||((this.listPrice!= null)&&this.listPrice.equals(rhs.listPrice))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
