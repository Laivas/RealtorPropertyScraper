
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
    "85122",
    "85123",
    "ne_casa_grande_east",
    "ne_downtown_casa_grande",
    "ne_evergreen",
    "ne_park_west",
    "ne_casa_grande_vista",
    "casa_grande",
    "maricopa",
    "eloy",
    "florence",
    "coolidge"
})
@Generated("jsonschema2pojo")
public class DataPoints {

    @JsonProperty("85122")
    private scrapperGenerated._85122 _85122;
    @JsonProperty("85123")
    private scrapperGenerated._85123 _85123;
    @JsonProperty("ne_casa_grande_east")
    private NeCasaGrandeEast neCasaGrandeEast;
    @JsonProperty("ne_downtown_casa_grande")
    private NeDowntownCasaGrande neDowntownCasaGrande;
    @JsonProperty("ne_evergreen")
    private NeEvergreen neEvergreen;
    @JsonProperty("ne_park_west")
    private NeParkWest neParkWest;
    @JsonProperty("ne_casa_grande_vista")
    private NeCasaGrandeVista neCasaGrandeVista;
    @JsonProperty("casa_grande")
    private CasaGrande casaGrande;
    @JsonProperty("maricopa")
    private Maricopa maricopa;
    @JsonProperty("eloy")
    private Eloy eloy;
    @JsonProperty("florence")
    private Florence florence;
    @JsonProperty("coolidge")
    private Coolidge coolidge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("85122")
    public scrapperGenerated._85122 get85122() {
        return _85122;
    }

    @JsonProperty("85122")
    public void set85122(scrapperGenerated._85122 _85122) {
        this._85122 = _85122;
    }

    @JsonProperty("85123")
    public scrapperGenerated._85123 get85123() {
        return _85123;
    }

    @JsonProperty("85123")
    public void set85123(scrapperGenerated._85123 _85123) {
        this._85123 = _85123;
    }

    @JsonProperty("ne_casa_grande_east")
    public NeCasaGrandeEast getNeCasaGrandeEast() {
        return neCasaGrandeEast;
    }

    @JsonProperty("ne_casa_grande_east")
    public void setNeCasaGrandeEast(NeCasaGrandeEast neCasaGrandeEast) {
        this.neCasaGrandeEast = neCasaGrandeEast;
    }

    @JsonProperty("ne_downtown_casa_grande")
    public NeDowntownCasaGrande getNeDowntownCasaGrande() {
        return neDowntownCasaGrande;
    }

    @JsonProperty("ne_downtown_casa_grande")
    public void setNeDowntownCasaGrande(NeDowntownCasaGrande neDowntownCasaGrande) {
        this.neDowntownCasaGrande = neDowntownCasaGrande;
    }

    @JsonProperty("ne_evergreen")
    public NeEvergreen getNeEvergreen() {
        return neEvergreen;
    }

    @JsonProperty("ne_evergreen")
    public void setNeEvergreen(NeEvergreen neEvergreen) {
        this.neEvergreen = neEvergreen;
    }

    @JsonProperty("ne_park_west")
    public NeParkWest getNeParkWest() {
        return neParkWest;
    }

    @JsonProperty("ne_park_west")
    public void setNeParkWest(NeParkWest neParkWest) {
        this.neParkWest = neParkWest;
    }

    @JsonProperty("ne_casa_grande_vista")
    public NeCasaGrandeVista getNeCasaGrandeVista() {
        return neCasaGrandeVista;
    }

    @JsonProperty("ne_casa_grande_vista")
    public void setNeCasaGrandeVista(NeCasaGrandeVista neCasaGrandeVista) {
        this.neCasaGrandeVista = neCasaGrandeVista;
    }

    @JsonProperty("casa_grande")
    public CasaGrande getCasaGrande() {
        return casaGrande;
    }

    @JsonProperty("casa_grande")
    public void setCasaGrande(CasaGrande casaGrande) {
        this.casaGrande = casaGrande;
    }

    @JsonProperty("maricopa")
    public Maricopa getMaricopa() {
        return maricopa;
    }

    @JsonProperty("maricopa")
    public void setMaricopa(Maricopa maricopa) {
        this.maricopa = maricopa;
    }

    @JsonProperty("eloy")
    public Eloy getEloy() {
        return eloy;
    }

    @JsonProperty("eloy")
    public void setEloy(Eloy eloy) {
        this.eloy = eloy;
    }

    @JsonProperty("florence")
    public Florence getFlorence() {
        return florence;
    }

    @JsonProperty("florence")
    public void setFlorence(Florence florence) {
        this.florence = florence;
    }

    @JsonProperty("coolidge")
    public Coolidge getCoolidge() {
        return coolidge;
    }

