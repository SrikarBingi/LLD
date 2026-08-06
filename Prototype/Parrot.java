package Prototype;

public class Parrot extends Bird{

    public Parrot() {
        color = "Green";
        wings = 2;
        canFly = true;
    }

    public Parrot(Parrot other) {
        super(other);
    }

    @Override
    public Bird cloneBird() {
        return new Parrot(this);
    }

}
