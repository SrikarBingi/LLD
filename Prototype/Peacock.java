package Prototype;

public class Peacock extends Bird{

    public Peacock() {
        color = "Blue";
        wings = 2;
        canFly = false;
    }

    public Peacock(Peacock other) {
        super(other);
    }

    @Override
    public Bird cloneBird() {
        return new Peacock(this);
    }

}
