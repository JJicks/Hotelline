package site.fieldmaus.hotelline;

public class FlightItem {
    String airname;
    String flightcode;
    String dept;
    String dest;
    String starttime;
    String endtime;
    String score;
    String value;

    public FlightItem(String airname, String dept, String dest, String flightcode, String starttime, String endtime, String score, String value) {
        this.airname = airname;
        this.dept = dept;
        this.dest = dest;
        this.flightcode = flightcode;
        this.starttime = starttime;
        this.endtime = endtime;
        this.score = score;
        this.value = value;
    }

    public String getAirname() {
        return airname;
    }

    public void setAirname(String airname) {
        this.airname = airname;
    }

    public String getFlightcode() {
        return flightcode;
    }

    public void setFlightcode(String flightcode) {
        this.flightcode = flightcode;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
