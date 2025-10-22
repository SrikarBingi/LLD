package IntrotoOOP;

public class Student {
    String name;
    String address;
    String batch;
    String email;
    String state;
    double psp;

    void changeBatch(String batch){
        this.batch = batch;
    }
    void pauseCourse(){
        this.state="PAUSED";
    }
}
