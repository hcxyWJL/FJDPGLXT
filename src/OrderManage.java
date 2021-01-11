import java.util.Set;

public class OrderManage {
    private  String  id;
    private  float TicekType; //票的类型、单价
    private  float airporttax;//机场税
    private  float rys;//燃油税
    private  float hkzhx;//航空综合险
    private  float jptgx;//机票退改险
    private  float yhq;//优惠券
    private  float hszj;//含税总价
    private Set<Customer> customer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getTicekType() {
        return TicekType;
    }

    public void setTicekType(float ticekType) {
        TicekType = ticekType;
    }

    public float getAirporttax() {
        return airporttax;
    }

    public void setAirporttax(float airporttax) {
        this.airporttax = airporttax;
    }

    public float getRys() {
        return rys;
    }

    public void setRys(float rys) {
        this.rys = rys;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getJptgx() {
        return jptgx;
    }

    public void setJptgx(float jptgx) {
        this.jptgx = jptgx;
    }

    public float getYhq() {
        return yhq;
    }

    public void setYhq(float yhq) {
        this.yhq = yhq;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }

    public Set<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Set<Customer> customer) {
        this.customer = customer;
    }
}
