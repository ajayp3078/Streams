class Human{
     private int age = 26;
     private String name = "Ajay";
     private String address;

     public int getAge(){
         return age;
     }

     public String getName(){
         return name;
     }

     public void setAddress(String s){
         address = s;
     }

    public String getAddress(){
        return address;
     }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());

        obj.setAddress("Pune");
        System.out.println(obj.getAddress());

    }
}
