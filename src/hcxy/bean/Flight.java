package hcxy.bean;

public class Flight {
    private String  id;
    private  String planeType;//机型
    private  String startairport; //起飞机场
    private  String arrivalairport;//到达机场
    private  String starTime; //起始时间
    private  String seatsno; //座位号
    private  String FilghtseatsTotal;//总数

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

    public String getSeatsno() {
        return seatsno;
    }

    public void setSeatsno(String seatsno) {
        this.seatsno = seatsno;
    }

    public String getFilghtseatsTotal() {
        return FilghtseatsTotal;
    }

    public void setFilghtseatsTotal(String filghtseatsTotal) {
        FilghtseatsTotal = filghtseatsTotal;
    }
}
