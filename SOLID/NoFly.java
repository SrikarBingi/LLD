package SOLID;

public class NoFly implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Cannot fly");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

}
