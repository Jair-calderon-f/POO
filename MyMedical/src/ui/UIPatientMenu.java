package ui;

import java.util.Scanner;

public class UIPatientMenu {
    public static void showPatientMenu(){
        int response=0;
        do{
            System.out.println();
            System.out.println("patient");
            System.out.println("Welcome patient : "+UIMenu.patientLogged);
            System.out.println("1) book an appointment");
            System.out.println("2) My Appointment");
            System.out.println("0) Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    break;
            }

        }while (response !=0);
    }
    private static void showBookAppointmentMenu(){
        int response=0;
        do{
            System.out.println("::Book an apoinment" );
            System.out.println("::select date:");
            
        }while(response!=0);
    }
}