    @JsonProperty("coolidge")
    public void setCoolidge(Coolidge coolidge) {
        this.coolidge = coolidge;
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
        sb.append(DataPoints.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_85122");
        sb.append('=');
        sb.append(((this._85122 == null)?"<null>":this._85122));
        sb.append(',');
        sb.append("_85123");
        sb.append('=');
        sb.append(((this._85123 == null)?"<null>":this._85123));
        sb.append(',');
        sb.append("neCasaGrandeEast");
        sb.append('=');
        sb.append(((this.neCasaGrandeEast == null)?"<null>":this.neCasaGrandeEast));
        sb.append(',');
        sb.append("neDowntownCasaGrande");
        sb.append('=');
        sb.append(((this.neDowntownCasaGrande == null)?"<null>":this.neDowntownCasaGrande));
        sb.append(',');
        sb.append("neEvergreen");
        sb.append('=');
        sb.append(((this.neEvergreen == null)?"<null>":this.neEvergreen));
        sb.append(',');
        sb.append("neParkWest");
        sb.append('=');
        sb.append(((this.neParkWest == null)?"<null>":this.neParkWest));
        sb.append(',');
        sb.append("neCasaGrandeVista");
        sb.append('=');
        sb.append(((this.neCasaGrandeVista == null)?"<null>":this.neCasaGrandeVista));
        sb.append(',');
        sb.append("casaGrande");
        sb.append('=');
        sb.append(((this.casaGrande == null)?"<null>":this.casaGrande));
        sb.append(',');
        sb.append("maricopa");
        sb.append('=');
        sb.append(((this.maricopa == null)?"<null>":this.maricopa));
        sb.append(',');
        sb.append("eloy");
        sb.append('=');
        sb.append(((this.eloy == null)?"<null>":this.eloy));
        sb.append(',');
        sb.append("florence");
        sb.append('=');
        sb.append(((this.florence == null)?"<null>":this.florence));
        sb.append(',');
        sb.append("coolidge");
        sb.append('=');
        sb.append(((this.coolidge == null)?"<null>":this.coolidge));
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
        result = ((result* 31)+((this.neCasaGrandeVista == null)? 0 :this.neCasaGrandeVista.hashCode()));
        result = ((result* 31)+((this.neCasaGrandeEast == null)? 0 :this.neCasaGrandeEast.hashCode()));
        result = ((result* 31)+((this.florence == null)? 0 :this.florence.hashCode()));
        result = ((result* 31)+((this.neParkWest == null)? 0 :this.neParkWest.hashCode()));
        result = ((result* 31)+((this.casaGrande == null)? 0 :this.casaGrande.hashCode()));
        result = ((result* 31)+((this.maricopa == null)? 0 :this.maricopa.hashCode()));
        result = ((result* 31)+((this.neEvergreen == null)? 0 :this.neEvergreen.hashCode()));
        result = ((result* 31)+((this.coolidge == null)? 0 :this.coolidge.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._85123 == null)? 0 :this._85123 .hashCode()));
        result = ((result* 31)+((this.neDowntownCasaGrande == null)? 0 :this.neDowntownCasaGrande.hashCode()));
        result = ((result* 31)+((this.eloy == null)? 0 :this.eloy.hashCode()));
        result = ((result* 31)+((this._85122 == null)? 0 :this._85122 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataPoints) == false) {
            return false;
        }
        DataPoints rhs = ((DataPoints) other);
        return ((((((((((((((this.neCasaGrandeVista == rhs.neCasaGrandeVista)||((this.neCasaGrandeVista!= null)&&this.neCasaGrandeVista.equals(rhs.neCasaGrandeVista)))&&((this.neCasaGrandeEast == rhs.neCasaGrandeEast)||((this.neCasaGrandeEast!= null)&&this.neCasaGrandeEast.equals(rhs.neCasaGrandeEast))))&&((this.florence == rhs.florence)||((this.florence!= null)&&this.florence.equals(rhs.florence))))&&((this.neParkWest == rhs.neParkWest)||((this.neParkWest!= null)&&this.neParkWest.equals(rhs.neParkWest))))&&((this.casaGrande == rhs.casaGrande)||((this.casaGrande!= null)&&this.casaGrande.equals(rhs.casaGrande))))&&((this.maricopa == rhs.maricopa)||((this.maricopa!= null)&&this.maricopa.equals(rhs.maricopa))))&&((this.neEvergreen == rhs.neEvergreen)||((this.neEvergreen!= null)&&this.neEvergreen.equals(rhs.neEvergreen))))&&((this.coolidge == rhs.coolidge)||((this.coolidge!= null)&&this.coolidge.equals(rhs.coolidge))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._85123 == rhs._85123)||((this._85123 != null)&&this._85123 .equals(rhs._85123))))&&((this.neDowntownCasaGrande == rhs.neDowntownCasaGrande)||((this.neDowntownCasaGrande!= null)&&this.neDowntownCasaGrande.equals(rhs.neDowntownCasaGrande))))&&((this.eloy == rhs.eloy)||((this.eloy!= null)&&this.eloy.equals(rhs.eloy))))&&((this._85122 == rhs._85122)||((this._85122 != null)&&this._85122 .equals(rhs._85122))));
    }

}
