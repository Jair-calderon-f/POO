package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"ene","feb","mar","abr","mayo","jun","jul","ago","sep","oct","nov","dis"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("model.Doctor");
                    response=0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    public static void showPatientMenu(){
        int response = 0;
        do {

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i <4 ; i++) {
                        System.out.println(i+". "+ MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
    private static void  authUser(int userType){
        //userType==1  es doctor
        //userType==2 es paciente
        ArrayList<Doctor>doctors= new ArrayList<>();
        doctors.add(new Doctor("aljandro","alejandro@gamil.com"));
        doctors.add(new Doctor("fermin","fermin@gamil.com"));
        doctors.add(new Doctor("lorena","lorena@gamil.com"));

        ArrayList <Patient>patients=new ArrayList<>();
        patients.add(new Patient("zara","zara@gamil.com"));
        patients.add(new Patient("hanna","hanna@gamil.com"));
        patients.add(new Patient("maria","maria@gamil.com"));
        boolean emailCorrect=false;
        do{
            System.out.println("insert your email: [@gmail.com]");
            Scanner sc= new Scanner(System.in);
            String email=sc.nextLine();
            if(userType==1) {
                for (Doctor d:doctors) {
                    if(d.getEmail().equals(email)){
                        emailCorrect=true;
                        //obtener datos del usuario
                        doctorLogged=d;
                        //show doctor menu

                    }
                }
            }else if(userType==2){
                for (Patient p:patients) {
                    if(p.getEmail().equals((email))){
                        emailCorrect=true;
                        //obtener datos del paciente
                        patientLogged=p;
                        //show pathien menu
                    }
                }
            }
        }while (emailCorrect==true);
    }
}
