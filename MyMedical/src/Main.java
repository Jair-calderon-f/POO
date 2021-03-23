import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
       //ui.UIMenu.showMenu();
        Doctor myDoctor= new Doctor("jair Calderon","jair@gamil.com");
       // System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality);

        myDoctor.availableAppointment(new Date(),"4pm");
        myDoctor.availableAppointment(new Date(),"10pm");
        myDoctor.availableAppointment(new Date(),"1pm");
        System.out.println(myDoctor);

        User user=new Doctor("lalo","lalo@gmail.com");
        user.showDataUser();
        System.out.println("======================================");
        User userP=new Patient("lalo","lalo@gmail.com");
        userP.showDataUser();
        System.out.println("============================");
        

        /*for (model.Doctor.AvailableAppointment available:myDoctor.getAvailableAppointments()) {
            System.out.println(available.getDate()+"  "+available.getTime());
        }


        
        Patient p= new Patient("ROSA","rosa@gmail.com");
        System.out.println(p);

         */
    }
}
