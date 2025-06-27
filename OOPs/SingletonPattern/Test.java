package SingletonPattern;

public class Test {
    public static void main(String[] args) {
        MySingleton obj1 = MySingleton.getInstance();
        MySingleton obj2 = MySingleton.getInstance();

        System.out.println(obj1 == obj2);  // ✅ true (same object)
    }
}
