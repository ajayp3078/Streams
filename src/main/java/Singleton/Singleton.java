package Singleton;

public class Singleton {
    public static void main(String[] args) {
//        Abc obj1 = new Abc();
        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance();
    }
}
class Abc {
//    To make class singleton
    // 1) make static object / create static instance of class
    // 2) private constructor
    // 3) create static method

    static Abc obj = new Abc();
    private Abc(){};
    public static Abc getInstance(){
        return obj;
    }
}
