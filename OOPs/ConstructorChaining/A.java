package ConstructorChaining;

public class A {
    int a;
    private int b;

    public A(){
        System.out.println("A");
        this.a=1;
        this.b=2;
    }

    public A(String name){
        this.a=1;
        // this();
        System.out.println("constructor of A"+name);
    }
}
