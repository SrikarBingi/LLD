package AbstractClasses;

import java.util.List;

public class Main {

    public static void changePasswordOfAllUsers(List<User> users){
        for(User user:users){
            user.changeEnail();

            if(user instanceof Student){
                System.out.println("i am a student");
                Student student = (Student) user;
                student.changeBatch();
            }
        }
    }
    public static void main(String[] args) {
        User u = new TA();
        User u1 = new Student();
        User u2 = new Mentor();

        // User u3 = new User();

        // u.expertise="java"; error because u is of type User
        List<User> users = List.of(
            u,
            u1,
            u2,
            // u3,
            new Student(),
            new Mentor()
        );

        changePasswordOfAllUsers(users);
    }
}
