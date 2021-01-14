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
        Set<Flight> allFlight=new HashSet<Flight>();
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="SELECT * FROM flight";
        PreparedStatement pstmt=conn.prepareStatement(sql);

        ResultSet rs=pstmt.executeQuery();
        while (rs.next())
        {
            String  id=rs.getString("Id");
            String flightid=rs.getString("FLIGHT_ID");
            String planeType=rs.getString("PLANE_TYPE");
            int  currentseatsnum=rs.getInt("TOTAL_SEATS_NUM");
            String startairport=rs.getString("DEPARTURE_AIRPORT");
            String arrivalairport=rs.getString("DESTINATION_AIRPORT");
            String starTime=rs.getString("DEPARTURE_TIME");

            Flight flight = new Flight(id,flightid,planeType,currentseatsnum,startairport,arrivalairport,starTime);
            allFlight.add(flight);
        }
        return allFlight;
    }

    @Override
    public Flight getFlightbystarTime(String starTime) throws SQLException {
        String sql="SELECT FLIGHT_ID,PLANE_TYPE,\n" +
                "TOTAL_SEATS_NUM,DEPARTURE_AIRPORT,\n" +
                "DESTINATION_AIRPORT,DEPARTURE_TIME FROM flight \n" +
                "WHERE DEPARTURE_TIME=?";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Flight flight=null;
        Connection conn= DriverManager.getConnection(url,username,password);
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,starTime);
        ResultSet rs=pstmt.executeQuery();

        while (rs.next())
        {
            String flightid=rs.getString("FLIGHT_ID");
            String planeType=rs.getString("PLANE_TYPE");
            int  currentseatsnum=rs.getInt("TOTAL_SEATS_NUM");
            String startairport=rs.getString("DEPARTURE_AIRPORT");
            String arrivalairport=rs.getString("DESTINATION_AIRPORT");
            String starTimes=rs.getString("DEPARTURE_TIME");
             flight = new Flight(flightid,planeType,currentseatsnum,startairport,arrivalairport,starTimes);

        }
        return flight;
    }

    @Override
    public Flight getFlightbystartairport(String startairport) throws SQLException {
        String sql="select FLIGHT_ID,PLANE_TYPE,TOTAL_SEATS_NUM,DEPARTURE_AIRPORT,DESTINATION_AIRPORT,DEPARTURE_TIME from flight\n" +
                "where DEPARTURE_AIRPORT=?";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Flight flight=null;
        Connection conn= DriverManager.getConnection(url,username,password);
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,startairport);
        ResultSet rs=pstmt.executeQuery();
        while (rs.next())
        {
            String flightid=rs.getString("FLIGHT_ID");
            String planeType=rs.getString("PLANE_TYPE");
            int  currentseatsnum=rs.getInt("TOTAL_SEATS_NUM");
            String startairports=rs.getString("DEPARTURE_AIRPORT");
            String arrivalairport=rs.getString("DESTINATION_AIRPORT");
            String starTime=rs.getString("DEPARTURE_TIME");
            flight = new Flight(flightid,planeType,currentseatsnum,startairport,arrivalairport,starTime);

        }
        return flight;
    }

    @Override
    public Flight getFlightbyarrivalairport(String arrivalairport) throws SQLException {
        String sql="select FLIGHT_ID,PLANE_TYPE,TOTAL_SEATS_NUM,DEPARTURE_AIRPORT,DESTINATION_AIRPORT,DEPARTURE_TIME from flight\n" +
                "where DESTINATION_AIRPORT=?";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Flight flight=null;
        Connection conn= DriverManager.getConnection(url,username,password);
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,arrivalairport);
        ResultSet rs=pstmt.executeQuery();
        while (rs.next())
        {
            String flightid=rs.getString("FLIGHT_ID");
            String planeType=rs.getString("PLANE_TYPE");
            int  currentseatsnum=rs.getInt("TOTAL_SEATS_NUM");
            String startairport=rs.getString("DEPARTURE_AIRPORT");
            String arrivalairports=rs.getString("DESTINATION_AIRPORT");
            String starTime=rs.getString("DEPARTURE_TIME");
            flight = new Flight(flightid,planeType,currentseatsnum,startairport,arrivalairports,starTime);

        }
        return flight;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
