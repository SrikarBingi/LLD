package interfaces;

public class Human extends Mammal implements Omnivore{

    @Override
    public void eatPlant() {
        // TODO Auto-generated method stub
        System.out.println("Human eats plants");
    }

    @Override
    public void eatAnimal() {
        // TODO Auto-generated method stub
        System.out.println("Human also eat meat");
    }

}
