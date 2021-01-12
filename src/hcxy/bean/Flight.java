package hcxy.bean;

public class Flight {
    private String  id;
    private  String flightid;
    private  String planeType;//机型
    private  String currentseatsnum;//总数
    private  String startairport; //起飞机场
    private  String arrivalairport;//到达机场
    private  String starTime; //起始时间


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getStartairport() {
        return startairport;
    }

    public void setStartairport(String startairport) {
        this.startairport = startairport;
    }

    public String getArrivalairport() {
        return arrivalairport;
    }

    public void setArrivalairport(String arrivalairport) {
        this.arrivalairport = arrivalairport;
    }

    public String getStarTime() {
        return starTime;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public String getCurrentseatsnum() {
        return currentseatsnum;
    }

    public void setCurrentseatsnum(String currentseatsnum) {
        this.currentseatsnum = currentseatsnum;
    }

    public Flight(String flightid, String planeType, String currentseatsnum, String startairport, String arrivalairport, String starTime) {

        this.flightid = flightid;
        this.planeType = planeType;
        this.currentseatsnum = currentseatsnum;
        this.startairport = startairport;
        this.arrivalairport = arrivalairport;
        this.starTime = starTime;
    }

    @Override
    public String toString() {
        return "Flight{" +" flightid='" + flightid + '\'' +
                ", planeType='" + planeType + '\'' +
                ", currentseatsnum='" + currentseatsnum + '\'' +
                ", startairport='" + startairport + '\'' +
                ", arrivalairport='" + arrivalairport + '\'' +
                ", starTime='" + starTime + '\'' +
                '}';
    }
}
