package Day1;

public class Dog extends Animal{
    String breed;
    String hairColor;

    void bark(){
        System.out.println("Bhow bhow");
    }

    void sayName(){
        super.sayName();
        System.out.println("Bhow bhow saying "+name);
    }
}
