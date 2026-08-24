package Prototype;

public abstract class Bird implements BirdClone{

    protected String color;
    protected int wings;
    protected boolean canFly;

    public Bird(){

    }

    // Copy Constructor
    public Bird(Bird other) {
        this.color = other.color;
        this.wings = other.wings;
        this.canFly = other.canFly;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "color='" + color + '\'' +
                ", wings=" + wings +
                ", canFly=" + canFly +
                '}';
    }

}
