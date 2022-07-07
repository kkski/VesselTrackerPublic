package pl.kkski.vesseltracker.model;

import java.util.HashMap;
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
    "COURSE",
    "DESTINATION",
    "ELAPSED",
    "FLAG",
    "HEADING",
    "LAT",
    "LENGTH",
    "LON",
    "SHIPNAME",
    "SHIPTYPE",
    "SHIPID",
    "SPEED",
    "TYPENAME",
    "WIDTH",
    "LFORE",
    "WLEFT",
    "STATUSNAME",
    "TYPEIMG"
})
@Generated("jsonschema2pojo")
public class Vessel {

    @JsonProperty("COURSE")
    private String course;
    @JsonProperty("DESTINATION")
    private String destination;
    @JsonProperty("ELAPSED")
    private String elapsed;
    @JsonProperty("FLAG")
    private String flag;
    @JsonProperty("HEADING")
    private String heading;
    @JsonProperty("LAT")
    private Double lat;
    @JsonProperty("LENGTH")
    private String length;
    @JsonProperty("LON")
    private Double lon;
    @JsonProperty("SHIPNAME")
    private String shipname;
    @JsonProperty("SHIPTYPE")
    private String shiptype;
    @JsonProperty("SHIPID")
    private String shipid;
    @JsonProperty("SPEED")
    private String speed;
    @JsonProperty("TYPENAME")
    private String typename;
    @JsonProperty("WIDTH")
    private String width;
    @JsonProperty("LFORE")
    private String lfore;
    @JsonProperty("WLEFT")
    private String wleft;
    @JsonProperty("STATUSNAME")
    private String statusname;
    @JsonProperty("TYPEIMG")
    private String typeimg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("COURSE")
    public String getCourse() {
        return course;
    }

    @JsonProperty("COURSE")
    public void setCourse(String course) {
        this.course = course;
    }

    @JsonProperty("DESTINATION")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("DESTINATION")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("ELAPSED")
    public String getElapsed() {
        return elapsed;
    }

    @JsonProperty("ELAPSED")
    public void setElapsed(String elapsed) {
        this.elapsed = elapsed;
    }

    @JsonProperty("FLAG")
    public String getFlag() {
        return flag;
    }

    @JsonProperty("FLAG")
    public void setFlag(String flag) {
        this.flag = flag;
    }

    @JsonProperty("HEADING")
    public String getHeading() {
        return heading;
    }

    @JsonProperty("HEADING")
    public void setHeading(String heading) {
        this.heading = heading;
    }

    @JsonProperty("LAT")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("LAT")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("LENGTH")
    public String getLength() {
        return length;
    }

    @JsonProperty("LENGTH")
    public void setLength(String length) {
        this.length = length;
    }

    @JsonProperty("LON")
    public Double getLon() {
        return lon;
    }

    @JsonProperty("LON")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    @JsonProperty("SHIPNAME")
    public String getShipname() {
        return shipname;
    }

    @JsonProperty("SHIPNAME")
    public void setShipname(String shipname) {
        this.shipname = shipname;
    }

    @JsonProperty("SHIPTYPE")
    public String getShiptype() {
        return shiptype;
    }

    @JsonProperty("SHIPTYPE")
    public void setShiptype(String shiptype) {
        this.shiptype = shiptype;
    }

    @JsonProperty("SHIPID")
    public String getShipid() {
        return shipid;
    }

    @JsonProperty("SHIPID")
    public void setShipid(String shipid) {
        this.shipid = shipid;
    }

    @JsonProperty("SPEED")
    public String getSpeed() {
        return speed;
    }

    @JsonProperty("SPEED")
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @JsonProperty("TYPENAME")
    public String getTypename() {
        return typename;
    }

    @JsonProperty("TYPENAME")
    public void setTypename(String typename) {
        this.typename = typename;
    }

    @JsonProperty("WIDTH")
    public String getWidth() {
        return width;
    }

    @JsonProperty("WIDTH")
    public void setWidth(String width) {
        this.width = width;
    }

    @JsonProperty("LFORE")
    public String getLfore() {
        return lfore;
    }

    @JsonProperty("LFORE")
    public void setLfore(String lfore) {
        this.lfore = lfore;
    }

    @JsonProperty("WLEFT")
    public String getWleft() {
        return wleft;
    }

    @JsonProperty("WLEFT")
    public void setWleft(String wleft) {
        this.wleft = wleft;
    }

    @JsonProperty("STATUSNAME")
    public String getStatusname() {
        return statusname;
    }

    @JsonProperty("STATUSNAME")
    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    @JsonProperty("TYPEIMG")
    public String getTypeimg() {
        return typeimg;
    }

    @JsonProperty("TYPEIMG")
    public void setTypeimg(String typeimg) {
        this.typeimg = typeimg;
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
