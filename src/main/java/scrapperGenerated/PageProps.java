
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
    "deviceType",
    "userAgent",
    "env",
    "cdnEnv",
    "geo",
    "pageType",
    "page",
    "view",
    "filters",
    "nearbyItems",
    "properties",
    "totalProperties",
    "snippets",
    "excludedProperties",
    "expandedProperties",
    "school",
    "geoStats",
    "widgetsData",
    "seoMeta",
    "totalExpandedProperties",
    "featureFlag",
    "builderList",
    "isMobile",
    "recommendedFilterData",
    "searchPromotion"
})
@Generated("jsonschema2pojo")
public class PageProps {

    @JsonProperty("deviceType")
    private String deviceType;
    @JsonProperty("userAgent")
    private String userAgent;
    @JsonProperty("env")
    private String env;
    @JsonProperty("cdnEnv")
    private String cdnEnv;
    @JsonProperty("geo")
    private Geo geo;
    @JsonProperty("pageType")
    private String pageType;
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("view")
    private String view;
    @JsonProperty("filters")
    private Filters filters;
    @JsonProperty("nearbyItems")
    private List<Object> nearbyItems = new ArrayList<Object>();
    @JsonProperty("properties")
    private List<Property> properties = new ArrayList<Property>();
    @JsonProperty("totalProperties")
    private Integer totalProperties;
    @JsonProperty("snippets")
    private Snippets snippets;
    @JsonProperty("excludedProperties")
    private List<Object> excludedProperties = new ArrayList<Object>();
    @JsonProperty("expandedProperties")
    private List<Object> expandedProperties = new ArrayList<Object>();
    @JsonProperty("school")
    private Object school;
    @JsonProperty("geoStats")
    private GeoStats geoStats;
    @JsonProperty("widgetsData")
    private WidgetsData widgetsData;
    @JsonProperty("seoMeta")
    private SeoMeta seoMeta;
    @JsonProperty("totalExpandedProperties")
    private Integer totalExpandedProperties;
    @JsonProperty("featureFlag")
    private FeatureFlag featureFlag;
    @JsonProperty("builderList")
    private List<Object> builderList = new ArrayList<Object>();
    @JsonProperty("isMobile")
    private Boolean isMobile;
    @JsonProperty("recommendedFilterData")
    private List<RecommendedFilterDatum> recommendedFilterData = new ArrayList<RecommendedFilterDatum>();
    @JsonProperty("searchPromotion")
    private Object searchPromotion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("deviceType")
    public String getDeviceType() {
        return deviceType;
    }

    @JsonProperty("deviceType")
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @JsonProperty("userAgent")
    public String getUserAgent() {
        return userAgent;
    }

    @JsonProperty("userAgent")
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @JsonProperty("env")
    public String getEnv() {
        return env;
    }

    @JsonProperty("env")
    public void setEnv(String env) {
        this.env = env;
    }

    @JsonProperty("cdnEnv")
    public String getCdnEnv() {
        return cdnEnv;
    }

    @JsonProperty("cdnEnv")
    public void setCdnEnv(String cdnEnv) {
        this.cdnEnv = cdnEnv;
    }

    @JsonProperty("geo")
    public Geo getGeo() {
        return geo;
    }

    @JsonProperty("geo")
    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @JsonProperty("pageType")
    public String getPageType() {
        return pageType;
    }

    @JsonProperty("pageType")
    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("view")
    public String getView() {
        return view;
    }

    @JsonProperty("view")
    public void setView(String view) {
        this.view = view;
    }

    @JsonProperty("filters")
    public Filters getFilters() {
        return filters;
    }

    @JsonProperty("filters")
    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    @JsonProperty("nearbyItems")
    public List<Object> getNearbyItems() {
        return nearbyItems;
    }

    @JsonProperty("nearbyItems")
    public void setNearbyItems(List<Object> nearbyItems) {
        this.nearbyItems = nearbyItems;
    }

    @JsonProperty("properties")
    public List<Property> getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @JsonProperty("totalProperties")
    public Integer getTotalProperties() {
        return totalProperties;
    }

    @JsonProperty("totalProperties")
    public void setTotalProperties(Integer totalProperties) {
        this.totalProperties = totalProperties;
    }

