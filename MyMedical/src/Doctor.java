public class Doctor {
    static int id=0; //auutoincrement
    String name;
    String speciality;
    String  email;
    //comportamientos
    Doctor(){
        System.out.println("construyendo el objeto Doctor ");

    }

    Doctor(String name, String speciality){
        System.out.println("nombre de doctor es:"+name);
        id++;
        this.name=name;
        this.speciality=speciality;
    }
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("el id es :"+id);
    }
}
