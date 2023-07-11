
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
    "isDisabled",
    "userId",
    "attributes",
    "userAgent",
    "queryParams",
    "project",
    "env"
})
@Generated("jsonschema2pojo")
public class InitialProps {

    @JsonProperty("isDisabled")
    private Boolean isDisabled;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("attributes")
    private Attributes__4 attributes;
    @JsonProperty("userAgent")
    private String userAgent;
    @JsonProperty("queryParams")
    private QueryParams queryParams;
    @JsonProperty("project")
    private String project;
    @JsonProperty("env")
    private String env;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("isDisabled")
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    @JsonProperty("isDisabled")
    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("attributes")
    public Attributes__4 getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(Attributes__4 attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("userAgent")
    public String getUserAgent() {
        return userAgent;
    }

    @JsonProperty("userAgent")
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @JsonProperty("queryParams")
    public QueryParams getQueryParams() {
        return queryParams;
    }

    @JsonProperty("queryParams")
    public void setQueryParams(QueryParams queryParams) {
        this.queryParams = queryParams;
    }

    @JsonProperty("project")
    public String getProject() {
        return project;
    }

    @JsonProperty("project")
    public void setProject(String project) {
        this.project = project;
    }

    @JsonProperty("env")
    public String getEnv() {
        return env;
    }

    @JsonProperty("env")
    public void setEnv(String env) {
        this.env = env;
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
        sb.append(InitialProps.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isDisabled");
        sb.append('=');
        sb.append(((this.isDisabled == null)?"<null>":this.isDisabled));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("attributes");
        sb.append('=');
        sb.append(((this.attributes == null)?"<null>":this.attributes));
        sb.append(',');
        sb.append("userAgent");
        sb.append('=');
        sb.append(((this.userAgent == null)?"<null>":this.userAgent));
        sb.append(',');
        sb.append("queryParams");
        sb.append('=');
        sb.append(((this.queryParams == null)?"<null>":this.queryParams));
        sb.append(',');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
        sb.append(',');
        sb.append("env");
        sb.append('=');
        sb.append(((this.env == null)?"<null>":this.env));
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
        result = ((result* 31)+((this.queryParams == null)? 0 :this.queryParams.hashCode()));
        result = ((result* 31)+((this.project == null)? 0 :this.project.hashCode()));
        result = ((result* 31)+((this.attributes == null)? 0 :this.attributes.hashCode()));
        result = ((result* 31)+((this.userAgent == null)? 0 :this.userAgent.hashCode()));
        result = ((result* 31)+((this.isDisabled == null)? 0 :this.isDisabled.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InitialProps) == false) {
            return false;
        }
        InitialProps rhs = ((InitialProps) other);
        return (((((((((this.queryParams == rhs.queryParams)||((this.queryParams!= null)&&this.queryParams.equals(rhs.queryParams)))&&((this.project == rhs.project)||((this.project!= null)&&this.project.equals(rhs.project))))&&((this.attributes == rhs.attributes)||((this.attributes!= null)&&this.attributes.equals(rhs.attributes))))&&((this.userAgent == rhs.userAgent)||((this.userAgent!= null)&&this.userAgent.equals(rhs.userAgent))))&&((this.isDisabled == rhs.isDisabled)||((this.isDisabled!= null)&&this.isDisabled.equals(rhs.isDisabled))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
