package Abstraction;

public class Test{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sayHello();

        // I can also write
        Animal dogs = new Dog();
        dogs.sayHello();

        Cat cat = new Cat();
        cat.sayHello();
    }
}
