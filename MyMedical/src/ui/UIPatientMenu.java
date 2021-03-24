package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu(){
        int response=0;
        do{
            System.out.println();
            System.out.println("patient");
            System.out.println("Welcome patient : "+UIMenu.patientLogged.getName());
            System.out.println("1) book an appointment");
            System.out.println("2) My Appointment");
            System.out.println("0) Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointment();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response !=0);
    }
    private static void showBookAppointmentMenu(){
        int response=0;
        do{
            System.out.println("::Book an apoinment" );
            System.out.println("::select date:");
            //la numeracion de lista de fechas
            //inidce de la fecha selecionada
            //[doctors]
            //1.-doctor1
                //-1 fecha 1
                //-2 fecha 2
            //doctor2
            //doctor3
            Map<Integer, Map<Integer, Doctor>>doctors= new TreeMap<>();
            int k=0;
            for (int i = 0; i <UIDoctorMenu.doctorsAvailablesAppointsments.size() ; i++) {
                ArrayList<Doctor.AvailableAppointment>availableAppointments=
                        UIDoctorMenu.doctorsAvailablesAppointsments.get(i).getAvailableAppointments();
                Map<Integer, Doctor> doctorAppointments= new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k+". "+availableAppointments.get(i).getDate());
                    doctorAppointments.put(Integer.valueOf(j),UIDoctorMenu.doctorsAvailablesAppointsments.get(i));
                    doctors.put(Integer.valueOf(k),doctorAppointments);
                }
            }

            Scanner sc = new Scanner(System.in);
            int responseDateSelecte = Integer.valueOf(sc.nextLine());
            Map<Integer,Doctor>doctorAbailableSelected=doctors.get(responseDateSelecte);
            Integer indexDate=0;
            Doctor doctorSelected= new Doctor("","");
            for (Map.Entry<Integer,Doctor> doc: doctorAbailableSelected.entrySet()) {
                indexDate=doc.getKey();
                doctorSelected=doc.getValue();
            }
            System.out.println(doctorSelected.getName()+
                    ". date"+ doctorSelected.getAvailableAppointments().get(indexDate).getDate()+
                    ". time"+ doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("confirm your appointment: 1)yes 2)cahnage data");
            response=Integer.valueOf(sc.nextLine());
            if(response==1){
                UIMenu.patientLogged.addAppointmentDoctors(
                doctorSelected,doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());
                showPatientMenu();

            }
        }while(response!=0);
    }

    private static  void showPatientMyAppointment(){
        int response =0;
        do{
            System.out.println(":: My Appointments");
            if(UIMenu.patientLogged.getAppointmentDoctors().size()==0){
                System.out.println("don't have appointment");
                break;
            }
            for (int i = 0; i < UIMenu.patientLogged.getAppointmentNurses().size(); i++) {
                int j=i+1;
                System.out.println(j+". "+
                        "DATE: "+UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate()+
                        " TIME :"+UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime()+
                        "DOCTOR:"+UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());
            }
            System.out.println("0. return ");
        }while (response !=0);

    }
}
