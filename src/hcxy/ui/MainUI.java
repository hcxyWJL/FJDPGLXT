package hcxy.ui;

import hcxy.bean.Flight;
import hcxy.bll.IFlightService;
import hcxy.bll.impl.FlightServiceImpl;
import hcxy.dao.IFlightdao;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainUI {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("按1，录入航班信息");
            System.out.println("按2，显示航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，预定机票");
            System.out.println("按5，退票");
            System.out.println("按6，退出系统");
            int choice=sc.nextInt();
            if (choice==1)
            {

                String id= UUID.randomUUID().toString();
               id=id.replaceAll("-","");
                System.out.print("航班号：");
                String flightid=sc.next();
                System.out.print("机型：");
                String planeType=sc.next();
                System.out.print("目前座位数：");
                int currentseatsnum=sc.nextInt();
                System.out.print("起飞机场：");
                String startairport=sc.next();
                System.out.print("目的机场：");
                String arrivalairport=sc.next();
                System.out.print("起飞时间：");
                String starTime=sc.next();

                Flight flight = new Flight(id,flightid,planeType,currentseatsnum,startairport,arrivalairport,starTime);
                IFlightService iFlightService =new FlightServiceImpl();
                try {
                    iFlightService.insertFlight(flight);
                } catch (SQLException e) {
                    String errorMessage = e.getMessage();
                    if (errorMessage.startsWith("ORA-12899")) {
                        //ORA-12899: value too large for column "OPTS"."FLIGHT"."ID" (actual: 32, maximum: 30)
                      // String pattern = "(\\w+-\\d{5}):(\\s\\w+)+\\s(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                        // ORA-12899: 列 "OPTS"."FLIGHT"."ID" 的值太大 (实际值: 36, 最大值: 32)
                        // String pattern="(\\w+-\\d{5}):(\\W)+\\s(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                        //\W	匹配任何非单词字符.
                       String pattern="(\\W)+(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                       //pattern="( ORA-12899: 列 )("OPTS").("FLIGHT").("ID")";
                        // 创建 Pattern 对象
                        Pattern r = Pattern.compile(pattern);
                        // 现在创建 matcher 对象
                        Matcher m = r.matcher(errorMessage);
                        if (m.find()) {

                            String tableName = m.group(3);
                            String columnName = m.group(4);
                            System.out.println(tableName + "表的" + columnName + "这一列的值过大，请仔细检查");
                        } else {
                            System.out.println("NO MATCH");
                        }
                    }
                }
            }
            else if (choice==2)
            {
                IFlightService iFlightService =new FlightServiceImpl();
                try {
                    Set<Flight> allFlights=iFlightService.getAllFlights();
                    for(Flight flight:allFlights)
                    {
                        System.out.println(flight);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            else if (choice==6)
            {
                System.out.println("系统退出！");
                break;
            }
        }
    }
}
