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
            System.out.println("��1��¼�뺽����Ϣ");
            System.out.println("��2����ʾ������Ϣ");
            System.out.println("��3����ѯ������Ϣ");
            System.out.println("��4��Ԥ����Ʊ");
            System.out.println("��5����Ʊ");
            System.out.println("��6���˳�ϵͳ");
            int choice=sc.nextInt();
            if (choice==1)
            {

                String id= UUID.randomUUID().toString();
               id=id.replaceAll("-","");
                System.out.print("����ţ�");
                String flightid=sc.next();
                System.out.print("���ͣ�");
                String planeType=sc.next();
                System.out.print("Ŀǰ��λ����");
                int currentseatsnum=sc.nextInt();
                System.out.print("��ɻ�����");
                String startairport=sc.next();
                System.out.print("Ŀ�Ļ�����");
                String arrivalairport=sc.next();
                System.out.print("���ʱ�䣺");
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
                        // ORA-12899: �� "OPTS"."FLIGHT"."ID" ��ֵ̫�� (ʵ��ֵ: 36, ���ֵ: 32)
                        // String pattern="(\\w+-\\d{5}):(\\W)+\\s(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                        //\W	ƥ���κηǵ����ַ�.
                       String pattern="(\\W)+(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                       //pattern="( ORA-12899: �� )("OPTS").("FLIGHT").("ID")";
                        // ���� Pattern ����
                        Pattern r = Pattern.compile(pattern);
                        // ���ڴ��� matcher ����
                        Matcher m = r.matcher(errorMessage);
                        if (m.find()) {

                            String tableName = m.group(3);
                            String columnName = m.group(4);
                            System.out.println(tableName + "���" + columnName + "��һ�е�ֵ��������ϸ���");
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
                System.out.println("ϵͳ�˳���");
                break;
            }
        }
    }
}
