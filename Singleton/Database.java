package Singleton;

public class Database {

    public static Database instance = new Database();
    private Database(){}

    public static Database getInstance(){
        // if(instance==null){
        //     instance = new Database();
        // }
        return instance;
    }
}
