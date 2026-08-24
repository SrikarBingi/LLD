package Day1;

public class Client {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "Srikar";
        a.age = 21;
        a.color = "Yellow";

        Dog d = new Dog();
        d.name = "Bhairav";
        d.age = 6;
        d.breed = "Lab";
        d.bark();
        d.sayName();



        //dog is a animal so it will work
        // a=d;

        // Animal is not dog
        // d=a;
        // System.out.println();

    }
}
