package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //arivutos
    private String speciality;

    //comportamientos


    public Doctor(String name, String email){
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
    public void availableAppointment(String  date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }
    public ArrayList<AvailableAppointment>getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return "model.Doctor{" +
                "speciality='" + speciality + '\'' +
                ", availableAppointments=" + availableAppointments.toString() +
                '}';
    }

    @Override
    public void showDataUser() {
        System.out.println(" empleado de hospital: crus roja");
        System.out.println("departamento: cancerolgogia");

    }

    public static class AvailableAppointment{
        private int td_availableAppointment;
        private Date date;
        private String time;
        SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
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

        public String getDate(String date) {
            return format.format(date);
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
