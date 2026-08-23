package ConstructorChaining;

public class B extends A{
    private int c;
    public B(){
        super("srikar");
        System.out.println("Constructor of B");
        // this.a=12; use either protected or public for a or if we use private use public getters and setters
        this.c=4;
    }
}
