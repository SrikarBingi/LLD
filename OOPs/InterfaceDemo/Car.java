package InterfaceDemo;

public class Car implements Vehicle{

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Car started ");
        // throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }
    // void restart() {
    //     System.out.println("Car restarted");
    // }

   
}
