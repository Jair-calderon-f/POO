public class Doctor {
    static int id=0; //auutoincrement
    String name;
    String speciality;
    //comportamientos
    Doctor(){
        System.out.println("construyendo el objeto Doctor ");
        id++;
    }

    Doctor(String name){
        System.out.println("nombre de doctor es:"+name);
    }
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("el id es :"+id);
    }
}
