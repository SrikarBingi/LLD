package Builder;

public class Application {
    
    public static void main(String[] args) {
        
        UserExam exam = new UserExam.Builder()
                .english(90)
                .science(83)
                .maths(99)
                .build();
        System.out.println(exam);
    }
}
