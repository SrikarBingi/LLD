package Overriding;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.makeSound();
        a1.eat();
        a2.makeSound();
        a2.eat();
    }
}
