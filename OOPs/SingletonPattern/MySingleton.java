package SingletonPattern;

public class MySingleton {

    private static MySingleton instance;

    private MySingleton() {
        System.out.println("Singleton instance created");
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}