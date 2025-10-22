package IntrotoOOP;

public class Main {
    public static void main(String[] args) {
        Student srikar = new Student();
        srikar.name="Srikar Bingi";
        srikar.address="HYD";
        srikar.state="Active";
        srikar.pauseCourse();
        System.out.println(srikar.state);
    }
}
