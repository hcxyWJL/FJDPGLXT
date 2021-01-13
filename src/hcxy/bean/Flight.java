package hcxy.bean;

public class Flight {
    private  String  id;
    private  String flightid;
    private  String planeType;//机型
    private  int  currentseatsnum;//总数
    private  String startairport; //起飞机场
    private  String arrivalairport;//到达机场
    private  String starTime; //起始时间


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid;
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

    public int getCurrentseatsnum() {
        return currentseatsnum;
    }

    public void setCurrentseatsnum(int currentseatsnum) {
        this.currentseatsnum = currentseatsnum;
    }

    public Flight(String id,String flightid, String planeType, int currentseatsnum, String startairport, String arrivalairport, String starTime) {
        this.id=id;
        this.flightid = flightid;
        this.planeType = planeType;
        this.currentseatsnum = currentseatsnum;
        this.startairport = startairport;
        this.arrivalairport = arrivalairport;
        this.starTime = starTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "航班号='" + flightid + '\'' +
                ", 机型='" + planeType + '\'' +
                ", 当前座位数=" + currentseatsnum +
                ", 起飞机场='" + startairport + '\'' +
                ", 目的机场='" + arrivalairport + '\'' +
                ", 起飞时间='" + starTime + '\'' +
                '}';
    }
}
