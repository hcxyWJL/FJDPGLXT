package hcxy.dao;

import hcxy.bean.Flight;

import java.util.Set;

public interface IFlightdao {
    void insertFlight(Flight flight);//信息录入
    Set<Flight> getAllFlights();//得到全部航班信息
    Flight getFlightbystarTime(String starTime);
    Flight getFlightbystartairport(String startairport);//获取起飞机场
    Flight getFlightbyarrivalairport(String arrivalairport);//获取降落机场
    void updateFlight(Flight flight);//更新航班信息
}
