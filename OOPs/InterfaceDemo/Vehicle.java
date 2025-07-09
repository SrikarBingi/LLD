package InterfaceDemo;

public interface Vehicle {
    void start();
    void stop();
    default void restart(){
        logRestart();
    }
    private void logRestart(){
        System.out.println("vehicle restarted");
    }
}
