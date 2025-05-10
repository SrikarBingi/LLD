package Day1;

public class Animal implements Eatable{
    String name;
    String color;
    int age;

    void sayName(){
        System.out.println("My name is : "+name);
    }

    @Override
    public void eat(){
        System.out.println("Animal eats");
    }
}
