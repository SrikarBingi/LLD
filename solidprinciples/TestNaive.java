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

/*
PROBLEMS with Naive Approach:
1. If-else chains 
2. to add new bird  fly(), makeSound() should be modifies
3. Penguin, Ostrich exposes fly() method (confusing)
4. Crow, Sparrow fly in same way but not mentioned in code
5. Testing becomes tough
6. Code duplication

we have to apply solid principles to overcome these
*/


// SRP

/*
SRP Definition:
"A class should have only ONE reason to change"
"A class should have only one responsibility."

When should we apply SRP?
- When a class is doing many different things
- When a class has multiple reasons to change
- When the methods inside a class are not related to each other

What we will do now:
- Create a separate class for each bird type
- Each class will handle its own behavior
*/