
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
    "rerankExperiment",
    "masonWebLeadFormExperiment",
    "tigerListViewExperiment",
    "tigerMapDefaultExperiment",
    "tigerMobileExperiment",
    "rentRerankExperiment",
    "forSaleSrpTwoTapExperiment",
    "forSaleFilterRedesignExperiment",
    "rentalShareExperiment",
    "openRentalLDPInNewTabExperiment",
    "rentalSaveSearchPromptExperiment",
    "isForSaleRecommendedFilterEnabled",
    "isSrpAdhesionAdsEnabled",
    "mediaSrpNativeAdsExperiment",
    "mediaRentalSrpGoogleAdsenseExperiment",
    "isGoogleAdsenseEnabled",
    "listingPromotionsFeatureFlag",
    "isRentalPromotionFilterEnabled",
    "isCubeV1Variation"
})
@Generated("jsonschema2pojo")
public class FeatureFlag {

    @JsonProperty("rerankExperiment")
    private RerankExperiment rerankExperiment;
    @JsonProperty("masonWebLeadFormExperiment")
    private MasonWebLeadFormExperiment masonWebLeadFormExperiment;
    @JsonProperty("tigerListViewExperiment")
    private TigerListViewExperiment tigerListViewExperiment;
    @JsonProperty("tigerMapDefaultExperiment")
    private TigerMapDefaultExperiment tigerMapDefaultExperiment;
    @JsonProperty("tigerMobileExperiment")
    private TigerMobileExperiment tigerMobileExperiment;
    @JsonProperty("rentRerankExperiment")
    private RentRerankExperiment rentRerankExperiment;
    @JsonProperty("forSaleSrpTwoTapExperiment")
    private ForSaleSrpTwoTapExperiment forSaleSrpTwoTapExperiment;
    @JsonProperty("forSaleFilterRedesignExperiment")
    private ForSaleFilterRedesignExperiment forSaleFilterRedesignExperiment;
    @JsonProperty("rentalShareExperiment")
    private RentalShareExperiment rentalShareExperiment;
    @JsonProperty("openRentalLDPInNewTabExperiment")
    private OpenRentalLDPInNewTabExperiment openRentalLDPInNewTabExperiment;
    @JsonProperty("rentalSaveSearchPromptExperiment")
    private RentalSaveSearchPromptExperiment rentalSaveSearchPromptExperiment;
    @JsonProperty("isForSaleRecommendedFilterEnabled")
    private Boolean isForSaleRecommendedFilterEnabled;
    @JsonProperty("isSrpAdhesionAdsEnabled")
    private Boolean isSrpAdhesionAdsEnabled;
    @JsonProperty("mediaSrpNativeAdsExperiment")
    private MediaSrpNativeAdsExperiment mediaSrpNativeAdsExperiment;
    @JsonProperty("mediaRentalSrpGoogleAdsenseExperiment")
    private MediaRentalSrpGoogleAdsenseExperiment mediaRentalSrpGoogleAdsenseExperiment;
    @JsonProperty("isGoogleAdsenseEnabled")
    private Boolean isGoogleAdsenseEnabled;
    @JsonProperty("listingPromotionsFeatureFlag")
    private ListingPromotionsFeatureFlag listingPromotionsFeatureFlag;
    @JsonProperty("isRentalPromotionFilterEnabled")
    private Boolean isRentalPromotionFilterEnabled;
    @JsonProperty("isCubeV1Variation")
    private Boolean isCubeV1Variation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("rerankExperiment")
    public RerankExperiment getRerankExperiment() {
        return rerankExperiment;
    }

    @JsonProperty("rerankExperiment")
    public void setRerankExperiment(RerankExperiment rerankExperiment) {
        this.rerankExperiment = rerankExperiment;
    }

    @JsonProperty("masonWebLeadFormExperiment")
    public MasonWebLeadFormExperiment getMasonWebLeadFormExperiment() {
        return masonWebLeadFormExperiment;
    }

