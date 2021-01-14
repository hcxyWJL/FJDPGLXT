package hcxy.dao;

import hcxy.bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightdao {
    void insertFlight(Flight flight) throws SQLException;//信息录入
    Set<Flight> getAllFlights() throws SQLException;//得到全部航班信息
    Flight getFlightbystarTime(String starTime) throws SQLException;
    Flight getFlightbystartairport(String startairport) throws SQLException;//获取起飞机场
    Flight getFlightbyarrivalairport(String arrivalairport) throws SQLException;//获取降落机场
    void updateFlight(Flight flight);//更新航班信息
}
