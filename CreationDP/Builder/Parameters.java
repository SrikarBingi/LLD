package Builder;

public class Parameters {

    private int english;
    private int maths;
    private int science;

    public Parameters() {
    }

    public Parameters(int english, int maths, int science) {
        setEnglish(english);
        setMaths(maths);
        setScience(science);
    }

    public void setEnglish(int english) {
        if (english < 0 || english > 100)
            throw new IllegalArgumentException("English marks should be between 0 and 100");
        this.english = english;
    }

    public void setMaths(int maths) {
        if (maths < 0 || maths > 100)
            throw new IllegalArgumentException("Maths marks should be between 0 and 100");
        this.maths = maths;
    }

    public void setScience(int science) {
        if (science < 0 || science > 100)
            throw new IllegalArgumentException("Science marks should be between 0 and 100");
        this.science = science;
    }

    public int getEnglish() {
        return english;
    }

    public int getMaths() {
        return maths;
    }

    public int getScience() {
        return science;
    }
}