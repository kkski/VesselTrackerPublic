package pl.kkski.vesseltracker.dtos;

public class VesselDto {

    private String course;
    private String destination;
    private String flag;
    private Double lat;
    private Double lon;
    private String shipname;
    private String shipid;

    public String getShipid() {
        return shipid;
    }

    public void setShipid(String shipid) {
        this.shipid = shipid;
    }

    public VesselDto(String course, String destination, String flag, Double lat, Double lon, String shipname, String typename, String statusname, String shipid) {
        this.course = course;
        this.destination = destination;
        this.flag = flag;
        this.lat = lat;
        this.lon = lon;
        this.shipname = shipname;
        this.typename = typename;
        this.statusname = statusname;
        this.shipid = shipid;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    private String typename;
    private String statusname;

}
