
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
    "awsAccount",
    "configEnv",
    "cdnEnv",
    "assetPrefix",
    "appVersion"
})
@Generated("jsonschema2pojo")
public class RuntimeConfig {

    @JsonProperty("awsAccount")
    private String awsAccount;
    @JsonProperty("configEnv")
    private String configEnv;
    @JsonProperty("cdnEnv")
    private String cdnEnv;
    @JsonProperty("assetPrefix")
    private String assetPrefix;
    @JsonProperty("appVersion")
    private String appVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("awsAccount")
    public String getAwsAccount() {
        return awsAccount;
    }

    @JsonProperty("awsAccount")
    public void setAwsAccount(String awsAccount) {
        this.awsAccount = awsAccount;
    }

    @JsonProperty("configEnv")
    public String getConfigEnv() {
        return configEnv;
    }

    @JsonProperty("configEnv")
    public void setConfigEnv(String configEnv) {
        this.configEnv = configEnv;
    }

    @JsonProperty("cdnEnv")
    public String getCdnEnv() {
        return cdnEnv;
    }

    @JsonProperty("cdnEnv")
    public void setCdnEnv(String cdnEnv) {
        this.cdnEnv = cdnEnv;
    }

    @JsonProperty("assetPrefix")
    public String getAssetPrefix() {
        return assetPrefix;
    }

    @JsonProperty("assetPrefix")
    public void setAssetPrefix(String assetPrefix) {
        this.assetPrefix = assetPrefix;
    }

    @JsonProperty("appVersion")
    public String getAppVersion() {
        return appVersion;
    }

    @JsonProperty("appVersion")
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
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
        sb.append(RuntimeConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("awsAccount");
        sb.append('=');
        sb.append(((this.awsAccount == null)?"<null>":this.awsAccount));
        sb.append(',');
        sb.append("configEnv");
        sb.append('=');
        sb.append(((this.configEnv == null)?"<null>":this.configEnv));
        sb.append(',');
        sb.append("cdnEnv");
        sb.append('=');
        sb.append(((this.cdnEnv == null)?"<null>":this.cdnEnv));
        sb.append(',');
        sb.append("assetPrefix");
        sb.append('=');
        sb.append(((this.assetPrefix == null)?"<null>":this.assetPrefix));
        sb.append(',');
        sb.append("appVersion");
        sb.append('=');
        sb.append(((this.appVersion == null)?"<null>":this.appVersion));
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
        result = ((result* 31)+((this.appVersion == null)? 0 :this.appVersion.hashCode()));
        result = ((result* 31)+((this.cdnEnv == null)? 0 :this.cdnEnv.hashCode()));
        result = ((result* 31)+((this.assetPrefix == null)? 0 :this.assetPrefix.hashCode()));
        result = ((result* 31)+((this.awsAccount == null)? 0 :this.awsAccount.hashCode()));
        result = ((result* 31)+((this.configEnv == null)? 0 :this.configEnv.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuntimeConfig) == false) {
            return false;
        }
        RuntimeConfig rhs = ((RuntimeConfig) other);
        return (((((((this.appVersion == rhs.appVersion)||((this.appVersion!= null)&&this.appVersion.equals(rhs.appVersion)))&&((this.cdnEnv == rhs.cdnEnv)||((this.cdnEnv!= null)&&this.cdnEnv.equals(rhs.cdnEnv))))&&((this.assetPrefix == rhs.assetPrefix)||((this.assetPrefix!= null)&&this.assetPrefix.equals(rhs.assetPrefix))))&&((this.awsAccount == rhs.awsAccount)||((this.awsAccount!= null)&&this.awsAccount.equals(rhs.awsAccount))))&&((this.configEnv == rhs.configEnv)||((this.configEnv!= null)&&this.configEnv.equals(rhs.configEnv))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
