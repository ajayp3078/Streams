package Abstraction;

public abstract class Animal {

    private int age;
    private String name;

    public abstract void sayHello();

    public void sleep(){
        System.out.println("zzz...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
abstract class contains abstract as well as non-abstract methods
If we are extending the abstract class then only abstract methods needs to be implemented
We cannot create an object of abstract class and hence cannot be instantiated
 */