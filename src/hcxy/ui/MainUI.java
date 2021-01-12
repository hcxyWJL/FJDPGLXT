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
            System.out.println("��1��¼�뺽����Ϣ");
            System.out.println("��2����ʾ������Ϣ");
            System.out.println("��3����ѯ������Ϣ");
            System.out.println("��4��Ԥ����Ʊ");
            System.out.println("��5����Ʊ");
            System.out.println("��6���˳�ϵͳ");

            if (sc.nextInt()==1)
            {
              /*  private String  id;
                private  String flightid;
                private  String planeType;//����
                 private  String currentseatsnum;//Ŀǰ��λ��
                private  String startairport; //��ɻ���
                private  String arrivalairport;//�������
                private  String starTime; //��ʼʱ��

               */
                String id= UUID.randomUUID().toString();
                id.replaceAll("-","");
                System.out.print("����ţ�");
                String flightid=sc.next();
                System.out.print("���ͣ�");
                String planeType=sc.next();
                System.out.print("Ŀǰ��λ����");
                String currentseatsnum=sc.next();
                System.out.print("��ɻ�����");
                String startairport=sc.next();
                System.out.print("Ŀ�Ļ�����");
                String arrivalairport=sc.next();
                System.out.print("���ʱ�䣺");
                String starTime=sc.next();

                Flight flight = new Flight(flightid,planeType,currentseatsnum,startairport,arrivalairport,starTime);
                IFlightService iFlightService =new FlightServiceImpl();
                iFlightService.insertFlight(flight);
            }
            else if (sc.nextInt()==6)
            {
                System.out.println("ϵͳ�˳���");
                break;
            }
        }
    }
}
