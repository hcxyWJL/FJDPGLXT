package hcxy.dao.SXL;

import hcxy.bean.Flight;
import hcxy.dao.IFlightdao;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class daoIFlight implements IFlightdao {

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="INSERT  INTO flight VALUES(?,?,?,?,?,?,?)";

        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,flight.getId());
        pstmt.setString(2,flight.getFlightid());
        pstmt.setString(3,flight.getPlaneType());
        pstmt.setInt(4,flight.getCurrentseatsnum());
        pstmt.setString(5,flight.getStartairport());
        pstmt.setString(6,flight.getArrivalairport());
        pstmt.setString(7,flight.getStarTime());

        pstmt.executeUpdate();
        System.out.println("≤Â»Î≥…π¶£°");
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {
        Set<Flight> AllFlights = new HashSet<Flight>();
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="SELECT * FROM flight";
        PreparedStatement pstmt=conn.prepareStatement(sql);

        ResultSet rs=pstmt.executeQuery();
        while (rs.next()) {
            String id = rs.getString("ID");
            String flightid = rs.getNString("FLIGHT_ID");
            String planeType = rs.getString("PLANE_TYPE");
            int currentseatsnum = rs.getInt("TOTAL_SEATS_NUM");
            String startairport = rs.getString("DEPARTURE_AIRPORT");
            String arrivalairport = rs.getString("DESTINATION_AIRPORT");
            String starTime = rs.getString("DEPARTURE_TIME");
            Flight flight = new Flight(id,flightid,planeType,currentseatsnum,startairport,arrivalairport,starTime);

            AllFlights.add(flight);
        }
        return AllFlights;
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
