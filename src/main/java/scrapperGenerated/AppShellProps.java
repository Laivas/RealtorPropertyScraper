
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
    "pathname",
    "srpView",
    "env",
    "hostname",
    "hideHeader",
    "hideFooter",
    "hideMobileBanner",
    "appContextProps",
    "headerProps",
    "mobileBannerProps"
})
@Generated("jsonschema2pojo")
public class AppShellProps {

    @JsonProperty("pathname")
    private String pathname;
    @JsonProperty("srpView")
    private String srpView;
    @JsonProperty("env")
    private String env;
    @JsonProperty("hostname")
    private String hostname;
    @JsonProperty("hideHeader")
    private Boolean hideHeader;
    @JsonProperty("hideFooter")
    private Boolean hideFooter;
    @JsonProperty("hideMobileBanner")
    private Boolean hideMobileBanner;
    @JsonProperty("appContextProps")
    private AppContextProps appContextProps;
    @JsonProperty("headerProps")
    private HeaderProps headerProps;
    @JsonProperty("mobileBannerProps")
    private MobileBannerProps mobileBannerProps;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("pathname")
    public String getPathname() {
        return pathname;
    }

    @JsonProperty("pathname")
    public void setPathname(String pathname) {
        this.pathname = pathname;
    }

    @JsonProperty("srpView")
    public String getSrpView() {
        return srpView;
    }

    @JsonProperty("srpView")
    public void setSrpView(String srpView) {
        this.srpView = srpView;
    }

    @JsonProperty("env")
    public String getEnv() {
        return env;
    }

    @JsonProperty("env")
    public void setEnv(String env) {
        this.env = env;
    }

    @JsonProperty("hostname")
    public String getHostname() {
        return hostname;
    }

    @JsonProperty("hostname")
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @JsonProperty("hideHeader")
    public Boolean getHideHeader() {
        return hideHeader;
    }

    @JsonProperty("hideHeader")
    public void setHideHeader(Boolean hideHeader) {
        this.hideHeader = hideHeader;
    }

    @JsonProperty("hideFooter")
    public Boolean getHideFooter() {
        return hideFooter;
    }

    @JsonProperty("hideFooter")
    public void setHideFooter(Boolean hideFooter) {
        this.hideFooter = hideFooter;
    }

    @JsonProperty("hideMobileBanner")
    public Boolean getHideMobileBanner() {
        return hideMobileBanner;
    }

    @JsonProperty("hideMobileBanner")
    public void setHideMobileBanner(Boolean hideMobileBanner) {
        this.hideMobileBanner = hideMobileBanner;
    }

    @JsonProperty("appContextProps")
    public AppContextProps getAppContextProps() {
        return appContextProps;
    }

    @JsonProperty("appContextProps")
    public void setAppContextProps(AppContextProps appContextProps) {
        this.appContextProps = appContextProps;
    }

    @JsonProperty("headerProps")
    public HeaderProps getHeaderProps() {
        return headerProps;
    }

    @JsonProperty("headerProps")
    public void setHeaderProps(HeaderProps headerProps) {
        this.headerProps = headerProps;
    }

    @JsonProperty("mobileBannerProps")
    public MobileBannerProps getMobileBannerProps() {
        return mobileBannerProps;
    }

    @JsonProperty("mobileBannerProps")
    public void setMobileBannerProps(MobileBannerProps mobileBannerProps) {
        this.mobileBannerProps = mobileBannerProps;
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
        sb.append(AppShellProps.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pathname");
        sb.append('=');
        sb.append(((this.pathname == null)?"<null>":this.pathname));
        sb.append(',');
        sb.append("srpView");
        sb.append('=');
        sb.append(((this.srpView == null)?"<null>":this.srpView));
        sb.append(',');
        sb.append("env");
        sb.append('=');
        sb.append(((this.env == null)?"<null>":this.env));
        sb.append(',');
        sb.append("hostname");
        sb.append('=');
        sb.append(((this.hostname == null)?"<null>":this.hostname));
        sb.append(',');
        sb.append("hideHeader");
        sb.append('=');
        sb.append(((this.hideHeader == null)?"<null>":this.hideHeader));
        sb.append(',');
        sb.append("hideFooter");
        sb.append('=');
        sb.append(((this.hideFooter == null)?"<null>":this.hideFooter));
        sb.append(',');
        sb.append("hideMobileBanner");
        sb.append('=');
        sb.append(((this.hideMobileBanner == null)?"<null>":this.hideMobileBanner));
        sb.append(',');
        sb.append("appContextProps");
        sb.append('=');
        sb.append(((this.appContextProps == null)?"<null>":this.appContextProps));
        sb.append(',');
        sb.append("headerProps");
        sb.append('=');
        sb.append(((this.headerProps == null)?"<null>":this.headerProps));
        sb.append(',');
        sb.append("mobileBannerProps");
        sb.append('=');
        sb.append(((this.mobileBannerProps == null)?"<null>":this.mobileBannerProps));
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
        result = ((result* 31)+((this.mobileBannerProps == null)? 0 :this.mobileBannerProps.hashCode()));
        result = ((result* 31)+((this.hostname == null)? 0 :this.hostname.hashCode()));
        result = ((result* 31)+((this.hideHeader == null)? 0 :this.hideHeader.hashCode()));
        result = ((result* 31)+((this.headerProps == null)? 0 :this.headerProps.hashCode()));
        result = ((result* 31)+((this.hideMobileBanner == null)? 0 :this.hideMobileBanner.hashCode()));
        result = ((result* 31)+((this.appContextProps == null)? 0 :this.appContextProps.hashCode()));
        result = ((result* 31)+((this.hideFooter == null)? 0 :this.hideFooter.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        result = ((result* 31)+((this.srpView == null)? 0 :this.srpView.hashCode()));
        result = ((result* 31)+((this.pathname == null)? 0 :this.pathname.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppShellProps) == false) {
            return false;
        }
        AppShellProps rhs = ((AppShellProps) other);
        return ((((((((((((this.mobileBannerProps == rhs.mobileBannerProps)||((this.mobileBannerProps!= null)&&this.mobileBannerProps.equals(rhs.mobileBannerProps)))&&((this.hostname == rhs.hostname)||((this.hostname!= null)&&this.hostname.equals(rhs.hostname))))&&((this.hideHeader == rhs.hideHeader)||((this.hideHeader!= null)&&this.hideHeader.equals(rhs.hideHeader))))&&((this.headerProps == rhs.headerProps)||((this.headerProps!= null)&&this.headerProps.equals(rhs.headerProps))))&&((this.hideMobileBanner == rhs.hideMobileBanner)||((this.hideMobileBanner!= null)&&this.hideMobileBanner.equals(rhs.hideMobileBanner))))&&((this.appContextProps == rhs.appContextProps)||((this.appContextProps!= null)&&this.appContextProps.equals(rhs.appContextProps))))&&((this.hideFooter == rhs.hideFooter)||((this.hideFooter!= null)&&this.hideFooter.equals(rhs.hideFooter))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))))&&((this.srpView == rhs.srpView)||((this.srpView!= null)&&this.srpView.equals(rhs.srpView))))&&((this.pathname == rhs.pathname)||((this.pathname!= null)&&this.pathname.equals(rhs.pathname))));
    }

}