    @JsonProperty("masonWebLeadFormExperiment")
    public void setMasonWebLeadFormExperiment(MasonWebLeadFormExperiment masonWebLeadFormExperiment) {
        this.masonWebLeadFormExperiment = masonWebLeadFormExperiment;
    }

    @JsonProperty("tigerListViewExperiment")
    public TigerListViewExperiment getTigerListViewExperiment() {
        return tigerListViewExperiment;
    }

    @JsonProperty("tigerListViewExperiment")
    public void setTigerListViewExperiment(TigerListViewExperiment tigerListViewExperiment) {
        this.tigerListViewExperiment = tigerListViewExperiment;
    }

    @JsonProperty("tigerMapDefaultExperiment")
    public TigerMapDefaultExperiment getTigerMapDefaultExperiment() {
        return tigerMapDefaultExperiment;
    }

    @JsonProperty("tigerMapDefaultExperiment")
    public void setTigerMapDefaultExperiment(TigerMapDefaultExperiment tigerMapDefaultExperiment) {
        this.tigerMapDefaultExperiment = tigerMapDefaultExperiment;
    }

    @JsonProperty("tigerMobileExperiment")
    public TigerMobileExperiment getTigerMobileExperiment() {
        return tigerMobileExperiment;
    }

    @JsonProperty("tigerMobileExperiment")
    public void setTigerMobileExperiment(TigerMobileExperiment tigerMobileExperiment) {
        this.tigerMobileExperiment = tigerMobileExperiment;
    }

    @JsonProperty("rentRerankExperiment")
    public RentRerankExperiment getRentRerankExperiment() {
        return rentRerankExperiment;
    }

    @JsonProperty("rentRerankExperiment")
    public void setRentRerankExperiment(RentRerankExperiment rentRerankExperiment) {
        this.rentRerankExperiment = rentRerankExperiment;
    }

    @JsonProperty("forSaleSrpTwoTapExperiment")
    public ForSaleSrpTwoTapExperiment getForSaleSrpTwoTapExperiment() {
        return forSaleSrpTwoTapExperiment;
    }

    @JsonProperty("forSaleSrpTwoTapExperiment")
    public void setForSaleSrpTwoTapExperiment(ForSaleSrpTwoTapExperiment forSaleSrpTwoTapExperiment) {
        this.forSaleSrpTwoTapExperiment = forSaleSrpTwoTapExperiment;
    }

    @JsonProperty("forSaleFilterRedesignExperiment")
    public ForSaleFilterRedesignExperiment getForSaleFilterRedesignExperiment() {
        return forSaleFilterRedesignExperiment;
    }

    @JsonProperty("forSaleFilterRedesignExperiment")
    public void setForSaleFilterRedesignExperiment(ForSaleFilterRedesignExperiment forSaleFilterRedesignExperiment) {
        this.forSaleFilterRedesignExperiment = forSaleFilterRedesignExperiment;
    }

    @JsonProperty("rentalShareExperiment")
    public RentalShareExperiment getRentalShareExperiment() {
        return rentalShareExperiment;
    }

    @JsonProperty("rentalShareExperiment")
    public void setRentalShareExperiment(RentalShareExperiment rentalShareExperiment) {
        this.rentalShareExperiment = rentalShareExperiment;
    }

    @JsonProperty("openRentalLDPInNewTabExperiment")
    public OpenRentalLDPInNewTabExperiment getOpenRentalLDPInNewTabExperiment() {
        return openRentalLDPInNewTabExperiment;
    }

    @JsonProperty("openRentalLDPInNewTabExperiment")
    public void setOpenRentalLDPInNewTabExperiment(OpenRentalLDPInNewTabExperiment openRentalLDPInNewTabExperiment) {
        this.openRentalLDPInNewTabExperiment = openRentalLDPInNewTabExperiment;
    }

    @JsonProperty("rentalSaveSearchPromptExperiment")
    public RentalSaveSearchPromptExperiment getRentalSaveSearchPromptExperiment() {
        return rentalSaveSearchPromptExperiment;
    }

