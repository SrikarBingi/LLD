package Overriding;

public class Dog extends Animal{
    void makeSound(){
        super.makeSound(); // prints super class method
        System.out.println("Dog barks");
    }
}
