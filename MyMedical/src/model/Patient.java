package model;

public class Patient extends User{
    //atrivutaos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

     public Patient(String name, String email){
         super(name, email);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight+"KG";
    }

    public String getHeight() {
         return this.height+"MTS";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "model.Patient{" +
                "birthday='" + birthday + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", blood='" + blood + '\'' +
                '}';
    }
}
