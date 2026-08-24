package StructuralDP.Decorator;

public class Client {
    public static void main(String[] args) {
        
        Coffee coffee = new BasicCoffee();

        coffee = new SugarDecorator(coffee);

        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
