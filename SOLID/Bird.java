package SOLID;

public abstract class Bird {

    protected String type;
    protected FlyBehavior flyBehavior;
    protected SwimBehavior swimBehavior;
    protected SoundBehavior soundBehavior;
    
    public Bird(String type) {
        this.type = type;
    }

    public void eat(){
        System.out.println(type+" is eating");
    }
    
}
