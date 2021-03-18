import javax.print.Doc;
import java.util.Scanner;
//import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {
        Doctor MyDoctor= new Doctor();
        MyDoctor.name="jair Calderon";
        MyDoctor.showName();
        MyDoctor.showId();
        System.out.println(Doctor.id);

        Doctor.id++;

        Doctor myDoctorAnn= new Doctor();
        myDoctorAnn.showId();
        System.out.println(Doctor.id);

      //showMenu();
    }
}
