package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {
    public static  ArrayList<Doctor> doctorsAvailablesAppointsments=new ArrayList<>();
    public static void showDoctorMenu(){

        int response=0;
        do{
            System.out.println("Hola doctor");
            System.out.println("welcome"+UIMenu.doctorLogged.getName());
            System.out.println("1) add available Apponintment");
            System.out.println("2) My Scheduled  Apponintments ");
            System.out.println("0) Logout ");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while (response !=0);
    }
    private  static void showAddAvailableAppointmentsMenu(){
        int response =0;
        do{
            System.out.println();
            System.out.println("::Add A vailable Apointment");
            System.out.println(":: select a month");
            for (int i = 1; i <12 ; i++) {
                int j= i+1;
                System.out.println(j+"."+UIMenu.MONTHS[i]);
            }
            System.out.println("0) return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if(response>0 && response<13){
                int monthSelected=response;
                System.out.println(monthSelected+". "+UIMenu.MONTHS[monthSelected]);
                System.out.println("insert to date  available :[dd/mm/yyyy] ");
                String date=sc.nextLine();

                System.out.println("your date is "+date+ "1. correct 2. change date");
                int responseData=Integer.valueOf(sc.nextLine());
                if(responseData ==2)continue;

                int responseTime;
                String time="";
                do{
                    System.out.println("insert the available date"+date+"[06:00]");
                    time=sc.nextLine();
                    System.out.println("your time is:" +time+"1) correct   2)change tipe");
                    responseTime=Integer.valueOf(sc.nextLine());
                }while (responseTime==2);
                UIMenu.doctorLogged.availableAppointment(date,time);
            }else if (response ==0){
                showDoctorMenu();
            }
        }while (response !=0);
    }
    private static void checkDoctorAvailableAppoinments(){
        if(doctor.getcx)
    }
}