    @JsonProperty("rentalSaveSearchPromptExperiment")
    public void setRentalSaveSearchPromptExperiment(RentalSaveSearchPromptExperiment rentalSaveSearchPromptExperiment) {
        this.rentalSaveSearchPromptExperiment = rentalSaveSearchPromptExperiment;
    }

    @JsonProperty("isForSaleRecommendedFilterEnabled")
    public Boolean getIsForSaleRecommendedFilterEnabled() {
        return isForSaleRecommendedFilterEnabled;
    }

    @JsonProperty("isForSaleRecommendedFilterEnabled")
    public void setIsForSaleRecommendedFilterEnabled(Boolean isForSaleRecommendedFilterEnabled) {
        this.isForSaleRecommendedFilterEnabled = isForSaleRecommendedFilterEnabled;
    }

    @JsonProperty("isSrpAdhesionAdsEnabled")
    public Boolean getIsSrpAdhesionAdsEnabled() {
        return isSrpAdhesionAdsEnabled;
    }

    @JsonProperty("isSrpAdhesionAdsEnabled")
    public void setIsSrpAdhesionAdsEnabled(Boolean isSrpAdhesionAdsEnabled) {
        this.isSrpAdhesionAdsEnabled = isSrpAdhesionAdsEnabled;
    }

    @JsonProperty("mediaSrpNativeAdsExperiment")
    public MediaSrpNativeAdsExperiment getMediaSrpNativeAdsExperiment() {
        return mediaSrpNativeAdsExperiment;
    }

    @JsonProperty("mediaSrpNativeAdsExperiment")
    public void setMediaSrpNativeAdsExperiment(MediaSrpNativeAdsExperiment mediaSrpNativeAdsExperiment) {
        this.mediaSrpNativeAdsExperiment = mediaSrpNativeAdsExperiment;
    }

    @JsonProperty("mediaRentalSrpGoogleAdsenseExperiment")
    public MediaRentalSrpGoogleAdsenseExperiment getMediaRentalSrpGoogleAdsenseExperiment() {
        return mediaRentalSrpGoogleAdsenseExperiment;
    }

    @JsonProperty("mediaRentalSrpGoogleAdsenseExperiment")
    public void setMediaRentalSrpGoogleAdsenseExperiment(MediaRentalSrpGoogleAdsenseExperiment mediaRentalSrpGoogleAdsenseExperiment) {
        this.mediaRentalSrpGoogleAdsenseExperiment = mediaRentalSrpGoogleAdsenseExperiment;
    }

    @JsonProperty("isGoogleAdsenseEnabled")
    public Boolean getIsGoogleAdsenseEnabled() {
        return isGoogleAdsenseEnabled;
    }

    @JsonProperty("isGoogleAdsenseEnabled")
    public void setIsGoogleAdsenseEnabled(Boolean isGoogleAdsenseEnabled) {
        this.isGoogleAdsenseEnabled = isGoogleAdsenseEnabled;
    }

    @JsonProperty("listingPromotionsFeatureFlag")
    public ListingPromotionsFeatureFlag getListingPromotionsFeatureFlag() {
        return listingPromotionsFeatureFlag;
    }

    @JsonProperty("listingPromotionsFeatureFlag")
    public void setListingPromotionsFeatureFlag(ListingPromotionsFeatureFlag listingPromotionsFeatureFlag) {
        this.listingPromotionsFeatureFlag = listingPromotionsFeatureFlag;
    }

    @JsonProperty("isRentalPromotionFilterEnabled")
    public Boolean getIsRentalPromotionFilterEnabled() {
        return isRentalPromotionFilterEnabled;
    }

    @JsonProperty("isRentalPromotionFilterEnabled")
    public void setIsRentalPromotionFilterEnabled(Boolean isRentalPromotionFilterEnabled) {
        this.isRentalPromotionFilterEnabled = isRentalPromotionFilterEnabled;
    }

    @JsonProperty("isCubeV1Variation")
    public Boolean getIsCubeV1Variation() {
        return isCubeV1Variation;
    }

