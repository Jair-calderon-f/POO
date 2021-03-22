import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //arivutos
    private String speciality;

    //comportamientos


    Doctor(String name, String email){
        super(name, email);
        System.out.println("nombre de doctor es:"+name);
        this.speciality=speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment>availableAppointments=new ArrayList<>();
    public void availableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }
    public ArrayList<AvailableAppointment>getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "speciality='" + speciality + '\'' +
                ", availableAppointments=" + availableAppointments.toString() +
                '}';
    }

    public static class AvailableAppointment{
        private int td_availableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getTd_availableAppointment() {
            return td_availableAppointment;
        }

        public void setTd_availableAppointment(int td_availableAppointment) {
            this.td_availableAppointment = td_availableAppointment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "AvailableAppointment{" +
                    "td_availableAppointment=" + td_availableAppointment +
                    ", date=" + date +
                    ", time='" + time + '\'' +
                    '}';
        }
    }
}
