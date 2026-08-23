package Inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        // instructor.name = "Naman";
        instructor.setName("Naman");
        // instructor.description = "Super cool!!";
        instructor.setDescription("Super Cool !!");

        User user = new User();
        // user.name = "Srikar";
        user.setName("Srikar");

        Mentor mentor = new Mentor();
        // mentor.name="Arpit";
        mentor.setName("Arpit");
        // mentor.email = "arpit1@gmail.com";
        mentor.setEmail("arpit1@gmail.com");

    }
}
