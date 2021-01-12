package hcxy.ui;

import hcxy.bean.Flight;
import hcxy.bll.IFlightService;
import hcxy.bll.impl.FlightServiceImpl;
import hcxy.dao.IFlightdao;

import java.util.Scanner;
import java.util.UUID;

public class MainUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("按1，录入航班信息");
            System.out.println("按2，显示航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，预定机票");
            System.out.println("按5，退票");
            System.out.println("按6，退出系统");

            if (sc.nextInt()==1)
            {
              /*  private String  id;
                private  String flightid;
                private  String planeType;//机型
                 private  String currentseatsnum;//目前座位数
                private  String startairport; //起飞机场
                private  String arrivalairport;//到达机场
                private  String starTime; //起始时间

               */
                String id= UUID.randomUUID().toString();
                id.replaceAll("-","");
                System.out.print("航班号：");
                String flightid=sc.next();
                System.out.print("机型：");
                String planeType=sc.next();
                System.out.print("目前座位数：");
                String currentseatsnum=sc.next();
                System.out.print("起飞机场：");
                String startairport=sc.next();
                System.out.print("目的机场：");
                String arrivalairport=sc.next();
                System.out.print("起飞时间：");
                String starTime=sc.next();

                Flight flight = new Flight(flightid,planeType,currentseatsnum,startairport,arrivalairport,starTime);
                IFlightService iFlightService =new FlightServiceImpl();
                iFlightService.insertFlight(flight);
            }
            else if (sc.nextInt()==6)
            {
                System.out.println("系统退出！");
                break;
            }
        }
    }
}
