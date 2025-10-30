package Singleton;

public class Database {

    public static Database instance = null;
    private Database(){}

    public static Database getInstance(){
        if(instance==null){
            instance = new Database();
        }
        return instance;
    }
}