    @JsonProperty("isCubeV1Variation")
    public void setIsCubeV1Variation(Boolean isCubeV1Variation) {
        this.isCubeV1Variation = isCubeV1Variation;
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
        sb.append(FeatureFlag.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rerankExperiment");
        sb.append('=');
        sb.append(((this.rerankExperiment == null)?"<null>":this.rerankExperiment));
        sb.append(',');
        sb.append("masonWebLeadFormExperiment");
        sb.append('=');
        sb.append(((this.masonWebLeadFormExperiment == null)?"<null>":this.masonWebLeadFormExperiment));
        sb.append(',');
        sb.append("tigerListViewExperiment");
        sb.append('=');
        sb.append(((this.tigerListViewExperiment == null)?"<null>":this.tigerListViewExperiment));
        sb.append(',');
        sb.append("tigerMapDefaultExperiment");
        sb.append('=');
        sb.append(((this.tigerMapDefaultExperiment == null)?"<null>":this.tigerMapDefaultExperiment));
        sb.append(',');
        sb.append("tigerMobileExperiment");
        sb.append('=');
        sb.append(((this.tigerMobileExperiment == null)?"<null>":this.tigerMobileExperiment));
        sb.append(',');
        sb.append("rentRerankExperiment");
        sb.append('=');
        sb.append(((this.rentRerankExperiment == null)?"<null>":this.rentRerankExperiment));
        sb.append(',');
        sb.append("forSaleSrpTwoTapExperiment");
        sb.append('=');
        sb.append(((this.forSaleSrpTwoTapExperiment == null)?"<null>":this.forSaleSrpTwoTapExperiment));
        sb.append(',');
        sb.append("forSaleFilterRedesignExperiment");
        sb.append('=');
        sb.append(((this.forSaleFilterRedesignExperiment == null)?"<null>":this.forSaleFilterRedesignExperiment));
        sb.append(',');
        sb.append("rentalShareExperiment");
        sb.append('=');
        sb.append(((this.rentalShareExperiment == null)?"<null>":this.rentalShareExperiment));
        sb.append(',');
        sb.append("openRentalLDPInNewTabExperiment");
        sb.append('=');
        sb.append(((this.openRentalLDPInNewTabExperiment == null)?"<null>":this.openRentalLDPInNewTabExperiment));
        sb.append(',');
        sb.append("rentalSaveSearchPromptExperiment");
        sb.append('=');
        sb.append(((this.rentalSaveSearchPromptExperiment == null)?"<null>":this.rentalSaveSearchPromptExperiment));
        sb.append(',');
        sb.append("isForSaleRecommendedFilterEnabled");
        sb.append('=');
        sb.append(((this.isForSaleRecommendedFilterEnabled == null)?"<null>":this.isForSaleRecommendedFilterEnabled));
        sb.append(',');
        sb.append("isSrpAdhesionAdsEnabled");
        sb.append('=');
        sb.append(((this.isSrpAdhesionAdsEnabled == null)?"<null>":this.isSrpAdhesionAdsEnabled));
        sb.append(',');
        sb.append("mediaSrpNativeAdsExperiment");
        sb.append('=');
        sb.append(((this.mediaSrpNativeAdsExperiment == null)?"<null>":this.mediaSrpNativeAdsExperiment));
        sb.append(',');
        sb.append("mediaRentalSrpGoogleAdsenseExperiment");
        sb.append('=');
        sb.append(((this.mediaRentalSrpGoogleAdsenseExperiment == null)?"<null>":this.mediaRentalSrpGoogleAdsenseExperiment));
        sb.append(',');
        sb.append("isGoogleAdsenseEnabled");
        sb.append('=');
        sb.append(((this.isGoogleAdsenseEnabled == null)?"<null>":this.isGoogleAdsenseEnabled));
        sb.append(',');
        sb.append("listingPromotionsFeatureFlag");
        sb.append('=');
        sb.append(((this.listingPromotionsFeatureFlag == null)?"<null>":this.listingPromotionsFeatureFlag));
        sb.append(',');
        sb.append("isRentalPromotionFilterEnabled");
        sb.append('=');
        sb.append(((this.isRentalPromotionFilterEnabled == null)?"<null>":this.isRentalPromotionFilterEnabled));
        sb.append(',');
        sb.append("isCubeV1Variation");
        sb.append('=');
        sb.append(((this.isCubeV1Variation == null)?"<null>":this.isCubeV1Variation));
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
        result = ((result* 31)+((this.isGoogleAdsenseEnabled == null)? 0 :this.isGoogleAdsenseEnabled.hashCode()));
        result = ((result* 31)+((this.mediaRentalSrpGoogleAdsenseExperiment == null)? 0 :this.mediaRentalSrpGoogleAdsenseExperiment.hashCode()));
        result = ((result* 31)+((this.rerankExperiment == null)? 0 :this.rerankExperiment.hashCode()));
        result = ((result* 31)+((this.forSaleSrpTwoTapExperiment == null)? 0 :this.forSaleSrpTwoTapExperiment.hashCode()));
        result = ((result* 31)+((this.isForSaleRecommendedFilterEnabled == null)? 0 :this.isForSaleRecommendedFilterEnabled.hashCode()));
        result = ((result* 31)+((this.listingPromotionsFeatureFlag == null)? 0 :this.listingPromotionsFeatureFlag.hashCode()));
        result = ((result* 31)+((this.isCubeV1Variation == null)? 0 :this.isCubeV1Variation.hashCode()));
        result = ((result* 31)+((this.rentalSaveSearchPromptExperiment == null)? 0 :this.rentalSaveSearchPromptExperiment.hashCode()));
        result = ((result* 31)+((this.isRentalPromotionFilterEnabled == null)? 0 :this.isRentalPromotionFilterEnabled.hashCode()));
        result = ((result* 31)+((this.rentRerankExperiment == null)? 0 :this.rentRerankExperiment.hashCode()));
        result = ((result* 31)+((this.masonWebLeadFormExperiment == null)? 0 :this.masonWebLeadFormExperiment.hashCode()));
        result = ((result* 31)+((this.tigerListViewExperiment == null)? 0 :this.tigerListViewExperiment.hashCode()));
        result = ((result* 31)+((this.rentalShareExperiment == null)? 0 :this.rentalShareExperiment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.openRentalLDPInNewTabExperiment == null)? 0 :this.openRentalLDPInNewTabExperiment.hashCode()));
        result = ((result* 31)+((this.isSrpAdhesionAdsEnabled == null)? 0 :this.isSrpAdhesionAdsEnabled.hashCode()));
        result = ((result* 31)+((this.tigerMapDefaultExperiment == null)? 0 :this.tigerMapDefaultExperiment.hashCode()));
        result = ((result* 31)+((this.tigerMobileExperiment == null)? 0 :this.tigerMobileExperiment.hashCode()));
        result = ((result* 31)+((this.forSaleFilterRedesignExperiment == null)? 0 :this.forSaleFilterRedesignExperiment.hashCode()));
        result = ((result* 31)+((this.mediaSrpNativeAdsExperiment == null)? 0 :this.mediaSrpNativeAdsExperiment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeatureFlag) == false) {
            return false;
        }
        FeatureFlag rhs = ((FeatureFlag) other);
        return (((((((((((((((((((((this.isGoogleAdsenseEnabled == rhs.isGoogleAdsenseEnabled)||((this.isGoogleAdsenseEnabled!= null)&&this.isGoogleAdsenseEnabled.equals(rhs.isGoogleAdsenseEnabled)))&&((this.mediaRentalSrpGoogleAdsenseExperiment == rhs.mediaRentalSrpGoogleAdsenseExperiment)||((this.mediaRentalSrpGoogleAdsenseExperiment!= null)&&this.mediaRentalSrpGoogleAdsenseExperiment.equals(rhs.mediaRentalSrpGoogleAdsenseExperiment))))&&((this.rerankExperiment == rhs.rerankExperiment)||((this.rerankExperiment!= null)&&this.rerankExperiment.equals(rhs.rerankExperiment))))&&((this.forSaleSrpTwoTapExperiment == rhs.forSaleSrpTwoTapExperiment)||((this.forSaleSrpTwoTapExperiment!= null)&&this.forSaleSrpTwoTapExperiment.equals(rhs.forSaleSrpTwoTapExperiment))))&&((this.isForSaleRecommendedFilterEnabled == rhs.isForSaleRecommendedFilterEnabled)||((this.isForSaleRecommendedFilterEnabled!= null)&&this.isForSaleRecommendedFilterEnabled.equals(rhs.isForSaleRecommendedFilterEnabled))))&&((this.listingPromotionsFeatureFlag == rhs.listingPromotionsFeatureFlag)||((this.listingPromotionsFeatureFlag!= null)&&this.listingPromotionsFeatureFlag.equals(rhs.listingPromotionsFeatureFlag))))&&((this.isCubeV1Variation == rhs.isCubeV1Variation)||((this.isCubeV1Variation!= null)&&this.isCubeV1Variation.equals(rhs.isCubeV1Variation))))&&((this.rentalSaveSearchPromptExperiment == rhs.rentalSaveSearchPromptExperiment)||((this.rentalSaveSearchPromptExperiment!= null)&&this.rentalSaveSearchPromptExperiment.equals(rhs.rentalSaveSearchPromptExperiment))))&&((this.isRentalPromotionFilterEnabled == rhs.isRentalPromotionFilterEnabled)||((this.isRentalPromotionFilterEnabled!= null)&&this.isRentalPromotionFilterEnabled.equals(rhs.isRentalPromotionFilterEnabled))))&&((this.rentRerankExperiment == rhs.rentRerankExperiment)||((this.rentRerankExperiment!= null)&&this.rentRerankExperiment.equals(rhs.rentRerankExperiment))))&&((this.masonWebLeadFormExperiment == rhs.masonWebLeadFormExperiment)||((this.masonWebLeadFormExperiment!= null)&&this.masonWebLeadFormExperiment.equals(rhs.masonWebLeadFormExperiment))))&&((this.tigerListViewExperiment == rhs.tigerListViewExperiment)||((this.tigerListViewExperiment!= null)&&this.tigerListViewExperiment.equals(rhs.tigerListViewExperiment))))&&((this.rentalShareExperiment == rhs.rentalShareExperiment)||((this.rentalShareExperiment!= null)&&this.rentalShareExperiment.equals(rhs.rentalShareExperiment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.openRentalLDPInNewTabExperiment == rhs.openRentalLDPInNewTabExperiment)||((this.openRentalLDPInNewTabExperiment!= null)&&this.openRentalLDPInNewTabExperiment.equals(rhs.openRentalLDPInNewTabExperiment))))&&((this.isSrpAdhesionAdsEnabled == rhs.isSrpAdhesionAdsEnabled)||((this.isSrpAdhesionAdsEnabled!= null)&&this.isSrpAdhesionAdsEnabled.equals(rhs.isSrpAdhesionAdsEnabled))))&&((this.tigerMapDefaultExperiment == rhs.tigerMapDefaultExperiment)||((this.tigerMapDefaultExperiment!= null)&&this.tigerMapDefaultExperiment.equals(rhs.tigerMapDefaultExperiment))))&&((this.tigerMobileExperiment == rhs.tigerMobileExperiment)||((this.tigerMobileExperiment!= null)&&this.tigerMobileExperiment.equals(rhs.tigerMobileExperiment))))&&((this.forSaleFilterRedesignExperiment == rhs.forSaleFilterRedesignExperiment)||((this.forSaleFilterRedesignExperiment!= null)&&this.forSaleFilterRedesignExperiment.equals(rhs.forSaleFilterRedesignExperiment))))&&((this.mediaSrpNativeAdsExperiment == rhs.mediaSrpNativeAdsExperiment)||((this.mediaSrpNativeAdsExperiment!= null)&&this.mediaSrpNativeAdsExperiment.equals(rhs.mediaSrpNativeAdsExperiment))));
    }

}
