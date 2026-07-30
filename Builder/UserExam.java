package Builder;

public class UserExam {

    private int english;
    private int maths;
    private int science;

    private UserExam(Builder builder) {
        this.english = builder.english;
        this.maths = builder.maths;
        this.science = builder.science;
    }

    @Override
    public String toString() {
        return "UserExam [english=" + english +
                ", maths=" + maths +
                ", science=" + science + "]";
    }

    public static class Builder{

        private int english;
        private int maths;
        private int science;

        public Builder maths(int maths){
            if(maths<0 || maths>100){
                throw new IllegalArgumentException("Maths marks should be between 0 and 100");
            }
            this.maths=maths;
            return this;
        }
        public Builder english(int english) {
            if (english < 0 || english > 100) {
                throw new IllegalArgumentException("English marks should be between 0 and 100");
            }
            this.english = english;
            return this;
        }
        public Builder science(int science) {
            if (science < 0 || science > 100) {
                throw new IllegalArgumentException("Science marks should be between 0 and 100");
            }
            this.science = science;
            return this;
        }
        public UserExam build() {
            return new UserExam(this);
        }
    }
}