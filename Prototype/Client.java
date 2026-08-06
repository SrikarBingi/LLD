package Prototype;

public class Client {
    public static void main(String[] args) {
        
        Bird sparrow = new Sparrow();
        Bird clone = sparrow.cloneBird();

        clone.setColor("White");

        System.out.println("Original : " + sparrow);
        System.out.println("Clone    : " + clone);
        
    }
}
