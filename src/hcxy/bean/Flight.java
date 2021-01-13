package hcxy.bean;

public class Flight {
    private  String  id;
    private  String flightid;
    private  String planeType;//����
    private  int  currentseatsnum;//����
    private  String startairport; //��ɻ���
    private  String arrivalairport;//�������
    private  String starTime; //��ʼʱ��


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
                "�����='" + flightid + '\'' +
                ", ����='" + planeType + '\'' +
                ", ��ǰ��λ��=" + currentseatsnum +
                ", ��ɻ���='" + startairport + '\'' +
                ", Ŀ�Ļ���='" + arrivalairport + '\'' +
                ", ���ʱ��='" + starTime + '\'' +
                '}';
    }
}
