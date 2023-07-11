
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
    "pageProps",
    "appShellProps",
    "__N_SSP"
})
@Generated("jsonschema2pojo")
public class Props {

    @JsonProperty("pageProps")
    private PageProps pageProps;
    @JsonProperty("appShellProps")
    private AppShellProps appShellProps;
    @JsonProperty("__N_SSP")
    private Boolean nSsp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("pageProps")
    public PageProps getPageProps() {
        return pageProps;
    }

    @JsonProperty("pageProps")
    public void setPageProps(PageProps pageProps) {
        this.pageProps = pageProps;
    }

    @JsonProperty("appShellProps")
    public AppShellProps getAppShellProps() {
        return appShellProps;
    }

    @JsonProperty("appShellProps")
    public void setAppShellProps(AppShellProps appShellProps) {
        this.appShellProps = appShellProps;
    }

    @JsonProperty("__N_SSP")
    public Boolean getNSsp() {
        return nSsp;
    }

    @JsonProperty("__N_SSP")
    public void setNSsp(Boolean nSsp) {
        this.nSsp = nSsp;
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
        sb.append(Props.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pageProps");
        sb.append('=');
        sb.append(((this.pageProps == null)?"<null>":this.pageProps));
        sb.append(',');
        sb.append("appShellProps");
        sb.append('=');
        sb.append(((this.appShellProps == null)?"<null>":this.appShellProps));
        sb.append(',');
        sb.append("nSsp");
        sb.append('=');
        sb.append(((this.nSsp == null)?"<null>":this.nSsp));
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
        result = ((result* 31)+((this.appShellProps == null)? 0 :this.appShellProps.hashCode()));
        result = ((result* 31)+((this.nSsp == null)? 0 :this.nSsp.hashCode()));
        result = ((result* 31)+((this.pageProps == null)? 0 :this.pageProps.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Props) == false) {
            return false;
        }
        Props rhs = ((Props) other);
        return (((((this.appShellProps == rhs.appShellProps)||((this.appShellProps!= null)&&this.appShellProps.equals(rhs.appShellProps)))&&((this.nSsp == rhs.nSsp)||((this.nSsp!= null)&&this.nSsp.equals(rhs.nSsp))))&&((this.pageProps == rhs.pageProps)||((this.pageProps!= null)&&this.pageProps.equals(rhs.pageProps))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
