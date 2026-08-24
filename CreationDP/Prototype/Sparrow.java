package Prototype;

public class Sparrow extends Bird{

    public Sparrow() {
        color = "Brown";
        wings = 2;
        canFly = true;
    }

    public Sparrow(Sparrow other) {
        super(other);
    }

    @Override
    public Bird cloneBird() {
        return new Sparrow(this);
    }

}
