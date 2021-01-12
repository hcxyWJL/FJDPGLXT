package hcxy.bll.impl;

import hcxy.bean.Flight;
import hcxy.bll.IFlightService;
import hcxy.dao.IFlightdao;
import hcxy.dao.SXL.daoIFlight;

import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    IFlightdao iFlightdao;

    public FlightServiceImpl() {
        iFlightdao=new daoIFlight();
    }

    public void insertFlight(Flight flight) {
        System.out.println("数据从ui到bull层"+flight);
        iFlightdao.insertFlight(flight);
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
