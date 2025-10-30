package SOLID;

public class BirdApp {
    public static void main(String[] args) {
        // Bird pigeon = new Bird("pigeon", true, false);
        // Bird crow = new Bird("crow", true, false);
        // Bird sparrow = new Bird("sparrow", true, false);
        // Bird ostrich = new Bird("ostrich", false, false);
        // Bird penguin = new Bird("Penguin", false, true);
        
        // pigeon.fly();
        // pigeon.eat();
        // pigeon.makeSound();
        // pigeon.swim();

        Bird pigeon = new Pigeon();
        pigeon.eat();
    }
}
