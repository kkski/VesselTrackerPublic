
package pl.kkski.vesseltracker.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "latitude",
    "longitude",
    "nauticalmilesradius",
    "totalvessel",
    "vessels"
})
@Generated("jsonschema2pojo")
public class ReferencePoint {

    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("nauticalmilesradius")
    private Integer nauticalmilesradius;
    @JsonProperty("totalvessel")
    private Integer totalvessel;
    @JsonProperty("vessels")
    private List<Vessel> vessels = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("nauticalmilesradius")
    public Integer getNauticalmilesradius() {
        return nauticalmilesradius;
    }

    @JsonProperty("nauticalmilesradius")
    public void setNauticalmilesradius(Integer nauticalmilesradius) {
        this.nauticalmilesradius = nauticalmilesradius;
    }

    @JsonProperty("totalvessel")
    public Integer getTotalvessel() {
        return totalvessel;
    }

    @JsonProperty("totalvessel")
    public void setTotalvessel(Integer totalvessel) {
        this.totalvessel = totalvessel;
    }

    @JsonProperty("vessels")
    public List<Vessel> getVessels() {
        return vessels;
    }

    @JsonProperty("vessels")
    public void setVessels(List<Vessel> vessels) {
        this.vessels = vessels;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
