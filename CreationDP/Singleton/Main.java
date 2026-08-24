package Singleton;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        System.out.println(db1);
        System.out.println(db2);

        // RandomClass randomClass = new RandomClass();
        // RandomClass randomClass2 = new RandomClass();
    }
}
