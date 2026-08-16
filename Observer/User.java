package Observer;

public class User implements Observer{
    private String name;

    User(String name) {
        this.name = name;
    }

    @Override
    public void update(String video) {
        System.out.println(name + " received notification: " + video);
    }
}
