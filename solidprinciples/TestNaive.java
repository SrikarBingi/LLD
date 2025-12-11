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

/*
After SRP — Improvements:

1. Each bird class has only one responsibility → its own behavior
2. No long if–else chains
3. Penguin does NOT have a fly() method → clear interface separation
4. Code is easy to read and understand
5. Each bird can be tested independently

Still Problems:

1. Crow and Sparrow have duplicate fly() code
2. When adding a new flying bird, we need to rewrite fly() again
3. We still cannot share common flying behavior
4. We are not fully using polymorphism

Next Step: Apply OCP (Open/Closed Principle)

We will solve these problems using OCP.

OCP Definition:

"Software entities should be OPEN for extension but CLOSED for modification."

Meaning:

You should be able to add new features (open for extension)

Without modifying existing classes (closed for modification)

When to Apply OCP?

Apply OCP when:

You are modifying existing code every time you add new functionality

When adding a new type requires multiple changes across the system

When you have many if–else or switch statements

Solution:

Use Interfaces + Abstraction to enable extension without modification.
 */


/*
After OCP — Improvements:
1. We can add new birds without modifying existing classes
2. Interface-based design makes the system flexible
3. Flying birds can be identified easily (using the Flyable interface)
4. Full polymorphism benefits — we can use a Flyable[] array

Still Problems:
1. Crow and Sparrow still have duplicate fly() code
2. We still cannot share common flying behavior
3. We cannot call fly() using a Bird_OCP reference (requires type-casting)

Next: With LSP we will fix the parent-child relationship...
*/


// ============================================
// STEP 4: LSP — Liskov Substitution Principle
// ============================================

/*
LSP Definition:
"A child class should be substitutable for its parent class without breaking functionality."
"A child class must replace the parent class without causing issues."

When should we apply LSP?
- When the child class breaks or violates the behavior of the parent
- When we rely heavily on type checking (instanceof)
- When a parent reference cannot be used with child objects
- When a child doesn’t follow the parent’s contract (throws unexpected exceptions)

Problem in the Previous Design:
We have a Bird_OCP base class, but it does NOT contain fly() behavior.
So a Bird_OCP reference cannot guarantee flying behavior.

Solution:
Create proper abstractions that correctly represent the parent–child relationship.
*/