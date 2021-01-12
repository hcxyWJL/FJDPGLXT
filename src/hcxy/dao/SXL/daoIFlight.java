package hcxy.dao.SXL;

import hcxy.bean.Flight;
import hcxy.dao.IFlightdao;

import java.util.Set;

public class daoIFlight implements IFlightdao {

    @Override
    public void insertFlight(Flight flight) {
        System.out.println("数据到达dao层"+flight);
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightbystarTime(String starTime) {
        return null;
    }

    @Override
    public Flight getFlightbystartairport(String startairport) {
        return null;
    }

    @Override
    public Flight getFlightbyarrivalairport(String arrivalairport) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
