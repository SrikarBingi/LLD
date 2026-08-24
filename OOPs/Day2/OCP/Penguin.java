package Day2.OCP;

public class Penguin extends Bird{

    @Override
    void fly() {
        // TODO Auto-generated method stub
        // System.out.println("can't fly");

        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

}