    @JsonProperty("snippets")
    public Snippets getSnippets() {
        return snippets;
    }

    @JsonProperty("snippets")
    public void setSnippets(Snippets snippets) {
        this.snippets = snippets;
    }

    @JsonProperty("excludedProperties")
    public List<Object> getExcludedProperties() {
        return excludedProperties;
    }

    @JsonProperty("excludedProperties")
    public void setExcludedProperties(List<Object> excludedProperties) {
        this.excludedProperties = excludedProperties;
    }

    @JsonProperty("expandedProperties")
    public List<Object> getExpandedProperties() {
        return expandedProperties;
    }

    @JsonProperty("expandedProperties")
    public void setExpandedProperties(List<Object> expandedProperties) {
        this.expandedProperties = expandedProperties;
    }

    @JsonProperty("school")
    public Object getSchool() {
        return school;
    }

    @JsonProperty("school")
    public void setSchool(Object school) {
        this.school = school;
    }

    @JsonProperty("geoStats")
    public GeoStats getGeoStats() {
        return geoStats;
    }

    @JsonProperty("geoStats")
    public void setGeoStats(GeoStats geoStats) {
        this.geoStats = geoStats;
    }

    @JsonProperty("widgetsData")
    public WidgetsData getWidgetsData() {
        return widgetsData;
    }

    @JsonProperty("widgetsData")
    public void setWidgetsData(WidgetsData widgetsData) {
        this.widgetsData = widgetsData;
    }

    @JsonProperty("seoMeta")
    public SeoMeta getSeoMeta() {
        return seoMeta;
    }

    @JsonProperty("seoMeta")
    public void setSeoMeta(SeoMeta seoMeta) {
        this.seoMeta = seoMeta;
    }

    @JsonProperty("totalExpandedProperties")
    public Integer getTotalExpandedProperties() {
        return totalExpandedProperties;
    }

    @JsonProperty("totalExpandedProperties")
    public void setTotalExpandedProperties(Integer totalExpandedProperties) {
        this.totalExpandedProperties = totalExpandedProperties;
    }

    @JsonProperty("featureFlag")
    public FeatureFlag getFeatureFlag() {
        return featureFlag;
    }

    @JsonProperty("featureFlag")
    public void setFeatureFlag(FeatureFlag featureFlag) {
        this.featureFlag = featureFlag;
    }

    @JsonProperty("builderList")
    public List<Object> getBuilderList() {
        return builderList;
    }

    @JsonProperty("builderList")
    public void setBuilderList(List<Object> builderList) {
        this.builderList = builderList;
    }

    @JsonProperty("isMobile")
    public Boolean getIsMobile() {
        return isMobile;
    }

    @JsonProperty("isMobile")
    public void setIsMobile(Boolean isMobile) {
        this.isMobile = isMobile;
    }

    @JsonProperty("recommendedFilterData")
    public List<RecommendedFilterDatum> getRecommendedFilterData() {
        return recommendedFilterData;
    }

    @JsonProperty("recommendedFilterData")
    public void setRecommendedFilterData(List<RecommendedFilterDatum> recommendedFilterData) {
        this.recommendedFilterData = recommendedFilterData;
    }

    @JsonProperty("searchPromotion")
    public Object getSearchPromotion() {
        return searchPromotion;
    }

