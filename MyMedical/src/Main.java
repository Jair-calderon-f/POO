import javax.print.Doc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //UIMenu.showMenu();
        Doctor myDoctor= new Doctor("jair Calderon","enfermero");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient p= new Patient("ROSA","rosa@gmail.com");
        p.setWeight(56.6);
        System.out.println(p.getWeight());

        p.setPhoneNumber("12345678");
    }
}
