package solidprinciples;

public class TestNaive {
    public static void main(String[] args) {
        System.out.println("=== NAIVE APPROACH ===\n");
        
        BirdNaive pigeon = new BirdNaive("Pigeon");
        pigeon.eat();
        pigeon.makeSound();
        pigeon.fly();
        System.out.println();
        
        BirdNaive penguin = new BirdNaive("Penguin");
        penguin.eat();
        penguin.makeSound();
        penguin.fly(); // Problem: fly() method but penguin cant fly
        System.out.println();
        
        BirdNaive crow = new BirdNaive("Crow");
        crow.fly();
    }
}