    @JsonProperty("searchPromotion")
    public void setSearchPromotion(Object searchPromotion) {
        this.searchPromotion = searchPromotion;
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
        sb.append(PageProps.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("deviceType");
        sb.append('=');
        sb.append(((this.deviceType == null)?"<null>":this.deviceType));
        sb.append(',');
        sb.append("userAgent");
        sb.append('=');
        sb.append(((this.userAgent == null)?"<null>":this.userAgent));
        sb.append(',');
        sb.append("env");
        sb.append('=');
        sb.append(((this.env == null)?"<null>":this.env));
        sb.append(',');
        sb.append("cdnEnv");
        sb.append('=');
        sb.append(((this.cdnEnv == null)?"<null>":this.cdnEnv));
        sb.append(',');
        sb.append("geo");
        sb.append('=');
        sb.append(((this.geo == null)?"<null>":this.geo));
        sb.append(',');
        sb.append("pageType");
        sb.append('=');
        sb.append(((this.pageType == null)?"<null>":this.pageType));
        sb.append(',');
        sb.append("page");
        sb.append('=');
        sb.append(((this.page == null)?"<null>":this.page));
        sb.append(',');
        sb.append("view");
        sb.append('=');
        sb.append(((this.view == null)?"<null>":this.view));
        sb.append(',');
        sb.append("filters");
        sb.append('=');
        sb.append(((this.filters == null)?"<null>":this.filters));
        sb.append(',');
        sb.append("nearbyItems");
        sb.append('=');
        sb.append(((this.nearbyItems == null)?"<null>":this.nearbyItems));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
        sb.append(',');
        sb.append("totalProperties");
        sb.append('=');
        sb.append(((this.totalProperties == null)?"<null>":this.totalProperties));
        sb.append(',');
        sb.append("snippets");
        sb.append('=');
        sb.append(((this.snippets == null)?"<null>":this.snippets));
        sb.append(',');
        sb.append("excludedProperties");
        sb.append('=');
        sb.append(((this.excludedProperties == null)?"<null>":this.excludedProperties));
        sb.append(',');
        sb.append("expandedProperties");
        sb.append('=');
        sb.append(((this.expandedProperties == null)?"<null>":this.expandedProperties));
        sb.append(',');
        sb.append("school");
        sb.append('=');
        sb.append(((this.school == null)?"<null>":this.school));
        sb.append(',');
        sb.append("geoStats");
        sb.append('=');
        sb.append(((this.geoStats == null)?"<null>":this.geoStats));
        sb.append(',');
        sb.append("widgetsData");
        sb.append('=');
        sb.append(((this.widgetsData == null)?"<null>":this.widgetsData));
        sb.append(',');
        sb.append("seoMeta");
        sb.append('=');
        sb.append(((this.seoMeta == null)?"<null>":this.seoMeta));
        sb.append(',');
        sb.append("totalExpandedProperties");
        sb.append('=');
        sb.append(((this.totalExpandedProperties == null)?"<null>":this.totalExpandedProperties));
        sb.append(',');
        sb.append("featureFlag");
        sb.append('=');
        sb.append(((this.featureFlag == null)?"<null>":this.featureFlag));
        sb.append(',');
        sb.append("builderList");
        sb.append('=');
        sb.append(((this.builderList == null)?"<null>":this.builderList));
        sb.append(',');
        sb.append("isMobile");
        sb.append('=');
        sb.append(((this.isMobile == null)?"<null>":this.isMobile));
        sb.append(',');
        sb.append("recommendedFilterData");
        sb.append('=');
        sb.append(((this.recommendedFilterData == null)?"<null>":this.recommendedFilterData));
        sb.append(',');
        sb.append("searchPromotion");
        sb.append('=');
        sb.append(((this.searchPromotion == null)?"<null>":this.searchPromotion));
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
        result = ((result* 31)+((this.featureFlag == null)? 0 :this.featureFlag.hashCode()));
        result = ((result* 31)+((this.seoMeta == null)? 0 :this.seoMeta.hashCode()));
        result = ((result* 31)+((this.widgetsData == null)? 0 :this.widgetsData.hashCode()));
        result = ((result* 31)+((this.recommendedFilterData == null)? 0 :this.recommendedFilterData.hashCode()));
        result = ((result* 31)+((this.totalProperties == null)? 0 :this.totalProperties.hashCode()));
        result = ((result* 31)+((this.nearbyItems == null)? 0 :this.nearbyItems.hashCode()));
        result = ((result* 31)+((this.geo == null)? 0 :this.geo.hashCode()));
        result = ((result* 31)+((this.view == null)? 0 :this.view.hashCode()));
        result = ((result* 31)+((this.pageType == null)? 0 :this.pageType.hashCode()));
        result = ((result* 31)+((this.school == null)? 0 :this.school.hashCode()));
        result = ((result* 31)+((this.totalExpandedProperties == null)? 0 :this.totalExpandedProperties.hashCode()));
        result = ((result* 31)+((this.snippets == null)? 0 :this.snippets.hashCode()));
        result = ((result* 31)+((this.isMobile == null)? 0 :this.isMobile.hashCode()));
        result = ((result* 31)+((this.deviceType == null)? 0 :this.deviceType.hashCode()));
        result = ((result* 31)+((this.excludedProperties == null)? 0 :this.excludedProperties.hashCode()));
        result = ((result* 31)+((this.cdnEnv == null)? 0 :this.cdnEnv.hashCode()));
        result = ((result* 31)+((this.expandedProperties == null)? 0 :this.expandedProperties.hashCode()));
        result = ((result* 31)+((this.userAgent == null)? 0 :this.userAgent.hashCode()));
        result = ((result* 31)+((this.filters == null)? 0 :this.filters.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        result = ((result* 31)+((this.geoStats == null)? 0 :this.geoStats.hashCode()));
        result = ((result* 31)+((this.searchPromotion == null)? 0 :this.searchPromotion.hashCode()));
        result = ((result* 31)+((this.builderList == null)? 0 :this.builderList.hashCode()));
        result = ((result* 31)+((this.page == null)? 0 :this.page.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PageProps) == false) {
            return false;
        }
        PageProps rhs = ((PageProps) other);
        return (((((((((((((((((((((((((((this.featureFlag == rhs.featureFlag)||((this.featureFlag!= null)&&this.featureFlag.equals(rhs.featureFlag)))&&((this.seoMeta == rhs.seoMeta)||((this.seoMeta!= null)&&this.seoMeta.equals(rhs.seoMeta))))&&((this.widgetsData == rhs.widgetsData)||((this.widgetsData!= null)&&this.widgetsData.equals(rhs.widgetsData))))&&((this.recommendedFilterData == rhs.recommendedFilterData)||((this.recommendedFilterData!= null)&&this.recommendedFilterData.equals(rhs.recommendedFilterData))))&&((this.totalProperties == rhs.totalProperties)||((this.totalProperties!= null)&&this.totalProperties.equals(rhs.totalProperties))))&&((this.nearbyItems == rhs.nearbyItems)||((this.nearbyItems!= null)&&this.nearbyItems.equals(rhs.nearbyItems))))&&((this.geo == rhs.geo)||((this.geo!= null)&&this.geo.equals(rhs.geo))))&&((this.view == rhs.view)||((this.view!= null)&&this.view.equals(rhs.view))))&&((this.pageType == rhs.pageType)||((this.pageType!= null)&&this.pageType.equals(rhs.pageType))))&&((this.school == rhs.school)||((this.school!= null)&&this.school.equals(rhs.school))))&&((this.totalExpandedProperties == rhs.totalExpandedProperties)||((this.totalExpandedProperties!= null)&&this.totalExpandedProperties.equals(rhs.totalExpandedProperties))))&&((this.snippets == rhs.snippets)||((this.snippets!= null)&&this.snippets.equals(rhs.snippets))))&&((this.isMobile == rhs.isMobile)||((this.isMobile!= null)&&this.isMobile.equals(rhs.isMobile))))&&((this.deviceType == rhs.deviceType)||((this.deviceType!= null)&&this.deviceType.equals(rhs.deviceType))))&&((this.excludedProperties == rhs.excludedProperties)||((this.excludedProperties!= null)&&this.excludedProperties.equals(rhs.excludedProperties))))&&((this.cdnEnv == rhs.cdnEnv)||((this.cdnEnv!= null)&&this.cdnEnv.equals(rhs.cdnEnv))))&&((this.expandedProperties == rhs.expandedProperties)||((this.expandedProperties!= null)&&this.expandedProperties.equals(rhs.expandedProperties))))&&((this.userAgent == rhs.userAgent)||((this.userAgent!= null)&&this.userAgent.equals(rhs.userAgent))))&&((this.filters == rhs.filters)||((this.filters!= null)&&this.filters.equals(rhs.filters))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))))&&((this.geoStats == rhs.geoStats)||((this.geoStats!= null)&&this.geoStats.equals(rhs.geoStats))))&&((this.searchPromotion == rhs.searchPromotion)||((this.searchPromotion!= null)&&this.searchPromotion.equals(rhs.searchPromotion))))&&((this.builderList == rhs.builderList)||((this.builderList!= null)&&this.builderList.equals(rhs.builderList))))&&((this.page == rhs.page)||((this.page!= null)&&this.page.equals(rhs.page))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }

}
